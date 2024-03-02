package com.pairthree.turkcellmarket.services.concretes;

import com.pairthree.turkcellmarket.entities.Category;
import com.pairthree.turkcellmarket.repositories.concretes.CategoryRepository;
import com.pairthree.turkcellmarket.services.abstracts.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    private CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void add(Category category) {
        categoryRepository.add(category);
    }

    @Override
    public void update(Category category) {
        categoryRepository.update(category);
    }

    @Override
    public void delete(String id) {
        categoryRepository.delete(id);
    }

    @Override
    public Category get(String id) {
        return categoryRepository.get(id);
    }

    @Override
    public List<Category> getAll() {
        return categoryRepository.getAll();
    }
}
