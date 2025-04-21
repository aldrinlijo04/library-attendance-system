package com.example.library.service;

import com.example.library.entity.Department;
import com.example.library.entity.Users;
import com.example.library.repository.DeptRepo;
import com.example.library.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepo userRepo;
    private final DeptRepo deptRepo;

    @Autowired
    public UserService(UserRepo userRepo, DeptRepo deptRepo) {
        this.userRepo = userRepo;
        this.deptRepo = deptRepo;
    }

    public void addUser(Users user){
        Integer deptId = user.getDepartment().getDeptID();
        Optional<Department> deptOpt = deptRepo.findById(deptId);
        if (deptOpt.isPresent()) {
            user.setDepartment(deptOpt.get());
            userRepo.save(user);
        } else {
            throw new RuntimeException("Department not found with ID: " + deptId);
        }

    }

    public List<Users> getUsers(){
        return userRepo.findAll();
    }

    public void delUser(Long id){
        userRepo.deleteById(id);
    }
}
