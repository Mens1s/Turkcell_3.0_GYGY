package com.turkcell.pair3.customerservice.entities;

import com.turkcell.pair3.customerservice.enums.EnumGender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name="customer_id")
    private String customerId; // ABC014

    @Column(name = "account_number", nullable = false)
    private String accountNumber;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "nationality_id", nullable = false)
    private int nationalityId;

    @Column(name = "gsm_number", nullable = false)
    private String gsmNumber;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name="second_name")
    private String secondName;

    @Column(name = "role", nullable = false)
    private String role;

    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;

    @Column(name = "gender", nullable = false)
    @Enumerated(EnumType.STRING)
    private EnumGender gender;

    @Column(name = "father_name")
    private String fatherName;

    @Column(name = "mother_name")
    private String motherName;

    @Column(name = "home_phone")
    private String homePhone;

    @Column(name = "mobile_phone", nullable = false)
    private String mobilePhone;

    @Column(name = "fax")
    private String fax;

    @Column(name = "address")
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "customer")
    private List<Address> address;

    public Customer() {
    }

    public Customer(Integer id, String customerId, String accountNumber, String email, int nationalityId, String gsmNumber, String firstName, String lastName, String secondName, String role, LocalDate birthDate, EnumGender gender, String fatherName, String motherName, String homePhone, String mobilePhone, String fax, List<Address> address) {
        this.id = id;
        this.customerId = customerId;
        this.accountNumber = accountNumber;
        this.email = email;
        this.nationalityId = nationalityId;
        this.gsmNumber = gsmNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.secondName = secondName;
        this.role = role;
        this.birthDate = birthDate;
        this.gender = gender;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.fax = fax;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(int nationalityId) {
        this.nationalityId = nationalityId;
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

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public EnumGender getGender() {
        return gender;
    }

    public void setGender(EnumGender gender) {
        this.gender = gender;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }
}
