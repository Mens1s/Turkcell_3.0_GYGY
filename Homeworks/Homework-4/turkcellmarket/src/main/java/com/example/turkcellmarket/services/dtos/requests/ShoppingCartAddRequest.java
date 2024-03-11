package com.example.turkcellmarket.services.dtos.requests;

import com.example.turkcellmarket.services.constants.Messages;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ShoppingCartAddRequest {
    @NotNull(message = Messages.ValidationErrors.NOT_NULL_ERROR)
    private Integer userId;

    @NotNull(message = Messages.ValidationErrors.NOT_NULL_ERROR)
    private Double totalPrice;
}
