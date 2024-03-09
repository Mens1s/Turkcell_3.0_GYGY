package com.example.turkcellmarket.services.abstracts;

import com.example.turkcellmarket.entities.Country;

import java.util.List;

public interface CountryService {
    public List<Country> getAll();
    public void add(Country country);
}
