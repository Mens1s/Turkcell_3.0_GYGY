package com.example.turkcellmarket.services.dtos.requests;

import com.example.turkcellmarket.services.constants.Messages;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
@Getter
@Setter
public class OrderAddRequest {
    @NotNull(message = Messages.ValidationErrors.NOT_NULL_ERROR)
    private Integer customerId;

    @NotNull(message = Messages.ValidationErrors.NOT_NULL_ERROR)
    private Integer addressId;

    @NotNull(message = Messages.ValidationErrors.NOT_NULL_ERROR)
    private Integer paymentId;

    @NotNull(message = Messages.ValidationErrors.NOT_NULL_ERROR)
    @Min(value = 0, message = Messages.ValidationErrors.MIN_VALUE_ERROR)
    private Double totalPrice;
}
