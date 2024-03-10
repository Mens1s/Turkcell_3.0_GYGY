package com.example.turkcellmarket.controllers;

import com.example.turkcellmarket.entities.PaymentMethod;
import com.example.turkcellmarket.services.abstracts.PaymentMethodService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payment-method")
@AllArgsConstructor
public class PaymentMethodController {
    private final PaymentMethodService paymentMethodService;
    @GetMapping
    public List<PaymentMethod> getAll(){
        return paymentMethodService.getAll();
    }
    @PostMapping
    public void add(@RequestBody PaymentMethod paymentMethod){
        paymentMethodService.add(paymentMethod);
    }
}
