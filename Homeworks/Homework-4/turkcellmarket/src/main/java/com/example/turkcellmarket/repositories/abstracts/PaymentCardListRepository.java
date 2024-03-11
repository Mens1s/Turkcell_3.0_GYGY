package com.example.turkcellmarket.repositories.abstracts;

import com.example.turkcellmarket.entities.PaymentCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentCardListRepository extends JpaRepository<PaymentCard, Integer> {

}
