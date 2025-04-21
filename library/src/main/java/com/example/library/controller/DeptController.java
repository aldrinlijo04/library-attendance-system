package com.example.library.controller;

import com.example.library.entity.Department;
import com.example.library.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    //To fetch all the pre-stored departments from db
    @GetMapping("/get")
    public ResponseEntity<List<Department>> listDepartments(){
        return ResponseEntity.ok(deptService.listDept());
    }

    //To delete any dept
    @DeleteMapping("/del/{deptId}")
    public ResponseEntity<String> deleteDept(@PathVariable("deptId") Integer id){
        deptService.delDept(id);
        return ResponseEntity.ok("Department deleted successfully");
    }
}
