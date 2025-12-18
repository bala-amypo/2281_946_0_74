package com.example.demo.service;

import java.util.*;


import com.example.demo.entity.Student;


public interface StudentService {
  
    Student createData(Student stu);
    List<Student> fetchRecord();
     Optional<Student> fetchDataById(int id);   
     void deleteData(int id);
}