package com.example.turkcellmarket.services.dtos.requests;

import com.example.turkcellmarket.services.constants.Messages;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserAddRequest {
    @NotNull(message = Messages.ValidationErrors.NOT_NULL_ERROR)
    private String name;

    @NotNull(message = Messages.ValidationErrors.NOT_NULL_ERROR)
    private String surname;

    @NotNull(message = Messages.ValidationErrors.NOT_NULL_ERROR)
    private String email;

    @NotNull(message = Messages.ValidationErrors.NOT_NULL_ERROR)
    private String password;

    @NotNull(message = Messages.ValidationErrors.NOT_NULL_ERROR)
    private String lastLoginDate;

    @NotNull(message = Messages.ValidationErrors.NOT_NULL_ERROR)
    private String registerDate;
}
