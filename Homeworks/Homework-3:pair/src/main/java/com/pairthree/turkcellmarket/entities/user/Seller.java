package com.pairthree.turkcellmarket.entities.user;

public class Seller extends User{
    private String companyName;
    private String companyTelephoneNumber;
    private String companyEmailAddress;
    private String companyTaxNumber;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyTelephoneNumber() {
        return companyTelephoneNumber;
    }

    public void setCompanyTelephoneNumber(String companyTelephoneNumber) {
        this.companyTelephoneNumber = companyTelephoneNumber;
    }

    public String getCompanyEmailAddress() {
        return companyEmailAddress;
    }

    public void setCompanyEmailAddress(String companyEmailAddress) {
        this.companyEmailAddress = companyEmailAddress;
    }

    public String getCompanyTaxNumber() {
        return companyTaxNumber;
    }

    public void setCompanyTaxNumber(String companyTaxNumber) {
        this.companyTaxNumber = companyTaxNumber;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
