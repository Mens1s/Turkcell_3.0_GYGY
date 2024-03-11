package com.example.turkcellmarket.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="card_types")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CardType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="cart_type", nullable = false)
    private String cardType;
}
