package com.example.turkcellmarket.services.concretes;

import com.example.turkcellmarket.entities.PaymentMethod;
import com.example.turkcellmarket.repositories.abstracts.PaymentMethodRepository;
import com.example.turkcellmarket.services.abstracts.PaymentMethodService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PaymentMethodServiceImpl implements PaymentMethodService {
    private PaymentMethodRepository paymentMethodRepository;

    @Override
    public void add(PaymentMethod paymentMethod) {
        paymentMethodRepository.save(paymentMethod);
    }

    @Override
    public List<PaymentMethod> getAll() {
        return paymentMethodRepository.findAll();
    }
}
