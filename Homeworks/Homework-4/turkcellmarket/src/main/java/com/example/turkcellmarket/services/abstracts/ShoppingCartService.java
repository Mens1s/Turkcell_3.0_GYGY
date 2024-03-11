package com.example.turkcellmarket.services.abstracts;

import com.example.turkcellmarket.services.dtos.requests.ShoppingCartAddRequest;
import com.example.turkcellmarket.services.dtos.responses.ShoppingCartGetResponse;

import java.util.List;

public interface ShoppingCartService {
    void add(ShoppingCartAddRequest shoppingCartAddRequest);
    List<ShoppingCartGetResponse> getAll();
}
