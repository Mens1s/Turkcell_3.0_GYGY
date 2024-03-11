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

    @ManyToOne(cascade = {CascadeType.REFRESH, CascadeType.DETACH}, fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "suppliers_id")
    private ProductSupplier productSupplier;

    @ManyToOne(cascade = {CascadeType.REFRESH, CascadeType.DETACH}, fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "shopping_cart_id")
    private ShoppingCart shoppingCart;

    @Column(name="item_count", nullable = false)
    private Integer itemCount;

    @Column(name="price", nullable = false)
    private Double price;
}
