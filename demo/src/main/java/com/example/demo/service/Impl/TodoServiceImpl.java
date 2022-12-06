package com.example.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Todo;
import com.example.demo.mapper.TodoMapper;
import com.example.demo.service.TodoService;

@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoMapper todoMapper;

    @Override
    public List<Todo> selectTodo() {
        return todoMapper.selectTodo();
    }

    @Override
    public void insertTodo(Todo todo) {
        todoMapper.insertTodo(todo);
    }

    @Override
    public void deleteTodo(Todo todo) {
        todoMapper.deleteTodo(todo);
    }
}