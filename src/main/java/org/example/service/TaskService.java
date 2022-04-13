package org.example.service;

import org.example.entity.Task;

import java.util.List;

public interface TaskService {
    List<Task> getAll();
    Task save(Task task);
    void delete(int id);
}
