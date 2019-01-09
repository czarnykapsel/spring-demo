package com.infoshareacademy.controller;

import com.infoshareacademy.model.Task;
import com.infoshareacademy.repository.TaskRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskControllerTest {

    @Autowired
    private TaskController taskController;

    @Autowired
    private TaskRepository taskRepository;

    @Test
    public void shouldGetAllTasks() {
        List<Task> tasks = taskController.getAllTasks();
        assertThat(tasks).hasSize(2);
    }

    @Test
    public void getTaskById() {
    }

    @Test
    public void addTask() {
    }

    @Test
    public void deleteTask() {
    }

    @Test
    public void findByStatus() {
    }
}