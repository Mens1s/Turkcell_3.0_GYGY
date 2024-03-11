package com.example.turkcellmarket.services.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class OrderItemGetResponse {
    private Integer id;
    private Integer orderId;
    private Integer productId;
    private Integer supplierId;
    private Integer productCount;
    private Double price;
}
