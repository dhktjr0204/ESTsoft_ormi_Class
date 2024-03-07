package com.example.repository;

import com.example.model.dto.LectureCourseDetail;
import com.example.model.dto.LectureCourseInfo;
import com.example.model.entity.LectureApplicants;
import com.example.model.entity.LectureCourse;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface LectureMapper {

    List<LectureCourseInfo> selectLectureCourseInfos();

    List<LectureCourseDetail> selectLectureCourseDetails(Map<String, Object> params);

    void saveLectureCourse(LectureCourse lectureCourse);

    void updateInstructorLectureCourse(@Param("id") Long id, @Param("instructorId") Long instructorId);

    boolean validateLecture(Long id);

    void registerLecture(LectureApplicants lectureApplicants);
}