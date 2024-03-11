package com.example.turkcellmarket.services.abstracts;

import com.example.turkcellmarket.services.dtos.requests.ProductAddRequest;
import com.example.turkcellmarket.services.dtos.responses.ProductGetResponse;

import java.util.List;

public interface ProductService {
    void add(ProductAddRequest product);
    List<ProductGetResponse> getAll();

    public List<ProductGetResponse> searchQuery(String query);
}
