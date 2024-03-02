package com.pairthree.turkcellmarket.services.concretes;

import com.pairthree.turkcellmarket.entities.Order;
import com.pairthree.turkcellmarket.repositories.concretes.OrderRepository;
import com.pairthree.turkcellmarket.services.abstracts.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    private OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void add(Order order) {
        orderRepository.add(order);
    }

    @Override
    public void update(Order order) {
        orderRepository.update(order);
    }

    @Override
    public void delete(String id) {
        orderRepository.delete(id);
    }

    @Override
    public Order get(String id) {
        return orderRepository.get(id);
    }

    @Override
    public List<Order> getAll() {
        return orderRepository.getAll();
    }
}
