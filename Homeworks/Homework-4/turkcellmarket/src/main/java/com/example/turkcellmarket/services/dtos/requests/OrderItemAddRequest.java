package com.example.turkcellmarket.services.dtos.requests;

import com.example.turkcellmarket.services.constants.Messages;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemAddRequest {
    @NotNull(message = Messages.ValidationErrors.NOT_NULL_ERROR)
    private Integer orderId;

    @NotNull(message = Messages.ValidationErrors.NOT_NULL_ERROR)
    private Integer productId;

    @NotNull(message = Messages.ValidationErrors.NOT_NULL_ERROR)
    private Integer supplierId;

    @NotNull(message = Messages.ValidationErrors.NOT_NULL_ERROR)
    private Integer productCount;

    @NotNull(message = Messages.ValidationErrors.NOT_NULL_ERROR)
    @Min(value = 0, message = Messages.ValidationErrors.MIN_VALUE_ERROR)
    private Double price;
}
