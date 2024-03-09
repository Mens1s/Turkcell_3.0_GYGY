package com.example.turkcellmarket.controllers;

import com.example.turkcellmarket.entities.Address;
import com.example.turkcellmarket.services.abstracts.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/address")
@AllArgsConstructor
public class AddressController {

    private final AddressService addressService;

    @GetMapping
    public List<Address> getAll(){
        return addressService.getAll();
    }

    @PostMapping
    public void add(@RequestBody Address address){
        addressService.add(address);
    }
}
