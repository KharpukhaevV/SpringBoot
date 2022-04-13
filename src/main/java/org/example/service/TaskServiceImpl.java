package org.example.service;

import org.example.entity.Task;
import org.example.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public List<Task> getAll() {
        return taskRepository.findAll(Sort.by(Sort.Order.asc("date"),
                Sort.Order.desc("priorityId")));
    }

    @Override
    public Task save(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public void delete(int id) {
        taskRepository.deleteById(id);
    }
}