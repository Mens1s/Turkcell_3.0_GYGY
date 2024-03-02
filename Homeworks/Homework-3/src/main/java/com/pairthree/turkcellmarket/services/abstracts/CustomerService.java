package com.pairthree.turkcellmarket.services.abstracts;

import com.pairthree.turkcellmarket.entities.user.Customer;

import java.util.List;

public interface CustomerService {
    void add(Customer customer);
    void update(Customer customer);
    void delete(String id);
    Customer get(String id);
    List<Customer> getAll();

}
