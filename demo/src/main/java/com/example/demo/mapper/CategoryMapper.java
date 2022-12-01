package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Category;

/**
 * DBを操作するインターフェース
 */
@Mapper
public interface CategoryMapper {

    public List<Category> selectCategory();
}