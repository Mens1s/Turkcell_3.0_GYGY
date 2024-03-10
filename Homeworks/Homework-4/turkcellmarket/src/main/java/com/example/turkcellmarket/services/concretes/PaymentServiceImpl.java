package com.example.turkcellmarket.services.concretes;

import com.example.turkcellmarket.entities.Payment;
import com.example.turkcellmarket.repositories.abstracts.PaymentRepository;
import com.example.turkcellmarket.services.abstracts.PaymentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private PaymentRepository paymentRepository;
    @Override
    public void add(Payment payment) {
        paymentRepository.save(payment);
    }

    @Override
    public List<Payment> getAll() {
        return paymentRepository.findAll();
    }
}
