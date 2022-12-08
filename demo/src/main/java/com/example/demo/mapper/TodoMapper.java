package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Todo;

@Mapper
public interface TodoMapper {

    public List<Todo> selectTodo();

    public void insertTodo(Todo todo);

    public void updateTodo(Todo todo);

    public void deleteTodo(Todo todo);

}
