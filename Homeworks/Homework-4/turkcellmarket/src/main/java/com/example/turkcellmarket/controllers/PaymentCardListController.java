package com.example.turkcellmarket.controllers;

import com.example.turkcellmarket.entities.PaymentCard;
import com.example.turkcellmarket.services.abstracts.PaymentCardListService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payment-card-list")
@AllArgsConstructor
public class PaymentCardListController {
    private final PaymentCardListService paymentCardListService;
    @GetMapping
    public List<PaymentCard> getAll(){
        return paymentCardListService.getAll();
    }
    @PostMapping
    public void add(@RequestBody PaymentCard paymentCard){
        paymentCardListService.add(paymentCard);
    }
}
