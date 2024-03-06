package com.example.turkcellmarket.repositories.abstracts;

import com.example.turkcellmarket.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
