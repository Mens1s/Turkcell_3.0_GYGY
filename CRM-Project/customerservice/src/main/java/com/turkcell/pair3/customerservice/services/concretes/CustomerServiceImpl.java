package com.turkcell.pair3.customerservice.services.concretes;

import com.turkcell.pair3.customerservice.core.types.BusinessException;
import com.turkcell.pair3.customerservice.entities.Customer;
import com.turkcell.pair3.customerservice.repositories.CustomerRepository;
import com.turkcell.pair3.customerservice.services.abstracts.CustomerService;
import com.turkcell.pair3.customerservice.services.dtos.requests.CustomerAddRequest;
import com.turkcell.pair3.customerservice.services.dtos.requests.SearchCustomerRequest;
import com.turkcell.pair3.customerservice.services.dtos.responses.CustomerInfoResponse;
import com.turkcell.pair3.customerservice.services.dtos.responses.SearchCustomerResponse;
import com.turkcell.pair3.customerservice.services.mapper.CustomerMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Integer add(CustomerAddRequest customerAddRequest) {
        Customer customer = CustomerMapper.INSTANCE.customerFromAddRequest(customerAddRequest);
        customerRepository.save(customer);
        return customer.getId();
    }

    @Override
    public List<SearchCustomerResponse> search(SearchCustomerRequest request) {
        List<SearchCustomerResponse> response = customerRepository.search(request);

        if(response.isEmpty())
            throw new BusinessException("Empty Data! No customer found!");

        return response;
    }



    @Override
    public CustomerInfoResponse getCustomerInfo(String customerId){
        return CustomerMapper.INSTANCE.customerInfoResponseFromCustomer(customerRepository.findByCustomerId(customerId));
    }


}
