package com.example.turkcellmarket.services.abstracts;

import com.example.turkcellmarket.entities.Country;

import java.util.List;

public interface CountryService {
    List<Country> getAll();
    void add(Country country);
}
