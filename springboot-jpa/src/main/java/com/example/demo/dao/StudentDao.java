package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Student;

@Component
public interface StudentDao extends JpaRepository<Student, Integer>{

}
