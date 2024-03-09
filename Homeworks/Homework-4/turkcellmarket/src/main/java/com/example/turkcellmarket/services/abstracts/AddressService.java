package com.example.turkcellmarket.services.abstracts;


import com.example.turkcellmarket.entities.Address;
import com.example.turkcellmarket.repositories.abstracts.AddressRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AddressService {
    public List<Address> getAll();

    public void add(Address address);

}

