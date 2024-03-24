package com.turkcell.pair3.customerservice.services.mapper;

import com.turkcell.pair3.customerservice.entities.Address;
import com.turkcell.pair3.customerservice.entities.Customer;
import com.turkcell.pair3.customerservice.services.dtos.requests.AddressAddRequest;
import com.turkcell.pair3.customerservice.services.dtos.requests.CustomerAddRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AddressMapper {

    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    Address addressFromAddRequest(AddressAddRequest request);
}
