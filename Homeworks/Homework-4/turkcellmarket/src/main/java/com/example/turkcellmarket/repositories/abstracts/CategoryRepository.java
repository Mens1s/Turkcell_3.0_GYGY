package com.example.turkcellmarket.repositories.abstracts;

import com.example.turkcellmarket.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    Category findByName(String name);
}
