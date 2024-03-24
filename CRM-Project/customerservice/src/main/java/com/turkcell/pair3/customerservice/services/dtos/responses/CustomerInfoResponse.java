package com.turkcell.pair3.customerservice.services.dtos.responses;

import com.turkcell.pair3.customerservice.enums.EnumGender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

public class CustomerInfoResponse {
    private String firstName;
    private String lastName;
    private EnumGender gender;
    private String motherName;
    private String fatherName;
    private String secondName;
    private LocalDate birthDate;
    private int nationalityId;

    public CustomerInfoResponse() {
    }

    public CustomerInfoResponse(String firstName, String lastName, EnumGender gender, String motherName, String fatherName, String secondName, LocalDate birthDate, int nationalityId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.motherName = motherName;
        this.fatherName = fatherName;
        this.secondName = secondName;
        this.birthDate = birthDate;
        this.nationalityId = nationalityId;
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

    public EnumGender getGender() {
        return gender;
    }

    public void setGender(EnumGender gender) {
        this.gender = gender;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(int nationalityId) {
        this.nationalityId = nationalityId;
    }
}
