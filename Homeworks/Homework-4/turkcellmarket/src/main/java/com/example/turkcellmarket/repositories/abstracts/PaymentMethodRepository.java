package com.example.turkcellmarket.repositories.abstracts;

import com.example.turkcellmarket.entities.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, Integer> {
    PaymentMethod findByName(String name);
}
