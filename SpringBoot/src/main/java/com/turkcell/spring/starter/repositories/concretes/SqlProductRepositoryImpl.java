package com.turkcell.spring.starter.repositories.concretes;

import com.turkcell.spring.starter.entities.Product;
import com.turkcell.spring.starter.repositories.abstracts.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public class SqlProductRepositoryImpl implements ProductRepository
{
    @Override
    public void add(Product product) {

    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
