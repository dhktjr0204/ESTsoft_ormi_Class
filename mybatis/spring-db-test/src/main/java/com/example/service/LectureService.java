package com.example.service;

import com.example.model.dto.InstructorInfo;
import com.example.model.dto.LectureCourseDetail;
import com.example.model.dto.LectureCourseInfo;
import com.example.model.entity.LectureApplicants;
import com.example.model.entity.LectureCourse;
import com.example.repository.InstructorMapper;
import com.example.repository.LectureMapper;
import com.example.repository.StudentMapper;
import org.apache.commons.lang3.BooleanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Service
public class LectureService {
    @Autowired
    private LectureMapper lectureMapper;
    @Autowired
    private InstructorMapper instructorMapper;
    @Autowired
    private StudentMapper studentMapper;

    public List<LectureCourseInfo> getLectureCourseInfo() {
        return lectureMapper.selectLectureCourseInfos();
    }

    public List<LectureCourseDetail> getLectureCourseDetails(Map<String, Object> params) {
        return lectureMapper.selectLectureCourseDetails(params);
    }

    public String saveLectureCourse(LectureCourse responseLectureCourse) {

        InstructorInfo instructor =
                instructorMapper.validateInstructor(responseLectureCourse.getInstructorId());

        boolean existsInstructor = instructor.isExist();
        if (BooleanUtils.isFalse(existsInstructor)) {
            return "존재하지 않은 강사님입니다.";
        }

        if (instructor.getLectureCount() > 2) {
            return "해당 강사님은 더이상 강의를 담당할 수 없습니다.";
        }

        LectureCourse lecture = LectureCourse.builder()
                .title(responseLectureCourse.getTitle())
                .instructorId(responseLectureCourse.getInstructorId())
                .capacity(responseLectureCourse.getCapacity())
                .desc(responseLectureCourse.getDesc())
                .from(responseLectureCourse.getFrom())
                .to(responseLectureCourse.getTo())
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();

        lectureMapper.saveLectureCourse(lecture);

        return "강의를 생성하였습니다.";
    }

    public String updateInstructorLectureCourse(Long id, Long instructorId) {
        InstructorInfo instructor =
                instructorMapper.validateInstructor(instructorId);

        boolean existsInstructor = instructor.isExist();

        if (BooleanUtils.isFalse(existsInstructor)) {
            return "존재하지 않은 강사ID입니다.";
        }

        if (instructor.getLectureCount() >= 2) {
            return "해당 강사님은 더이상 강의를 담당할 수 없습니다.";
        }


        lectureMapper.updateInstructorLectureCourse(id, instructorId);

        return "강의를 수정하였습니다.";
    }

    public String registerLecture(Long lectureCourseId, Long studentId) {
        boolean existsStudent = studentMapper.isExistsStudent(studentId);
        if (BooleanUtils.isFalse(existsStudent)) {
            return "존재하지 않은 학생ID입니다.";
        }

        boolean validateLecture = lectureMapper.validateLecture(lectureCourseId);
        if (BooleanUtils.isFalse(validateLecture)) {
            return "강의가 꽉 찼습니다.";
        }

        LectureApplicants lectureApplicants = LectureApplicants.builder()
                .lectureCourseId(lectureCourseId)
                .studentId(studentId)
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();

        lectureMapper.registerLecture(lectureApplicants);

        return "수강인원이 다 찼습니다.";
    }
}