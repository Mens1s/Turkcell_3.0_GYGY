package com.example.turkcellmarket.repositories.abstracts;

import com.example.turkcellmarket.entities.WishList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WishListRepository extends JpaRepository<WishList, Integer> {
}
