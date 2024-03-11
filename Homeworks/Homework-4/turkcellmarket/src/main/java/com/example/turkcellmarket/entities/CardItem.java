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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @ManyToOne
    private Product product;

    @ManyToOne
    private ShoppingCart shoppingCart;

    @Column(name="item_count")
    private Integer itemCount;

    @Column(name="price")
    private Double price;
}
