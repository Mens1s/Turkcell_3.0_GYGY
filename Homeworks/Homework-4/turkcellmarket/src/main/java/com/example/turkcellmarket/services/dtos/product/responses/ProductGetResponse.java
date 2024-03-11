package com.example.turkcellmarket.services.dtos.product.responses;

import com.example.turkcellmarket.entities.Brand;
import com.example.turkcellmarket.entities.Category;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductGetResponse {

    private Integer id;

    private Category category;

    private Brand brand;

    private String name;

    private String description;

    private Integer stock;

}
