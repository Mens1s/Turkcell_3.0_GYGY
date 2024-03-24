package com.turkcell.pair3.customerservice.services.dtos.responses;


import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class SearchCustomerResponse {
    private String customerId;
    private String firstName;
    private String lastName;
    private String secondName;
    private int nationalityId;

    public SearchCustomerResponse() {
    }

    public SearchCustomerResponse(String customerId, String firstName, String lastName, String secondName, int nationalityId) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.secondName = secondName;
        this.nationalityId = nationalityId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(int nationalityId) {
        this.nationalityId = nationalityId;
    }
}