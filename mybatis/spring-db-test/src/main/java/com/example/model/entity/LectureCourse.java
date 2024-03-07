package com.example.model.entity;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Builder
public class LectureCourse {
    private Long id;
    private String title;
    private Long instructorId;
    private int capacity;
    private LocalDateTime from;
    private LocalDateTime to;
    private String desc;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
