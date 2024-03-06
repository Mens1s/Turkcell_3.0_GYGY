package com.example.turkcellmarket.services.abstracts;

import com.example.turkcellmarket.entities.Category;

import java.util.List;

public interface CategoryService {
    void add(Category category);
    List<Category> getAll();
}
