package com.example.turkcellmarket.services.concretes;

import com.example.turkcellmarket.entities.Country;
import com.example.turkcellmarket.repositories.abstracts.CountryRepository;
import com.example.turkcellmarket.services.abstracts.CountryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CountryServiceImpl implements CountryService {
    public CountryRepository countryRepository;

    @Override
    public List<Country> getAll() {
        return countryRepository.findAll();
    }

    @Override
    public void add(Country country) {
        countryRepository.save(country);
    }
}
