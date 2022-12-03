package com.example.demo.entity;

import lombok.Data;

// Lombokの機能、Getter/Setterをコンパイル時に自動で生成してくれる
@Data
public class Category {
    private int category_id;
    private String name;
}