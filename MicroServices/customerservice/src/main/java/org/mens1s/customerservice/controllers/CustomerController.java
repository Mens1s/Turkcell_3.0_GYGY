package org.mens1s.customerservice.controllers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.mens1s.customerservice.services.abstracts.CustomerService;
import org.mens1s.customerservice.services.dtos.requests.SearchCustomerRequest;
import org.mens1s.customerservice.services.dtos.responses.SearchCustomerResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping("search")
    public List<SearchCustomerResponse> search(@RequestBody @Valid SearchCustomerRequest request){
        return customerService.search(request);
    }
}
