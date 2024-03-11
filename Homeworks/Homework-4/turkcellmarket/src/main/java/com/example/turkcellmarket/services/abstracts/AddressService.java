package com.example.turkcellmarket.services.abstracts;


import com.example.turkcellmarket.entities.Address;

import java.util.List;

public interface AddressService {
    public List<Address> getAll();

    public void add(Address address);

}

