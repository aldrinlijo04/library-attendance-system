package com.example.library.controller;

import com.example.library.entity.Users;
import com.example.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/add")
    public ResponseEntity<String> addUsers(@RequestBody Users user) {
        userService.addUser(user);
        return ResponseEntity.ok("User added successfully");
    }

    @GetMapping("/get")
    public ResponseEntity<List<Users>> displayUsers() {
        return ResponseEntity.ok(userService.getUsers());
    }

    @DeleteMapping("/del/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        userService.delUser(id);
        return ResponseEntity.ok("User deleted successfully");
    }
}
