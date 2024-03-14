package com.example.turkcellmarket.services.dtos.requests;

import com.example.turkcellmarket.services.constants.Messages;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductAddRequest {
    @NotNull(message = Messages.ValidationErrors.NOT_NULL_ERROR)
    @Min(value = 0, message = Messages.ValidationErrors.MIN_VALUE_ERROR)
    private Integer categoryId;

    @NotNull(message = Messages.ValidationErrors.NOT_NULL_ERROR)
    @Min(value = 0, message = Messages.ValidationErrors.MIN_VALUE_ERROR)
    private Integer brandId;

    @NotNull(message = Messages.ValidationErrors.NOT_NULL_ERROR)
    private String name;

    @NotNull(message = Messages.ValidationErrors.NOT_NULL_ERROR)
    private String description;

    @Min(value = 1, message = Messages.ValidationErrors.MIN_VALUE_ERROR)
    private Integer stock;
}
