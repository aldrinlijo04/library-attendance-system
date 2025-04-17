package com.example.library.repository;

import com.example.library.entity.department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface deptRepo extends JpaRepository<department,Integer> {
}
