package com.example.turkcellmarket.services.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderGetResponse {
    private Integer id;
    private Integer customerId;
    private String date;
    private Double totalPrice;
    private Integer addressId;
    private Integer paymentId;
}
