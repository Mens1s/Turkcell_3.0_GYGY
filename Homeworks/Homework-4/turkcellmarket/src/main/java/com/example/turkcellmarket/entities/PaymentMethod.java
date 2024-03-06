package com.example.turkcellmarket.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="payment_methods")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentMethod {// farkettim yarine halledicem .d
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    @Column(name="payment_method")
    private String paymentMethod; // ENUM
}
