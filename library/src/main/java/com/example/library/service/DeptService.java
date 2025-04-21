package com.example.library.service;

import com.example.library.entity.Department;
import com.example.library.repository.DeptRepo;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptService {

    @Autowired
    DeptRepo deptRepo;

    //private department dept;
    public List<Department> listDept(){
        return deptRepo.findAll();
    }

    public void delDept(Integer id){
        deptRepo.deleteById(id);
    }

}
