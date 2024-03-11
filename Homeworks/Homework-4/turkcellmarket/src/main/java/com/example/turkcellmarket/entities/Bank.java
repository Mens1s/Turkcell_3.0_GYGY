package com.example.turkcellmarket.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="banks")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="bank_name", nullable = false)
    private String name;

}
