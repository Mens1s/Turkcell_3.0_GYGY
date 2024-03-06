package com.example.turkcellmarket.repositories.abstracts;

import com.example.turkcellmarket.entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Integer> {
}
