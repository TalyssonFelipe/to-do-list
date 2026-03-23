package com.example.todolist.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;



@Entity
@Table(name = "todos")

public class Todo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;

    @NotBlank
    private String nome;
    
    @NotBlank
    private String descricao;
    private boolean ralizado;
    private int prioridade;
    
    public Todo() {
    }

    public Todo(String descricao, String nome, boolean ralizado, int prioridade) {
        this.descricao = descricao;
        this.nome = nome;
        this.prioridade = prioridade;
        this.ralizado = ralizado;
    }
    
    

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public boolean isRalizado() {
        return ralizado;
    }
    public void setRalizado(boolean ralizado) {
        this.ralizado = ralizado;
    }
    public int getPrioridade() {
        return prioridade;
    }
    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    


}
