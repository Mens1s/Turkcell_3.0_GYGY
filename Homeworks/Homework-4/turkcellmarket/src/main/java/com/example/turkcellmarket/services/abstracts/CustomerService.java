package com.example.turkcellmarket.services.abstracts;

import com.example.turkcellmarket.entities.Customer;
import com.example.turkcellmarket.services.dtos.requests.CustomerAddRequest;

import java.util.List;

public interface CustomerService {
    void add(CustomerAddRequest customer);
    List<Customer> getAll();
}
