package com.turkcell.pair3.customerservice.services.dtos.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class AddressAddRequest {
    
    @NotNull
    private int cityId;

    @NotBlank(message = "Street is mandatory.")
    private String street;

    @NotBlank(message = "House/Flat number is mandatory.")
    private String flatNumber;

    public AddressAddRequest() {
    }

    public AddressAddRequest(int cityId, String street, String flatNumber) {
        this.cityId = cityId;
        this.street = street;
        this.flatNumber = flatNumber;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }
}
