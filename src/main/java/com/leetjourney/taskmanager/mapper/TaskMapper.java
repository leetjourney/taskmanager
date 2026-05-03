package com.leetjourney.taskmanager.mapper;

import com.leetjourney.taskmanager.dto.CategoryResponse;
import com.leetjourney.taskmanager.dto.TaskRequest;
import com.leetjourney.taskmanager.dto.TaskResponse;
import com.leetjourney.taskmanager.entity.Category;
import com.leetjourney.taskmanager.entity.Task;
import com.leetjourney.taskmanager.service.CategoryService;
import org.springframework.stereotype.Component;

@Component
public class TaskMapper {

    private final CategoryService  categoryService;

    public TaskMapper(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    public Task toEntity(TaskRequest request) {
        Category category = null;
        if (request != null && request.categoryId() != null) {
            category = categoryService.findById(request.categoryId());
        }

        return Task.builder()
                .title(request.title())
                .description(request.description())
                .completed(request.completed() != null ? request.completed() : false)
                .category(category)
                .build();
    }

    public TaskResponse toResponse(Task task) {
        CategoryResponse categoryResponse = null;

        if (task != null && task.getCategory() != null) {
            categoryResponse = CategoryResponse.builder()
                    .categoryId(task.getCategory().getId())
                    .name(task.getCategory().getName())
                    .description(task.getCategory().getDescription())
                    .build();
        }

        return TaskResponse.builder()
                .id(task.getId())
                .title(task.getTitle())
                .description(task.getDescription())
                .completed(task.getCompleted())
                .createdAt(task.getCreatedAt())
                .category(categoryResponse)
                .build();
    }

    public void updateEntityFromRequest(Task task, TaskRequest request) {
        task.setTitle(request.title());
        task.setDescription(request.description());
        task.setCompleted(request.completed());

        if (request.categoryId() != null) {
            task.setCategory(categoryService.findById(request.categoryId()));
        }
    }
}
