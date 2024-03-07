package com.example.model.entity;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class LectureApplicants {
    private Long id;
    private Long lectureCourseId;
    private Long studentId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
