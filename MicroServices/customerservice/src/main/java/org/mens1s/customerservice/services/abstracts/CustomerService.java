package org.mens1s.customerservice.services.abstracts;

import org.mens1s.customerservice.services.dtos.requests.SearchCustomerRequest;
import org.mens1s.customerservice.services.dtos.responses.SearchCustomerResponse;

import java.util.List;

public interface CustomerService {
    List<SearchCustomerResponse> search(SearchCustomerRequest request);
}
