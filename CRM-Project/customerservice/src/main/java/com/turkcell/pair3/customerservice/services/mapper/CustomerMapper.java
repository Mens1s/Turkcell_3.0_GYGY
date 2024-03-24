package com.turkcell.pair3.customerservice.services.mapper;

import com.turkcell.pair3.customerservice.entities.Customer;
import com.turkcell.pair3.customerservice.services.dtos.requests.CustomerAddRequest;
import com.turkcell.pair3.customerservice.services.dtos.responses.CustomerInfoResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    Customer customerFromAddRequest(CustomerAddRequest request);

    CustomerInfoResponse customerInfoResponseFromCustomer(Customer customer);
}
