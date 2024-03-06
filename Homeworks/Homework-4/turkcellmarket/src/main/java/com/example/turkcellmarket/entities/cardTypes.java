package com.example.turkcellmarket.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="card_types")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class cardTypes {
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    @Column(name="cart_type")
    private String cardType;
}
