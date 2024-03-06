package com.example.turkcellmarket.services.concretes;

import com.example.turkcellmarket.entities.Brand;
import com.example.turkcellmarket.repositories.abstracts.BrandRepository;
import com.example.turkcellmarket.services.abstracts.BrandService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BrandServiceImpl implements BrandService {
    private BrandRepository brandRepository;
    @Override
    public void add(Brand brand) {
        brandRepository.save(brand);
    }

    @Override
    public List<Brand> getAll() {
        return brandRepository.findAll();
    }
}
