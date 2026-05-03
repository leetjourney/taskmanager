package com.leetjourney.taskmanager.dto;

import com.leetjourney.taskmanager.entity.Category;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record TaskResponse(
        Long id,
        String title,
        String description,
        Boolean completed,
        LocalDateTime createdAt,
        CategoryResponse category
) {
}
