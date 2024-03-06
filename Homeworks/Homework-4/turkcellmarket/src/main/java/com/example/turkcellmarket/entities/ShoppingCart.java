package com.example.turkcellmarket.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="shopping_carts")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingCart {
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @ManyToOne
    private User user;

    @Column(name="total_price")
    private double totalPrice;

}
