package com.lapetina.todo.service;

import com.lapetina.todo.model.Task;
import com.lapetina.todo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Optional<Task> getTaskById(String id) {
        return taskRepository.findById(id);
    }

    @Override
    public List<Task> getDoneTasks() {
        return taskRepository.findByDoneTrue(); // usa o método custom do repository
    }

    @Override
    public void deleteTask(String id) {
        taskRepository.deleteById(id);
    }
}
