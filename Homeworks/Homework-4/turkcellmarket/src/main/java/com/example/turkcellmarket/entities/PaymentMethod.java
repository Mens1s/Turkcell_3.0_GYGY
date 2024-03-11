package com.example.turkcellmarket.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="payment_methods")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PaymentMethod {// farkettim yarine halledicem .d
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @Column(name="payment_method")
    private String paymentMethod; // ENUM
}
