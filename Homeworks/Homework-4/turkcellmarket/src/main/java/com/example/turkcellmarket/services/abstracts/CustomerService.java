package com.example.turkcellmarket.services.abstracts;

import com.example.turkcellmarket.entities.Customer;

import java.util.List;

public interface CustomerService {
    void add(Customer customer);
    List<Customer> getAll();
}
