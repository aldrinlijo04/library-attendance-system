package com.example.library.service;

import com.example.library.entity.users;
import com.example.library.repository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {
    @Autowired
    private userRepo userRepo;

    public void addUser(users user){
        userRepo.save(user);
    }

    public List<users> getUsers(){
        return userRepo.findAll();
    }
}
