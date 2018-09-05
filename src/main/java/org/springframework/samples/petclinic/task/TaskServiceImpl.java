package org.springframework.samples.petclinic.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public List<Task> getTaskList() {
        return taskRepository.findAll();
    }

    @Override
    public Task findTaskById(long id) {
        return taskRepository.findById(id);
    }

    @Override
    public void save(Task Task) {
        taskRepository.save(Task);
    }

    @Override
    public void edit(Task Task) {
        taskRepository.save(Task);
    }

    @Override
    public void delete(long id) {
        //taskRepository.delete(id);
    }
}
