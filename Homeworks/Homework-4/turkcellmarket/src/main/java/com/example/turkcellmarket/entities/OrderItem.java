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
public class OrderItem {
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @ManyToOne
    private Product product;

    @ManyToOne
    private Order order;

    @Column(name="product_count")
    private int productCount;

    @Column(name="price")
    private double price;
}
