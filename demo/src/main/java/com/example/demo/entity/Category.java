package com.example.demo.entity;

import java.sql.Date;

import lombok.Data;

// lombokの機能、Getter・Setterの代わりになる
@Data
public class Category {
    private int category_id;
    private String name;
} 