package com.example.turkcellmarket.services.concretes;

import com.example.turkcellmarket.entities.Product;
import com.example.turkcellmarket.repositories.abstracts.ProductRepository;
import com.example.turkcellmarket.services.abstracts.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ProductServiceImp implements ProductService {

    private final ProductRepository productRepository;
    @Override
    public void add(Product product) {
        productRepository.save(product);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }
}
