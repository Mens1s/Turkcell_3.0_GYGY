package com.example.turkcellmarket.services.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ShoppingCartGetResponse {
    private Integer id;
    private Integer userId;
    private Double totalPrice;
}
