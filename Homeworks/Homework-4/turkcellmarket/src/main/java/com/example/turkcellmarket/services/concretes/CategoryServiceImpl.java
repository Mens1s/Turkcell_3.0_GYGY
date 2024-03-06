package com.example.turkcellmarket.services.concretes;

import com.example.turkcellmarket.entities.Category;
import com.example.turkcellmarket.repositories.abstracts.CategoryRepository;
import com.example.turkcellmarket.services.abstracts.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private CategoryRepository categoryRepository;
    @Override
    public void add(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }
}
