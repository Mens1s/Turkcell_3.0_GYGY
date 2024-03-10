package com.example.turkcellmarket.services.abstracts;

import com.example.turkcellmarket.entities.PaymentCard;

import java.util.List;

public interface PaymentCardListService {
    void add(PaymentCard paymentCard);
    List<PaymentCard> getAll();
}
