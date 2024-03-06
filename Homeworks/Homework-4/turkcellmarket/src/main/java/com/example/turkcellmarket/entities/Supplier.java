package com.example.turkcellmarket.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="suppliers")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Supplier {
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @ManyToOne
    private User user;

    @Column(name="tax_number")
    private String taxNumber;
}
