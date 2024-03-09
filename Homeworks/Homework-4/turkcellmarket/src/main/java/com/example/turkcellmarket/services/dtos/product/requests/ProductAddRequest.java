package com.example.turkcellmarket.services.dtos.product.requests;

import com.example.turkcellmarket.entities.Brand;
import com.example.turkcellmarket.entities.Category;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductForAddingDto {
    private Integer categoryId;
    private Integer brandId;
    private String name;
    private String description;
    private double price;
    private double stock;
}
