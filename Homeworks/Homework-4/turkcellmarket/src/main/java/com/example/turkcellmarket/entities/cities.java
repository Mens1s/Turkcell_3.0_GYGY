package com.example.turkcellmarket.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="cities")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class cities {
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    //TODO : country id

    @Column(name="name")
    private String name;
}
