package org.mens1s.customerservice.services.dtos.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SearchCustomerRequest {
    private Integer nationalityId;
    private String customerId;
    private String accountNumber;
    private String gsmNumber;
    private String firstName;
    private String lastName;
    private String orderNumber;
}
