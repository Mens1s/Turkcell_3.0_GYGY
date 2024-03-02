package com.pairthree.turkcellmarket.services.abstracts;

import com.pairthree.turkcellmarket.entities.user.Seller;

import java.util.List;

public interface SellerService {
    void add(Seller seller);
    void update(Seller seller);
    void delete(String id);
    Seller get(String id);
    List<Seller> getAll();
}
