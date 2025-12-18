package com.example.demo.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;


@RestController
@RequestMapping("/locations")
public class StudentController {
    
    @Autowired
    StudentService ser;
    
    @PostMapping("/adddata")
    public Student createData(@RequestBody Student stu){
        return ser.createData(stu);
    }

    @GetMapping("/fetche")
    public List<Student> fetchRecord(){
        return ser.fetchRecord();
    }

    @GetMapping("/fetchdatabyid/{email}")
    public Optional<Student> fetchDataById(@PathVariable String email){
        return ser.fetchDataById(email);

    }

    @PutMapping("/updatedata/{id}")
    public String updateDataById(@PathVariable int id,@RequestBody Student stu){
    Optional<Student> student = ser.fetchDataById(id);

    if(student.isPresent()){
     stu.setId(id);
     ser.createData( stu);

     return "Data Updated Successfully";
    }
    else{

        return id+ "not found";
    }

    }

    @DeleteMapping("/deletedata/{id}")
    public String deleteDataById(@PathVariable int id){
    Optional<Student> student = ser.fetchDataById(id);
    if(student.isPresent()){
     ser.deleteData(id);
     return "Data deleted Successfully";
    }
    else{
        return id + "not found";
    }



    }

}
