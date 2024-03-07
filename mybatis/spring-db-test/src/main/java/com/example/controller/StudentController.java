package com.example.controller;

import com.example.model.entity.Student;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/student")
    public String getStudent(@RequestParam String name, @RequestParam Integer age
            , @RequestParam String desc){
        studentService.saveStudent(name, age, desc);

        return "학생 정보가 저장 되었습니다.";
    }

    @PutMapping("/student")
    public String updateStudent(@RequestParam Long id, @RequestParam String name, @RequestParam Integer age){
        studentService.updateStudent(id ,name, age);

        return "학생 정보가 변경 되었습니다.";
    }
}
