package com.turkcell.pair3.customerservice.services.dtos.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class SearchCustomerRequest
{
    private int nationalityId;
    private String customerId;
    private String accountNumber;
    private String gsmNumber;
    private String firstName;
    private String lastName;

    public SearchCustomerRequest() {
    }

    public SearchCustomerRequest(int nationalityId, String customerId, String accountNumber, String gsmNumber, String firstName, String lastName) {
        this.nationalityId = nationalityId;
        this.customerId = customerId;
        this.accountNumber = accountNumber;
        this.gsmNumber = gsmNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(int nationalityId) {
        this.nationalityId = nationalityId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getGsmNumber() {
        return gsmNumber;
    }

    public void setGsmNumber(String gsmNumber) {
        this.gsmNumber = gsmNumber;
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
}

