package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Category;

/**
 * カテゴリ Mapper
 */
@Mapper
public interface CategoryMapper {
    /**
     * カテゴリマスタ検索
     * 
     * @return 検索結果
     */
    public List<Category> selectCategory();
}