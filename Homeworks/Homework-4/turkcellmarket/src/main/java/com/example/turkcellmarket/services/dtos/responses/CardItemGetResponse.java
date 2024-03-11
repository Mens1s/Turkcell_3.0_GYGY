package com.example.turkcellmarket.services.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CardItemGetResponse {
    private Integer id;
    private Integer productSupplierId;
    private Integer shoppingCartId;
    private Integer itemCount;
    private Double price;
}
