package com.example.turkcellmarket.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="product_suppliers")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProductSupplier {
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "suppliers_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Supplier supplier;

    @ManyToOne
    private Product product;

    @Column(name = "stock")
    private int stock;
}
