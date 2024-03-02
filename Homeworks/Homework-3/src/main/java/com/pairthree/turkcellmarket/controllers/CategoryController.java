package com.pairthree.turkcellmarket.controllers;

import com.pairthree.turkcellmarket.entities.Category;
import com.pairthree.turkcellmarket.services.abstracts.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    private CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping
    private void add(@RequestBody Category category) {
        categoryService.add(category);
    }

    @PutMapping
    private void update(@RequestBody Category category) {
        categoryService.update(category);
    }

    @DeleteMapping("/{id}")
    private void delete(@PathVariable("id") String id) {
        categoryService.delete(id);
    }

    @GetMapping("/{id}")
    private Category get(@PathVariable("id") String id) {
        return categoryService.get(id);
    }

    @GetMapping
    private List<Category> getAll() {
        return categoryService.getAll();
    }
}
