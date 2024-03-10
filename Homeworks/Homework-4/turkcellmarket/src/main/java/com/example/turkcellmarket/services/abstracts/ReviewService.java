package com.example.turkcellmarket.services.abstracts;

import com.example.turkcellmarket.entities.Review;

import java.util.List;

public interface ReviewService {
    void add(Review review);
    List<Review> getAll();
}
