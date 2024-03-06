package com.example.turkcellmarket.controllers;

import com.example.turkcellmarket.entities.Category;
import com.example.turkcellmarket.services.abstracts.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
@AllArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping
    public List<Category> getAll(){
        return categoryService.getAll();
    }

    @PostMapping
    public void add(@RequestBody Category category){
        categoryService.add(category);
    }
}
