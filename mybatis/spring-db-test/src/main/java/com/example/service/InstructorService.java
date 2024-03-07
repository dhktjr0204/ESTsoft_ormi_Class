package com.example.service;

import com.example.model.entity.Instructor;
import com.example.repository.InstructorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class InstructorService {
    @Autowired
    private InstructorMapper instructorMapper;

    public void saveInstructor(String name, boolean left, String desc){
        Instructor instructor = Instructor.builder()
                .name(name)
                .left(left)
                .desc(desc)
                .createdAt(LocalDateTime.now())
                .build();
        instructorMapper.saveInstructor(instructor);
    }
}
