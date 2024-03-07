package com.example.repository;

import com.example.model.dto.InstructorInfo;
import com.example.model.entity.Instructor;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InstructorMapper {
    void saveInstructor(Instructor instructor);

    InstructorInfo validateInstructor(Long id);
}
