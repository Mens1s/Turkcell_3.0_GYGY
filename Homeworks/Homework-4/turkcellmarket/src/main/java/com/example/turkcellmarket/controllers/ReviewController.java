package com.example.turkcellmarket.controllers;

import com.example.turkcellmarket.entities.Review;
import com.example.turkcellmarket.services.abstracts.ReviewService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/review")
@AllArgsConstructor
public class ReviewController {
    private final ReviewService reviewService;
    @GetMapping
    public List<Review> getAll(){
        return reviewService.getAll();
    }
    @PostMapping
    public void add(@RequestBody Review review){
        reviewService.add(review);
    }
}
