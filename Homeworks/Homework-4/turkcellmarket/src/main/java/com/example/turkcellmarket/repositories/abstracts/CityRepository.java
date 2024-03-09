package com.example.turkcellmarket.repositories.abstracts;

import com.example.turkcellmarket.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Integer> {
}
