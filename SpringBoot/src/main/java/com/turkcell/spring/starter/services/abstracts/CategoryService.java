package com.turkcell.spring.starter.services.abstracts;

import com.turkcell.spring.starter.entities.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAll();
}
