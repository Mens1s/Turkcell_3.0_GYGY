package com.pairthree.turkcellmarket.controllers;

import com.pairthree.turkcellmarket.entities.user.Customer;
import com.pairthree.turkcellmarket.services.abstracts.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping
    private void add(@RequestBody Customer customer) {
        customerService.add(customer);
    }

    @PutMapping
    private void update(@RequestBody Customer customer) {
        customerService.update(customer);
    }

    @DeleteMapping("/{id}")
    private void delete(@PathVariable("id") String id) {
        customerService.delete(id);
    }

    @GetMapping("/{id}")
    private Customer get(@PathVariable("id") String id) {
        return customerService.get(id);
    }

    @GetMapping
    private List<Customer> getAll() {
        return customerService.getAll();
    }
}
