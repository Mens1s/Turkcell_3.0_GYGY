package com.example.turkcellmarket.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="suppliers")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @OneToOne(cascade = {CascadeType.REFRESH, CascadeType.DETACH}, fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name="tax_number", nullable = false)
    private String taxNumber;
}
