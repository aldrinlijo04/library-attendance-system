package com.example.library.controller;

import com.example.library.entity.department;
import com.example.library.service.deptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api/dept")
public class deptController {

    @Autowired
    private deptService deptService;

    //To fetch all the pre-stored departments from db
    @GetMapping("/get")
    public List<department> listDepartments(){
        return deptService.listDept();
    }

    //To delete any dept
    @DeleteMapping("/del/{deptId}")
    public String deleteDept(@PathVariable("deptId") Integer id){
        deptService.delDept(id);
        return "Department deleted successfully";
    }
}
