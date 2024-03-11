package com.example.turkcellmarket.services.dtos.product.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserAddRequest {
    private Integer id;

    private String name;

    private String surname;

    private String email;

    private String password;

    private String lastLoginDate;

    private String registerDate;

}
