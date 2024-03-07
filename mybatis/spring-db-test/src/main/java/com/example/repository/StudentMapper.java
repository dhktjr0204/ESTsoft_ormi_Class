package com.example.repository;

import com.example.model.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;


@Mapper
public interface StudentMapper {
    void saveStudent(Student student);

    void updateStudent(@Param("id") Long id, @Param("name") String name, @Param("age") Integer age);

    boolean isExistsStudent(Long id);
}
