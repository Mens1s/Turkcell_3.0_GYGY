package com.example.turkcellmarket.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="users")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="surname", nullable = false)
    private String surname;

    @Column(name="email", nullable = false)
    private String email;

    @Column(name="password", nullable = false)
    private String password;

    @Column(name="last_login_date")
    private String lastLoginDate;

    @Column(name="register_date", nullable = false)
    private String registerDate;
}
