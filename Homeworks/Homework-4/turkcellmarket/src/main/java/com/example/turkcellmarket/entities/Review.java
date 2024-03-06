package com.example.turkcellmarket.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="reviews")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Review {
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    // user

    // product

    @Column(name="comment")
    private String comment;

    @Column(name="rating")
    private String rating;
}