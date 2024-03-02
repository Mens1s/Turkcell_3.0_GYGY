package com.pairthree.turkcellmarket.services.abstracts;

import com.pairthree.turkcellmarket.entities.Category;

import java.util.List;

public interface CategoryService {
    void add(Category category);
    void update(Category category);
    void delete(String id);
    Category get(String id);
    List<Category> getAll();
}
