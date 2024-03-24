package com.turkcell.pair3.customerservice.services.abstracts;

import com.turkcell.pair3.customerservice.entities.Address;
import com.turkcell.pair3.customerservice.services.dtos.requests.AddressAddRequest;

public interface AddressService {
    Integer add(AddressAddRequest request);
}
