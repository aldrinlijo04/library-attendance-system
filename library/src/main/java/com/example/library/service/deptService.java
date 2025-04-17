package com.example.library.service;

import com.example.library.entity.department;
import com.example.library.repository.deptRepo;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class deptService {

    @Autowired
    deptRepo deptRepo;

    //private department dept;
    public List<department> listDept(){
        return deptRepo.findAll();
    }

    public void delDept(Integer id){
        deptRepo.deleteById(id);
    }

}
