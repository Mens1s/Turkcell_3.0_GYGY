package com.example.turkcellmarket.controllers;

import com.example.turkcellmarket.entities.City;
import com.example.turkcellmarket.services.abstracts.CityService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/city")
@AllArgsConstructor
public class CityController {
    private final CityService cityService;

    @GetMapping
    public List<City> getAll(){
        return cityService.getAll();
    }

    @PostMapping
    public void add(City city){
        cityService.add(city);
    }
}
