package com.example.turkcellmarket.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="wish_list")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WishList {
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Product product;

    @Column(name="added_date")
    private String addedDate;
}
