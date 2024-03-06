package com.example.turkcellmarket.repositories.abstracts;

import com.example.turkcellmarket.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
