package com.turkcell.pair3.customerservice.services.dtos.responses;


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
public class AddressInfoResponse {
    private int cityId;

    private int houseNumber;

    private int customerId;

    private String description;

    private String flatNumber;
}
