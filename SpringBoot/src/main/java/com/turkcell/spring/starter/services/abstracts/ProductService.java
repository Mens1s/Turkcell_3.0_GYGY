package com.turkcell.spring.starter.services.abstracts;

import com.turkcell.spring.starter.entities.Product;

import java.util.List;

public interface ProductService
{
    void add(Product product);
    List<Product> getAll();
}
