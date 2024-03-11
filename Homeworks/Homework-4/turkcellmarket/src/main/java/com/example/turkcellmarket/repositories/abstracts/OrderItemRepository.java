package com.example.turkcellmarket.repositories.abstracts;

import com.example.turkcellmarket.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {

}
