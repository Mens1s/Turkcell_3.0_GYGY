package com.example.turkcellmarket.controllers;

import com.example.turkcellmarket.entities.Customer;
import com.example.turkcellmarket.services.abstracts.CustomerService;
import com.example.turkcellmarket.services.dtos.requests.CustomerAddRequest;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
@AllArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping
    public List<Customer> getAll(){
        return customerService.getAll();
    }

    @PostMapping
    public void add(@RequestBody CustomerAddRequest request){
        customerService.add(request);
    }
}
