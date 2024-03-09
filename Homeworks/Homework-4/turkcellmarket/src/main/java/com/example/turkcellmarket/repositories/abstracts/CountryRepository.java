package com.example.turkcellmarket.repositories.abstracts;

import com.example.turkcellmarket.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {
}
