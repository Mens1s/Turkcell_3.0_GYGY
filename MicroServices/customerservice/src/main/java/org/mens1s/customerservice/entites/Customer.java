package org.mens1s.customerservice.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="customer")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer id;

    @Column(name="customer_id")
    private String customerId;

    @Column(name="account_number")
    private String accountNumber;

    @Column(name="nationality_id")
    private int nationalityId;

    @Column(name="gsm_number")
    private String gsmNumber;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="second_name")
    private String secondName;
}
