package com.example.model.entity;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class Student {
    private Long id;
    private String name;
    private Integer age;
    private String desc;
    private LocalDateTime createdAt;
}
