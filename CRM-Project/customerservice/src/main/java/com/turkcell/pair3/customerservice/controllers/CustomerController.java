package com.turkcell.pair3.customerservice.controllers;

import com.turkcell.pair3.customerservice.entities.Customer;
import com.turkcell.pair3.customerservice.services.abstracts.CustomerService;
import com.turkcell.pair3.customerservice.services.dtos.requests.CustomerAddRequest;
import com.turkcell.pair3.customerservice.services.dtos.requests.SearchCustomerRequest;
import com.turkcell.pair3.customerservice.services.dtos.responses.CustomerInfoResponse;
import com.turkcell.pair3.customerservice.services.dtos.responses.SearchCustomerResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @PostMapping
    public Integer add(@RequestBody CustomerAddRequest customerAddRequest) {
        return customerService.add(customerAddRequest);
    }

    @PostMapping("search")
    public List<SearchCustomerResponse> search(@RequestBody SearchCustomerRequest request)
    {
        return customerService.search(request);
    }

    @GetMapping("getInfo/{customerId}")
    public CustomerInfoResponse getInfo(@PathVariable String customerId)
    {
        return customerService.getCustomerInfo(customerId);
    }
}
