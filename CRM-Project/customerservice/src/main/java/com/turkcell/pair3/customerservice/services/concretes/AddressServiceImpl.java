package com.turkcell.pair3.customerservice.services.concretes;

import com.turkcell.pair3.customerservice.entities.Address;
import com.turkcell.pair3.customerservice.repositories.AddressRepository;
import com.turkcell.pair3.customerservice.services.abstracts.AddressService;
import com.turkcell.pair3.customerservice.services.dtos.requests.AddressAddRequest;
import com.turkcell.pair3.customerservice.services.mapper.AddressMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

    private AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public Integer add(AddressAddRequest request) {
        Address address = AddressMapper.INSTANCE.addressFromAddRequest(request);

        address = addressRepository.save(address);

        return address.getId();
    }
}
