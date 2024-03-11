package com.example.turkcellmarket.controllers;

import com.example.turkcellmarket.entities.Payment;
import com.example.turkcellmarket.services.abstracts.PaymentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payment")
@AllArgsConstructor
public class PaymentController {
    private PaymentService paymentService;
    @GetMapping
    public List<Payment> getAll(){
        return paymentService.getAll();
    }

    @PostMapping
    public void add(@RequestBody Payment payment){
        paymentService.add(payment);
    }
}
