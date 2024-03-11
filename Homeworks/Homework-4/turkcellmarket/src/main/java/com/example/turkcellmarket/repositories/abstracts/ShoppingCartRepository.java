package com.example.turkcellmarket.repositories.abstracts;

import com.example.turkcellmarket.entities.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Integer> {
}
