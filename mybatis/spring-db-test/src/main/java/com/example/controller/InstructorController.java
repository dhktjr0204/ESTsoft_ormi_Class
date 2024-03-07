package com.example.controller;

import com.example.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstructorController {
    @Autowired
    private InstructorService instructorService;

    @PostMapping("/instructor")
    public String saveInstructor(@RequestParam String name, @RequestParam boolean left, @RequestParam String desc){
        instructorService.saveInstructor(name, left, desc);
        return "강사 등록이 완료 되었습니다.";
    }
}
