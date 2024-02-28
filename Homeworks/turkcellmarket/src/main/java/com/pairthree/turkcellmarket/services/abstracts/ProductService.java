package com.pairthree.turkcellmarket.services.abstracts;

import com.pairthree.turkcellmarket.entities.Product;

import java.util.List;

public interface ProductService {
    void add(Product product);
    void update(Product product);
    List<Product> getAll();
}
