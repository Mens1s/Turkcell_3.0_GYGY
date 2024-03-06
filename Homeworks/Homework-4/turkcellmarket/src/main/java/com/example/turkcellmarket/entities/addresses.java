package com.example.turkcellmarket.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="addreses")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class addresses {
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    // TODO: distinct ekle

    // TODO : userID ekle
    @Column(name="open_address")
    private String openAddress;

    @Column(name="telephone_number")
    private String telephonNumber;

}
