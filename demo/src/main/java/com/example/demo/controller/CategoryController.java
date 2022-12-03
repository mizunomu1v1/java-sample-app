package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Category;
import com.example.demo.service.CategoryService;

@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    // http://localhost:8080/CategoryMaster の時に呼ばれる
    @RequestMapping("/CategoryMaster")
    public String init(Model model) {
        List<Category> category = categoryService.selectCategory();
        model.addAttribute("categories", category);
        return "CategoryMaster";
    }
}