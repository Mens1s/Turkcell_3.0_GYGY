package com.example.turkcellmarket.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="disticies")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class District {
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @ManyToOne
    @JsonIgnore
    private City city;

    @Column(name="name")
    private String name;
}
