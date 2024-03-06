package com.example.turkcellmarket.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="product_suppliers")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductSuppliers {
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    //TODO supplier id;
    //TODO product id;

    private int stock;
}
