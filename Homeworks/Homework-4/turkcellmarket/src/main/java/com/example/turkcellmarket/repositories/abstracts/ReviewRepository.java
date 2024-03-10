package com.example.turkcellmarket.repositories.abstracts;

import com.example.turkcellmarket.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Integer> {

}
