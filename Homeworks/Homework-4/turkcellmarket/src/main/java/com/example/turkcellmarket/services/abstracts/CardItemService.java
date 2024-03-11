package com.example.turkcellmarket.services.abstracts;

import com.example.turkcellmarket.services.dtos.requests.CardItemAddRequest;
import com.example.turkcellmarket.services.dtos.responses.CardItemGetResponse;

import java.util.List;

public interface CardItemService {
    void add(CardItemAddRequest cardItemAddRequest);
    List<CardItemGetResponse> getAll();
}
