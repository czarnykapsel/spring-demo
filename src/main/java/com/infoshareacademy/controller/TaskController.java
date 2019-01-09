package com.infoshareacademy.controller;

import com.infoshareacademy.model.Status;
import com.infoshareacademy.model.Task;
import com.infoshareacademy.repository.TaskRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskRepository taskRepository;

    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping
    public List<Task> getAllTasks(){
return taskRepository.findAll();
    }

    @GetMapping ("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable Long id){
        return taskRepository.findById(id)
                .map(task -> ResponseEntity.ok().body(task))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Task addTask(@RequestBody Task task){
        return taskRepository.save(task);
    }

    @DeleteMapping("/{id}")
    public List<Task> deleteTask(@PathVariable Long id){
        taskRepository.deleteById(id);
        return taskRepository.findAll();
    }

    @GetMapping("/status/{status}")
    public List<Task> findByStatus(@PathVariable Status status){
        return taskRepository.findAllbyStatus(status);
    }
}
