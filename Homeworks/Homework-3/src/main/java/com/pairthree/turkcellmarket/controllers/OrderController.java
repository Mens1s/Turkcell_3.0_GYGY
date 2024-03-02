package com.pairthree.turkcellmarket.controllers;

import com.pairthree.turkcellmarket.entities.Order;
import com.pairthree.turkcellmarket.services.abstracts.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping
    private void add(@RequestBody Order order) {
        orderService.add(order);
    }

    @PutMapping
    private void update(@RequestBody Order order) {
        orderService.update(order);
    }

    @DeleteMapping("/{id}")
    private void delete(@PathVariable("id") String id) {
        orderService.delete(id);
    }

    @GetMapping("/{id}")
    private Order get(@PathVariable("id") String id) {
        return orderService.get(id);
    }

    @GetMapping
    private List<Order> getAll() {
        return orderService.getAll();
    }
}
