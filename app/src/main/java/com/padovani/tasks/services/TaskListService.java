package com.padovani.tasks.services;

import com.padovani.tasks.domain.entities.TaskList;

import java.util.List;

public interface TaskListService {
    List<TaskList> listTaskLists();
}
