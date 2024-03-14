package com.example.turkcellmarket.services.dtos.requests;

import com.example.turkcellmarket.services.constants.Messages;
import jakarta.validation.constraints.NotNull;
import lombok.*;
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CategoryAddRequest {
    @NotNull(message = Messages.ValidationErrors.NOT_NULL_ERROR)
    private String name;
}
