package com.example.turkcellmarket.services.abstracts;

import com.example.turkcellmarket.entities.Order;
import com.example.turkcellmarket.services.dtos.requests.OrderAddRequest;
import com.example.turkcellmarket.services.dtos.responses.OrderGetResponse;

import java.util.List;

public interface OrderService {
    void add(OrderAddRequest orderAddRequest);
    List<OrderGetResponse> getAll();
}
