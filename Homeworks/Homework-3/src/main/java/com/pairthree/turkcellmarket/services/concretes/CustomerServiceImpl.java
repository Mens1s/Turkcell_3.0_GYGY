package com.pairthree.turkcellmarket.services.concretes;

import com.pairthree.turkcellmarket.entities.user.Customer;
import com.pairthree.turkcellmarket.repositories.concretes.CustomerRepository;
import com.pairthree.turkcellmarket.services.abstracts.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }


    @Override
    public void add(Customer customer) {
        customerRepository.add(customer);
    }

    @Override
    public void update(Customer customer) {
        customerRepository.update(customer);
    }

    @Override
    public void delete(String id) {
        customerRepository.delete(id);
    }

    @Override
    public Customer get(String id) {
        return customerRepository.get(id);
    }

    @Override
    public List<Customer> getAll() {
        return customerRepository.getAll();
    }
}
