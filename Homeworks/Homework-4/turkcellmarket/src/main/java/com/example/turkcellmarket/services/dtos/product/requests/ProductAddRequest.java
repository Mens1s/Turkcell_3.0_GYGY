package com.example.turkcellmarket.services.dtos.product.requests;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductAddRequest {

    private Integer categoryId;

    private Integer brandId;

    @NotBlank
    private String name;

    private String description;

    @Min(1)
    private Integer stock;
}
