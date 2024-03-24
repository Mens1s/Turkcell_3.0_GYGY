package org.mens1s.customerservice.services.concretes;

import lombok.RequiredArgsConstructor;
import org.mens1s.customerservice.repositories.CustomerRepository;
import org.mens1s.customerservice.services.abstracts.CustomerService;
import org.mens1s.customerservice.services.dtos.requests.SearchCustomerRequest;
import org.mens1s.customerservice.services.dtos.responses.SearchCustomerResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImp implements CustomerService {
    private final CustomerRepository customerRepository;

    @Override
    public List<SearchCustomerResponse> search(SearchCustomerRequest request){
        return customerRepository.search(request);
    }
}
