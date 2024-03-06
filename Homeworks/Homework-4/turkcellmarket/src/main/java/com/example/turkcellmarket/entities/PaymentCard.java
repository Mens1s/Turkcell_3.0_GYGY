package com.example.turkcellmarket.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="payment_cards")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentCard {
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @ManyToOne
    @JsonIgnore
    private CardType CardType;

    @ManyToOne
    private PaymentMethod paymentMethod;

    @ManyToOne
    private Bank customerBank;

    @ManyToOne
    private Bank sellerBank;

    @ManyToOne
    private Payment payment;

    @Column(name="amount")
    private double amount;

    @Column(name="installment_count")
    private Integer installmentCount;

    @Column(name="status")
    private String status;
}
