package com.example.turkcellmarket.services.dtos.product.responses;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserGetResponse {
    private Integer id;

    private String name;

    private String surname;

    private String email;

    private String password;

    private String lastLoginDate;

    private String registerDate;
}
