package com.example.turkcellmarket.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="cart_items")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class cardItems {
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    //TODO: add product id

    //TODO: shopping cart

    @Column(name="item_count")
    private int itemCount;

    @Column(name="price")
    private int price;
}
