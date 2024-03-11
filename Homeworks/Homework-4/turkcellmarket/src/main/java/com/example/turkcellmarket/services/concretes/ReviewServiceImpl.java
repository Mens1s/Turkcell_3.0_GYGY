package com.example.turkcellmarket.services.concretes;

import com.example.turkcellmarket.entities.Review;
import com.example.turkcellmarket.repositories.abstracts.ReviewRepository;
import com.example.turkcellmarket.services.abstracts.ReviewService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReviewServiceImpl implements ReviewService {
    private ReviewRepository reviewRepository;


    @Override
    public void add(Review review) {
        reviewRepository.save(review);
    }

    @Override
    public List<Review> getAll() {
        return reviewRepository.findAll();
    }
}
