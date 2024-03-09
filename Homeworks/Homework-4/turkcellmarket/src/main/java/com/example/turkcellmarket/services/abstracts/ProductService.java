package com.example.turkcellmarket.services.abstracts;

import com.example.turkcellmarket.entities.Product;
import com.example.turkcellmarket.services.dtos.product.requests.ProductAddRequest;

import java.util.List;

public interface ProductService {
    void add(ProductAddRequest product);
    List<Product> getAll();

    public List<Product> searchQuery(String query);
}
