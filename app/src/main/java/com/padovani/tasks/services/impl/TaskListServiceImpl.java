package com.padovani.tasks.services.impl;

import com.padovani.tasks.domain.entities.TaskList;
import com.padovani.tasks.repositories.TaskListRepository;
import com.padovani.tasks.services.TaskListService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskListServiceImpl implements TaskListService {

    private final TaskListRepository taskListRepository;

    public TaskListServiceImpl(TaskListRepository taskListRepository) {
        this.taskListRepository = taskListRepository;
    }

    public List<TaskList> listTaskLists() {
        return taskListRepository.findAll();
    }
}
