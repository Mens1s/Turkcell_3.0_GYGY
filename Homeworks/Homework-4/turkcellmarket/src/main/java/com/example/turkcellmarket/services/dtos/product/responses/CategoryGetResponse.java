package com.example.turkcellmarket.services.dtos.product.responses;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CategoryGetResponse {
    private Integer id;
    private String name;

}
