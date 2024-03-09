package com.example.turkcellmarket.repositories.abstracts;

import com.example.turkcellmarket.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query(value = "SELECT p from Product p WHERE LOWER(p.name) LIKE %:query%")
    List<Product> searchByQuery(String query);
}
