package com.example.controller;

import com.example.model.dto.LectureCourseDetail;
import com.example.model.dto.LectureCourseInfo;
import com.example.model.entity.LectureCourse;
import com.example.service.LectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class LectureController {
    @Autowired
    private LectureService lectureService;

    @GetMapping("/lecture")
    public List<LectureCourseInfo> getLecture() {
        return lectureService.getLectureCourseInfo();
    }

    @GetMapping("/lecture/details")
    public List<LectureCourseDetail> getListOfStudentName(@RequestParam Map<String, Object> params) {
        return lectureService.getLectureCourseDetails(params);
    }

    @PostMapping("/lecture")
    public String saveLecture(@RequestBody LectureCourse lectureCourse){
        return lectureService.saveLectureCourse(lectureCourse);
    }

    @PutMapping("/lecture")
    public String updateLecture(@RequestParam Long id, @RequestParam Long instructorId){
        return lectureService.updateInstructorLectureCourse(id, instructorId);
    }

    @PostMapping("/register")
    public String registerLecture(@RequestParam Long lectureCourseId, @RequestParam Long studentId){
        return lectureService.registerLecture(lectureCourseId,studentId);
    }
}