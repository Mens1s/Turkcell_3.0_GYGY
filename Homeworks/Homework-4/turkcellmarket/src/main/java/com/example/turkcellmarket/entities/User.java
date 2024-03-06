package com.example.turkcellmarket.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
// Ben bunu 12-1 ggibi bugün paylaşırım githubtan
@Table(name="users")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="surname")
    private String surname;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

    @Column(name="last_login_date")
    private String lastLoginDate;

    @Column(name="register_date")
    private String registerDate;
}
