package com.example.turkcellmarket.services.abstracts;

import com.example.turkcellmarket.entities.City;

import java.util.List;

public interface CityService {
    public List<City> getAll();

    public void add(City city);
}
