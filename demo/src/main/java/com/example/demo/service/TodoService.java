package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Todo;

public interface TodoService {

    public List<Todo> selectTodo();

    public void insertTodo(Todo todo);

    public void updateTodo(Todo todo);

    public void deleteTodo(Todo todo);

}