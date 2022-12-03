package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Category;
import com.example.demo.service.CategoryService;

@Controller
public class TodoController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/Todo")
    public String init(Model model) {
        List<Category> category = categoryService.selectCategory();
        model.addAttribute("categories", category);
        return "Todo";
    }
}