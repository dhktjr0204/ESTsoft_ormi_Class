package com.example.model.entity;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class Instructor {
    private Long id;
    private String name;
    private boolean left;
    private String desc;
    private LocalDateTime createdAt;
}
