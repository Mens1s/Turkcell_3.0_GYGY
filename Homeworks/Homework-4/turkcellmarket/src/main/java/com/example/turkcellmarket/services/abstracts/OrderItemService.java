package com.example.turkcellmarket.services.abstracts;

import com.example.turkcellmarket.entities.OrderItem;
import com.example.turkcellmarket.services.dtos.requests.OrderItemAddRequest;
import com.example.turkcellmarket.services.dtos.responses.OrderItemGetResponse;

import java.util.List;

public interface OrderItemService {
    void add(OrderItemAddRequest orderItemAddRequest);
    List<OrderItemGetResponse> getAll();
}
