package com.infoshareacademy.component;

import com.infoshareacademy.model.Status;
import com.infoshareacademy.model.Task;
import com.infoshareacademy.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@Component
public class InsertDataComponent {

    private final TaskRepository taskRepository;

    @Autowired
    public InsertDataComponent (TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }
    @PostConstruct
    public void addData(){
//        Task task = new Task("Add", Status.FINISHED);
        Task task = new Task();
        task.setStatus(Status.FINISHED);
        task.setDecription("new dupa");
        Task task1 = new Task ("Delete", Status.TODO);
        Task task2 = new Task("Sort", Status.IN_PROGRESS);
        taskRepository.save(task);
        taskRepository.save(task1);
        taskRepository.save(task2);

    }
}
