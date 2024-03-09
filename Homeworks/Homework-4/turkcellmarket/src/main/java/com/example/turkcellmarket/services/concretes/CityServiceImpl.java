package com.example.turkcellmarket.services.concretes;

import com.example.turkcellmarket.entities.City;
import com.example.turkcellmarket.repositories.abstracts.CityRepository;
import com.example.turkcellmarket.services.abstracts.CityService;

import java.util.List;

public class CityServiceImpl implements CityService {

    private CityRepository cityRepository;
    @Override
    public List<City> getAll() {
        return cityRepository.findAll();
    }

    @Override
    public void add(City city) {
        cityRepository.save(city);
    }
}
