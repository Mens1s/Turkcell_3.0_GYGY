package com.example.turkcellmarket.services.abstracts;

import com.example.turkcellmarket.entities.Brand;

import java.util.List;

public interface BrandService {
    void add(Brand brand);
    List<Brand> getAll();
}
