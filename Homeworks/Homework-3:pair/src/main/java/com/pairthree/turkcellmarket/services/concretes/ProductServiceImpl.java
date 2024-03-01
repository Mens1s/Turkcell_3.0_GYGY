package com.pairthree.turkcellmarket.services.concretes;

import com.pairthree.turkcellmarket.entities.Product;
import com.pairthree.turkcellmarket.repositories.concretes.ProductRepository;
import com.pairthree.turkcellmarket.services.abstracts.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Override
    public void add(Product product) {
        productRepository.add(product);
    }
    @Override
    public void update(Product product) {
        productRepository.update(product);
    }
    @Override
    public List<Product> getAll() {
        return productRepository.getAll();
    }
}
