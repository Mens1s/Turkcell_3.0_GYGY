package com.turkcell.pair3.customerservice.services.mapper;

import com.turkcell.pair3.customerservice.entities.Address;
import com.turkcell.pair3.customerservice.services.dtos.requests.AddressAddRequest;
import com.turkcell.pair3.customerservice.services.dtos.responses.AddressInfoResponse;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AddressMapper {
    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "city.id", source = "request.cityId")
    @Mapping(target = "customer.id", source = "request.customerId")
    Address addressFromAddRequest(AddressAddRequest request);

    @Mapping(source = "city.id", target = "cityId")
    @Mapping(source = "customer.id", target = "customerId")
    AddressInfoResponse addressInfoResponseFromAddress(Address address);


}