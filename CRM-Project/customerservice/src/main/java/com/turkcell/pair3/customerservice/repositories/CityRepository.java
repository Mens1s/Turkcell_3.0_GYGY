package com.turkcell.pair3.customerservice.repositories;

import com.turkcell.pair3.customerservice.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Integer> {
}
