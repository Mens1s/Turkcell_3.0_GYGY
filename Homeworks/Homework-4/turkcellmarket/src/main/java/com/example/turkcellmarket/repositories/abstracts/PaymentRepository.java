package com.example.turkcellmarket.repositories.abstracts;

import com.example.turkcellmarket.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
    Payment findByName(String name);
}
