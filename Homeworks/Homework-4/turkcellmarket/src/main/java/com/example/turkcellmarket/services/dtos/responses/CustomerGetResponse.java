package com.example.turkcellmarket.services.dtos.responses;

import com.example.turkcellmarket.entities.User;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerGetResponse {

    User user;
    Integer id;
}
