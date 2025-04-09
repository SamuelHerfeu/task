package com.taskwork.task.Repository;

import com.taskwork.task.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {
    // Métodos personalizados podem ser adicionados aqui
}