package com.example.turkcellmarket.services.concretes;

import com.example.turkcellmarket.entities.ProductSupplier;
import com.example.turkcellmarket.repositories.abstracts.ProductSupplierRepository;
import com.example.turkcellmarket.services.abstracts.ProductSupplierService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class ProductSupplierServiceImpl implements ProductSupplierService {

    private ProductSupplierRepository productSupplierRepository;
    @Override
    public List<ProductSupplier> getAll() {
        return productSupplierRepository.findAll();
    }

    @Override
    public void add(ProductSupplier productSupplier) {
        productSupplierRepository.save(productSupplier);
    }
}
