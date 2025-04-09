package com.taskwork.task.Services;

import com.taskwork.task.Task;
import com.taskwork.task.Repository.TaskRepository; // Pacote do repositório
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService { // Nome da classe ajustado para seguir convenção (era "public class TaskService")

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> listarTodas() {
        return taskRepository.findAll();
    }

    public Optional<Task> buscarPorId(Integer id) {
        return taskRepository.findById(id);
    }

    public Task salvar(Task task) {
        return taskRepository.save(task);
    }

    public void deletar(Integer id) {
        taskRepository.deleteById(id);
    }
}