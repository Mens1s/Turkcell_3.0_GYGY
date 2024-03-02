package com.pairthree.turkcellmarket.services.abstracts;

import com.pairthree.turkcellmarket.entities.Order;

import java.util.List;

public interface OrderService {
    void add(Order order);
    void update(Order order);
    void delete(String id);
    Order get(String id);
    List<Order> getAll();
}
