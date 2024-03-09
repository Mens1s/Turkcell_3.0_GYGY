package com.example.turkcellmarket.services.concretes;

import com.example.turkcellmarket.entities.District;
import com.example.turkcellmarket.repositories.abstracts.DistrictRepository;
import com.example.turkcellmarket.services.abstracts.DistrictService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class DistrictServiceImpl implements DistrictService {

    private DistrictRepository districtRepository;
    @Override
    public List<District> getAll() {
        return districtRepository.findAll();
    }

    @Override
    public void add(District distinct) {
            districtRepository.save(distinct);
    }
}
