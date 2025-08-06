package com.poramoozi.dashboard.taskmanagement.service;

import com.poramoozi.dashboard.taskmanagement.domain.Task;
//import com.poramoozi.dashboard.base.Repository.TaskRepository;
import org.jspecify.annotations.Nullable;
import org.springframework.data.domain.Pageable;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Clock;
import java.time.LocalDate;
import java.util.List;

@Service
@PreAuthorize("isAuthenticated()")
public class TaskService {

//    private final TaskRepository assigmentRepository;

    private final Clock clock;

    public TaskService(Clock clock) {
        this.clock = clock;
    }

//    TaskService(TaskRepository assigmentRepository, Clock clock) {
//        this.assigmentRepository = assigmentRepository;
//        this.clock = clock;
//    }

    @Transactional
    public void createTask(String description, @Nullable LocalDate dueDate) {
        if ("fail".equals(description)) {
            throw new RuntimeException("This is for testing the error handler");
        }
        var task = new Task();
        task.setDescription(description);
        task.setCreationDate(clock.instant());
        task.setDueDate(dueDate);
//        assigmentRepository.saveAndFlush(task);
    }

//    @Transactional(readOnly = true)
//    public List<Task> list(Pageable pageable) {
//        return assigmentRepository.findAllBy(pageable).toList();
//    }

}
