package com.example.turkcellmarket.services.abstracts;

import com.example.turkcellmarket.entities.District;

import java.util.List;


public interface DistrictService {

    public List<District> getAll();
    public void add(District distinct);
}
