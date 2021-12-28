package ru.goridko_igor.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.goridko_igor.repository.TaskTypeRepository;
import ru.goridko_igor.service.TaskTypeService;

@Service
public class TaskTypeServiceImpl implements TaskTypeService {
    private final TaskTypeRepository taskTypeRepository;

    @Autowired
    public TaskTypeServiceImpl(TaskTypeRepository taskTypeRepository) {
        this.taskTypeRepository = taskTypeRepository;
    }
}
