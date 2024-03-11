package com.example.turkcellmarket.services.dtos.requests;

import com.example.turkcellmarket.services.constants.Messages;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CardItemAddRequest {
    @NotNull(message = Messages.ValidationErrors.NOT_NULL_ERROR)
    private Integer productSupplierId;

    @NotNull(message = Messages.ValidationErrors.NOT_NULL_ERROR)
    private Integer shoppingCartId;

    @NotNull(message = Messages.ValidationErrors.NOT_NULL_ERROR)
    @Min(value = 0, message = Messages.ValidationErrors.MIN_VALUE_ERROR)
    private Integer itemCount;

    @NotNull(message = Messages.ValidationErrors.NOT_NULL_ERROR)
    @Min(value = 0, message = Messages.ValidationErrors.MIN_VALUE_ERROR)
    private Double price;
}
