package com.example.turkcellmarket.services.concretes;

import com.example.turkcellmarket.entities.Customer;
import com.example.turkcellmarket.entities.ShoppingCart;
import com.example.turkcellmarket.entities.User;
import com.example.turkcellmarket.repositories.abstracts.CustomerRepository;
import com.example.turkcellmarket.services.abstracts.CustomerService;
import com.example.turkcellmarket.services.abstracts.ShoppingCartService;
import com.example.turkcellmarket.services.abstracts.UserService;
import com.example.turkcellmarket.services.dtos.requests.CustomerAddRequest;
import com.example.turkcellmarket.services.mappers.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository;
    @Override
    public void add(CustomerAddRequest request) {
        Customer customer = new Customer();


        customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }
}
