package com.example.service;

import com.example.model.entity.Attendance;
import com.example.repository.AttendanceMapper;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AttendanceService {
    @Autowired
    AttendanceMapper attendanceMapper;

    public String attendance(Long lectureCourseId,Long studentId ){
        boolean duplicateAttendance = attendanceMapper.isDuplicateAttendance(lectureCourseId, studentId);
        if(BooleanUtils.isTrue(duplicateAttendance)){
            return "출석체크를 이미 하였습니다.";
        }

        Attendance attendance = Attendance.builder()
                .lectureCourseId(lectureCourseId)
                .studentId(studentId)
                .createdAt(LocalDateTime.now())
                .build();

        attendanceMapper.addAttendance(attendance);

        return "출석체크가 완료되었습니다.";
    }
}
