package com.infoshareacademy.repository;

import com.infoshareacademy.model.Status;
import com.infoshareacademy.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findAllbyStatus(Status status);
}
