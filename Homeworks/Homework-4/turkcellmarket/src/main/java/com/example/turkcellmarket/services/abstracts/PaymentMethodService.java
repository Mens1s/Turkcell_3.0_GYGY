package com.example.turkcellmarket.services.abstracts;

import com.example.turkcellmarket.entities.PaymentMethod;

import java.util.List;

public interface PaymentMethodService {
    void add(PaymentMethod paymentMethod);
    List<PaymentMethod> getAll();
}
