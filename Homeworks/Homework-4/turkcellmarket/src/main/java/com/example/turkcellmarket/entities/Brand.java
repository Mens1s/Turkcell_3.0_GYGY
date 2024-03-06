package com.example.turkcellmarket.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="brands")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Brand {
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @Column(name="name")
    private String name;
}
