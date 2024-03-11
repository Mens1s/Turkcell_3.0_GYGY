package com.example.turkcellmarket.repositories.abstracts;

import com.example.turkcellmarket.entities.CardItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardItemRepository extends JpaRepository<CardItem, Integer> {
}
