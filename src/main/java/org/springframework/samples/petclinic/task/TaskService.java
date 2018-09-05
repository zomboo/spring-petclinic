package org.springframework.samples.petclinic.task;

import java.util.List;

public interface TaskService {

    public List<Task> getTaskList();

    public Task findTaskById(long id);

    public void save(Task Task);

    public void edit(Task Task);

    public void delete(long id);


}
