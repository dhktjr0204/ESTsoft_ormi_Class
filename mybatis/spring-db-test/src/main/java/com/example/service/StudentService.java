package com.example.service;

import com.example.model.entity.Student;
import com.example.repository.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;

    public void saveStudent(String name, Integer age, String desc){
        Student student = Student.builder()
                .name(name)
                .age(age)
                .desc(desc)
                .createdAt(LocalDateTime.now())
                .build();

        studentMapper.saveStudent(student);
    }

    public void updateStudent(Long id, String name, Integer age){
        studentMapper.updateStudent(id, name,age);
    }
}
