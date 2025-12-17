package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentService {
  @Autowired
  StudentRepo repo;
    public Student createData(Student stu) {
      return repo.save(stu);
    }
    public List<Student> fetchrecord(){
      return repo.findAll();
    }
  }