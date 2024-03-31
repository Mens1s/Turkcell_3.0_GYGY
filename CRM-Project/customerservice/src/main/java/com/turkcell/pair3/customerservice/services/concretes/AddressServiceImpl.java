package com.turkcell.pair3.customerservice.services.concretes;

import com.turkcell.pair3.customerservice.entities.Address;
import com.turkcell.pair3.customerservice.repositories.AddressRepository;
import com.turkcell.pair3.customerservice.repositories.CityRepository;
import com.turkcell.pair3.customerservice.repositories.CustomerRepository;
import com.turkcell.pair3.customerservice.services.abstracts.AddressService;
import com.turkcell.pair3.customerservice.services.dtos.requests.AddressAddRequest;
import com.turkcell.pair3.customerservice.services.dtos.responses.AddressInfoResponse;
import com.turkcell.pair3.customerservice.services.mapper.AddressMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

    private AddressRepository addressRepository;
    private CityRepository cityRepository;
    private CustomerRepository customerRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public AddressInfoResponse add(AddressAddRequest request) {
        Address address = AddressMapper.INSTANCE.addressFromAddRequest(request);

        address = addressRepository.save(address);

        return AddressMapper.INSTANCE.addressInfoResponseFromAddress(address);
    }
}
