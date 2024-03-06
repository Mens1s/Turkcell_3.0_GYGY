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
public class Address {
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "distinct_id", referencedColumnName = "id", insertable = false, updatable = false)
    private District district;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", insertable = false, updatable = false)
    private User user;

    @Column(name="open_address")
    private String openAddress;

    @Column(name="telephone_number")
    private String telephonNumber;

}
