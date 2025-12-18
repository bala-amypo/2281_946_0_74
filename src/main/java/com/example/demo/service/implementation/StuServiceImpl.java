package com.example.demo.service.implementation;
import java.util.*;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class StuServiceImpl implements StudentService{

    @Autowired
    StudentRepository repo;

    @Override
    public Student createData(Student stu){
        return repo.save(stu);
    }

    @Override
    public List<Student> fetchRecord(){
        return repo.findAll();
    }

   @Override
    public Optional<Student> fetchDataById(int id){
        return repo.findById(id);
    }

    @Override
    public void deleteData(int id){
         repo.deleteById(id); 
    }
}