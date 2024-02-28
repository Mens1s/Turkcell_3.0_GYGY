package com.pairthree.turkcellmarket.services.abstracts;

import com.pairthree.turkcellmarket.entities.Basket;

import java.util.List;

public interface BasketService {
    void add(Basket basket);
    void update(Basket basket);
    void delete(Basket basket);
    Basket get(String id);
    List<Basket> getAll();
}
