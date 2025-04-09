package com.lapetina.todo.service;

import com.lapetina.todo.model.Task;

import java.util.List;
import java.util.Optional;

public interface TaskService {

    Task createTask(Task task);

    List<Task> getAllTasks();

    Optional<Task> getTaskById(String id);

    List<Task> getDoneTasks();

    void deleteTask(String id);
}
