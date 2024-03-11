package com.example.turkcellmarket.repositories.abstracts;

import com.example.turkcellmarket.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
