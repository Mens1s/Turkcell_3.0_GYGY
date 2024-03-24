package com.turkcell.pair3.customerservice.services.abstracts;

import com.turkcell.pair3.customerservice.entities.Customer;
import com.turkcell.pair3.customerservice.services.dtos.requests.CustomerAddRequest;
import com.turkcell.pair3.customerservice.services.dtos.requests.SearchCustomerRequest;
import com.turkcell.pair3.customerservice.services.dtos.responses.CustomerInfoResponse;
import com.turkcell.pair3.customerservice.services.dtos.responses.SearchCustomerResponse;

import java.util.List;

public interface CustomerService {
    Integer add(CustomerAddRequest customerAddRequest);
    public CustomerInfoResponse getCustomerInfo(String customerId);
    public List<SearchCustomerResponse> search(SearchCustomerRequest request);
}
