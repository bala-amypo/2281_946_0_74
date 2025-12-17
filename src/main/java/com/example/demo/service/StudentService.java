package com.example.demo.service;

import java.util.List;


import com.example.demo.entity.Student;


public interface StudentService {
  
    Student createData(Student stu);
    List<Student> fetchrecord();
    
}