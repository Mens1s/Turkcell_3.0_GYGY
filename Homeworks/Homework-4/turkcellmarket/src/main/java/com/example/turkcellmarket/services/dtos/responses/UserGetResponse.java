package com.example.turkcellmarket.services.dtos.responses;

import lombok.*;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserGetResponse {
    private Integer id;

    private String name;

    private String surname;

    private String email;

    private String password;

    private String lastLoginDate;

    private String registerDate;
}
