package com.example.turkcellmarket.services.abstracts;

import com.example.turkcellmarket.services.dtos.product.requests.ProductAddRequest;
import com.example.turkcellmarket.services.dtos.product.responses.ProductGetResponse;

import java.util.List;

public interface ProductService {
    void add(ProductAddRequest product);
    List<ProductGetResponse> getAll();

    public List<ProductGetResponse> searchQuery(String query);
}
