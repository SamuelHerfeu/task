package com.taskwork.task;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    private String titulo;
    private String descricao;
    private String status;
    private String prioridade;

    public Task() {
        // Construtor padrão necessário para JPA
    }

    public Task(Integer id, String titulo, String descricao, String status, String prioridade) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = status;
        this.prioridade = prioridade;
    }

    // Getters e Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return "Task{" +
               "id=" + id +
               ", titulo='" + titulo + '\'' +
               ", descricao='" + descricao + '\'' +
               ", status='" + status + '\'' +
               ", prioridade='" + prioridade + '\'' +
               '}';
    }
}