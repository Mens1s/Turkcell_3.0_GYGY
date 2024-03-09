package com.example.turkcellmarket.services.abstracts;

import com.example.turkcellmarket.entities.ProductSupplier;

import java.util.List;

public interface ProductSupplierService {
    public List<ProductSupplier> getAll();
    public void add(ProductSupplier productSupplier);
}
