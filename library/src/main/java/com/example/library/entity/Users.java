package com.example.library.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Users {
    @Id
    private Long userId;

    private String name;

    public enum UserType {
        Student,
        Staff
    }

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserType type; //Only student or Staff

    @ManyToOne
    @JoinColumn(name = "department_Id")
    private Department department;
}
