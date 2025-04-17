package com.example.library.controller;

import com.example.library.entity.users;
import com.example.library.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api/user")
public class userController {
    @Autowired
    private userService userService;

    @PostMapping("/add")
    public ResponseEntity<String> addUsers(@RequestBody users user){
        userService.addUser(user);
        return ResponseEntity.ok("Added Successfully");
    }

    @GetMapping("/get")
    public ResponseEntity<List<users>> displayUsers(){
        return ResponseEntity.ok(userService.getUsers());
    }
}
