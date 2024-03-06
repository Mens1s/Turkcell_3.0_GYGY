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
public class paymentCard {
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    @ManyToOne
    @JsonIgnore
    private cardTypes cardTypes;

    // TODO : payment method id
    // TODO : customer bank id
    // TODO : seller bank id
    // TODO : payment id
    // TODO : seller bank id

    @Column(name="amount")
    private double amount;

    @Column(name="installment_count")
    private double installmentCount;
// valla sizin sesler var benimki gelmiyo :D
    @Column(name="status")
    private double status;
}
