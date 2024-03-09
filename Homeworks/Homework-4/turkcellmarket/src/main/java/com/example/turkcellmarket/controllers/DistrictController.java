package com.example.turkcellmarket.controllers;

import com.example.turkcellmarket.entities.District;
import com.example.turkcellmarket.services.abstracts.DistrictService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/distinct")
@AllArgsConstructor
public class DistrictController {
    private final DistrictService districtService;

    @GetMapping
    public List<District> getALl(){
        return districtService.getAll();
    }
    @PostMapping
    public void add(@RequestBody District district){
        districtService.add(district);
    }
}
