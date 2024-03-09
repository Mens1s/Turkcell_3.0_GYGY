package com.example.turkcellmarket.controllers;

import com.example.turkcellmarket.entities.Country;
import com.example.turkcellmarket.services.abstracts.CountryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/country")
@AllArgsConstructor
public class CountryController {
    private final CountryService countryService;

    @GetMapping
    public List<Country> getAll(){
        return countryService.getAll();
    }
    @PostMapping
    public void add(@RequestBody Country country){
        countryService.add(country);
    }

}
