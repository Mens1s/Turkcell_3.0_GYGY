package com.turkcell.pair3.customerservice.services.abstracts;

import com.turkcell.pair3.customerservice.entities.Address;
import com.turkcell.pair3.customerservice.services.dtos.requests.AddressAddRequest;
import com.turkcell.pair3.customerservice.services.dtos.responses.AddressInfoResponse;

public interface AddressService {
    AddressInfoResponse add(AddressAddRequest request);
}
