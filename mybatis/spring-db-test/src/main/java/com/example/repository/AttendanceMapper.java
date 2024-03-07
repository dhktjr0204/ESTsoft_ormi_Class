package com.example.repository;

import com.example.model.entity.Attendance;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AttendanceMapper {

    boolean isDuplicateAttendance(@Param("lectureCourseId") Long lectureCourseId, @Param("studentId") Long studentId);

    void addAttendance(Attendance attendance);
}
