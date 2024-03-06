package com.example.turkcellmarket.controllers;

import com.example.turkcellmarket.entities.Brand;
import com.example.turkcellmarket.services.abstracts.BrandService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/brand")
@AllArgsConstructor
public class BrandController {
    private BrandService brandService;

    @GetMapping
    public List<Brand> getAll(){
        return brandService.getAll();
    }

    @PostMapping
    public void add(@RequestBody Brand brand){
        brandService.add(brand);
    }
}