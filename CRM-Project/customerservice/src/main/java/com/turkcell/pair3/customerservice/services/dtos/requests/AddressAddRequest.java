package com.turkcell.pair3.customerservice.services.dtos.requests;

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
public class AddressAddRequest {
    
    @NotNull
    private int cityId;

    @NotNull
    private int houseNumber;

    @NotNull
    private int customerId;

    @NotBlank(message = "Description is mandatory.")
    private String description;

    @NotBlank(message = "House/Flat number is mandatory.")
    private String flatNumber;

}
