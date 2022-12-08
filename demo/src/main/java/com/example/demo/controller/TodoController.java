package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Todo;
import com.example.demo.service.TodoService;

@Controller
public class TodoController {

    @Autowired
    private TodoService todoService;

    @RequestMapping("/Todo")
    public String init(Model model) {
        List<Todo> todo = todoService.selectTodo();
        model.addAttribute("todos", todo);
        return "Todo";
    }

    @PostMapping("/insertTodo")
    public String insertTodo(@ModelAttribute Todo todo) {
        todoService.insertTodo(todo);
        return "redirect:Todo";
    }

    @PostMapping("/updateTodo")
    public String updateTodo(@ModelAttribute Todo todo) {
        todoService.updateTodo(todo);
        return "redirect:Todo";
    }

    @PostMapping("/deleteTodo")
    public String deleteTodo(@ModelAttribute Todo todo) {
        todoService.deleteTodo(todo);
        return "redirect:Todo";
    }
}