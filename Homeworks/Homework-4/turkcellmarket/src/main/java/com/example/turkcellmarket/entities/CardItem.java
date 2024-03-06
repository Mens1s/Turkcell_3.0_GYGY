package com.example.turkcellmarket.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="cart_items")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
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
