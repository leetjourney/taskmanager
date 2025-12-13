package com.leetjourney.taskmanager.repository;

import com.leetjourney.taskmanager.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

// @Repository // Not necessary, JpaRepository already has it
public interface TaskRepository extends JpaRepository<Task, Long> {

    // Method Name Query
    // SELECT * FROM tasks WHERE completed = :completed
    List<Task> findByCompleted(boolean completed);

    List<Task> findByTitleContainingIgnoreCase(String title);

    @Query("SELECT t FROM Task t WHERE t.completed = :completed")
    List<Task> findTasksByCompletionStatus(@Param("completed") boolean completed);
}
