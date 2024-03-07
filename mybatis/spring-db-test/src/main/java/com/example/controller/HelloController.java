package com.example.controller;

import com.example.repository.StudentJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private StudentJdbcRepository studentJdbcRepository;

    @GetMapping("/hello")
    public int hi(){
        return studentJdbcRepository.countOfStudent();
    }

    @GetMapping("/hello/name/list")
    public List<String> getName(){
        return studentJdbcRepository.getStudentNameList();
    }

    @PostMapping("/hello/name/regist")
    public int saveStudent(@RequestParam String name, @RequestParam Integer age){
        return studentJdbcRepository.insertStudent(name, age);
    }
}
