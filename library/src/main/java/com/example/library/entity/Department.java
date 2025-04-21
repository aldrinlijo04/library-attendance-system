package com.example.library.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int deptID;

    private String deptName;
    private String deptFull;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<Users> users;
}
