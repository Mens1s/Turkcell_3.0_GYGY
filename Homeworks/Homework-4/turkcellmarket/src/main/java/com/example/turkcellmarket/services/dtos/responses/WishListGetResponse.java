package com.example.turkcellmarket.services.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WishListGetResponse {
    private Integer userId;
    private Integer productId;
    private String addedDate;
}
