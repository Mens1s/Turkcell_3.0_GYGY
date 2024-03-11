package com.example.turkcellmarket.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="shopping_carts")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
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
