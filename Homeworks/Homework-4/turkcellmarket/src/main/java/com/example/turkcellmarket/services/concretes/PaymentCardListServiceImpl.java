package com.example.turkcellmarket.services.concretes;

import com.example.turkcellmarket.entities.PaymentCard;
import com.example.turkcellmarket.repositories.abstracts.PaymentCardListRepository;
import com.example.turkcellmarket.services.abstracts.PaymentCardListService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PaymentCardListServiceImpl implements PaymentCardListService {

    private PaymentCardListRepository paymentCardListRepository;
    @Override
    public void add(PaymentCard paymentCard) {
        paymentCardListRepository.save(paymentCard);
    }

    @Override
    public List<PaymentCard> getAll() {
        return paymentCardListRepository.findAll();
    }
}
