package com.example.turkcellmarket.services.abstracts;

import com.example.turkcellmarket.entities.Product;

import java.util.List;

public interface ProductService {
    void add(Product product);
    List<Product> getAll();
}
