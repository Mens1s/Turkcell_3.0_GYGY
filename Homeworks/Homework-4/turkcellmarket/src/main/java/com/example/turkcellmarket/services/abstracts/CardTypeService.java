package com.example.turkcellmarket.services.abstracts;

import com.example.turkcellmarket.entities.CardType;

import java.util.List;

public interface CardTypeService {
    void add(CardType cardType);
    List<CardType> getAll();
}