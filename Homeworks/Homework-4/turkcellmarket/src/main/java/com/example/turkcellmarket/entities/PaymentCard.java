package com.example.turkcellmarket.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="payment_cards")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PaymentCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
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

    @ManyToOne(cascade = {CascadeType.REFRESH, CascadeType.DETACH}, fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "payment_id")
    private Payment payment;

    @Column(name="amount", nullable = false)
    private Double amount;

    @Column(name="installment_count", nullable = false)
    private Integer installmentCount;

    @Column(name="status")
    private String status;
}
