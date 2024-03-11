package com.example.turkcellmarket.services.abstracts;

import com.example.turkcellmarket.services.dtos.requests.WishListAddRequest;
import com.example.turkcellmarket.services.dtos.responses.WishListGetResponse;

import java.util.List;

public interface WishListService {
    void add(WishListAddRequest wishListAddRequest);
    List<WishListGetResponse> getAll();
}
