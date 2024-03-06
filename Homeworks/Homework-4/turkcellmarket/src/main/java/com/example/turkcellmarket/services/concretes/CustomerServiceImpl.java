package com.example.turkcellmarket.services.concretes;

import com.example.turkcellmarket.entities.Customer;
import com.example.turkcellmarket.repositories.abstracts.CustomerRepository;
import com.example.turkcellmarket.services.abstracts.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository;

    @Override
    public void add(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }
}
