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
public class Order {
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @ManyToOne
    @JsonIgnore
    private Customer customer;

    @Column(name="date")
    private String date;

    @Column(name="total_price")
    private String totalPrice;

    @ManyToOne
    @JsonIgnore
    private Address address;
}

