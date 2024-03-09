package com.example.turkcellmarket.services.concretes;

import com.example.turkcellmarket.entities.Address;
import com.example.turkcellmarket.repositories.abstracts.AddressRepository;
import com.example.turkcellmarket.services.abstracts.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class AddressServiceImpl implements AddressService {

    private AddressRepository addressRepository;
    @Override
    public List<Address> getAll() {
        return addressRepository.findAll();
    }

    @Override
    public void add(Address address) {
        addressRepository.save(address);
    }
}
