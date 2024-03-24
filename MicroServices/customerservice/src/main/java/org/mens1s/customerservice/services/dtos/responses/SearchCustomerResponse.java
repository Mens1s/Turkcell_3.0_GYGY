package org.mens1s.customerservice.services.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SearchCustomerResponse {
    private String customerId;
    private String firstName;
    private String lastName;
    private String secondName;
    private int nationalityId;
}