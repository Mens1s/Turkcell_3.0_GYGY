package com.example.turkcellmarket.services.abstracts;

import com.example.turkcellmarket.entities.Payment;

import java.util.List;

public interface PaymentService {
    void add(Payment payment);
    List<Payment> getAll();
}
