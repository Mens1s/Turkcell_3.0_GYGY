package com.example.turkcellmarket.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="order_items")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class orderItems {
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    // TODO: product id

    // TODO: order id

    @Column(name="product_count")
    private int productCount;

    @Column(name="price")
    private double price;
}
