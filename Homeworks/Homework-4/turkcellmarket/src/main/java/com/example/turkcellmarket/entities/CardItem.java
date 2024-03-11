package com.example.turkcellmarket.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="cart_items")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CardItem {
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @ManyToOne
    private Product product;

    @ManyToOne
    private ShoppingCart shoppingCart;

    @Column(name="item_count")
    private int itemCount;

    @Column(name="price")
    private int price;
}
