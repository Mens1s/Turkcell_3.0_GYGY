package com.example.turkcellmarket.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="orders")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class orders {
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    @ManyToOne
    @JsonIgnore
    private customers customer;

    // TODO: order id

    @Column(name="date")
    private String date;

    @Column(name="total_price")
    private double totalPrice;

    @ManyToOne
    @JsonIgnore
    private addresses address;
}

