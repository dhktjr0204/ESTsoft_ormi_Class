package com.example.controller;

import com.example.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AttendanceController {
    @Autowired
    AttendanceService attendanceService;


    @PostMapping("/attendance")
    public String attendace(@RequestParam("lectureCourseId") Long lectureCourseId, @RequestParam("studentId") Long studentId){
        String result = attendanceService.attendance(lectureCourseId, studentId);
        return result;
    }
}
