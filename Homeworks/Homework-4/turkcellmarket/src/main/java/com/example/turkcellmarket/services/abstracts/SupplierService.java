package com.example.turkcellmarket.services.abstracts;

import com.example.turkcellmarket.entities.Supplier;

import java.util.List;

public interface SupplierService {
    void add(Supplier supplier);
    List<Supplier> getAll();
}
