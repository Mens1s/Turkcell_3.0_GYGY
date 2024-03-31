package com.turkcell.pair3.customerservice.services.mapper;

import com.turkcell.pair3.customerservice.core.types.BusinessException;
import com.turkcell.pair3.customerservice.entities.Address;
import com.turkcell.pair3.customerservice.entities.City;
import com.turkcell.pair3.customerservice.entities.Customer;
import com.turkcell.pair3.customerservice.repositories.CityRepository;
import com.turkcell.pair3.customerservice.repositories.CustomerRepository;
import com.turkcell.pair3.customerservice.services.dtos.requests.AddressAddRequest;
import com.turkcell.pair3.customerservice.services.dtos.requests.CustomerAddRequest;
import com.turkcell.pair3.customerservice.services.dtos.responses.AddressInfoResponse;
import jakarta.persistence.PersistenceContext;
import jdk.jfr.Category;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.aspectj.lang.annotation.After;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Optional;

@Mapper(uses = {CityMapper.class, CustomerMapperInherited.class})
public interface AddressMapper {

    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "city", source = "request.cityId")
    @Mapping(target = "customer", source = "request.customerId")
    Address addressFromAddRequest(AddressAddRequest request);

    @Mapping(source = "city.id", target = "cityId")
    @Mapping(source = "customer.id", target = "customerId")
    AddressInfoResponse addressInfoResponseFromAddress(Address address);
}

@Component
class CityMapper{
    private final CityRepository cityRepository;

    public CityMapper(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public City getCityById(Integer id){
        Optional<City> city = cityRepository.findById(id);

        if (city.isEmpty())
            throw new BusinessException("City with id not found!");

        return city.get();
    }
}

@Component
class CustomerMapperInherited{
    private final CustomerRepository customerRepository;

    public CustomerMapperInherited(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public Customer getCityById(Integer id){
        Optional<Customer> customer = customerRepository.findById(id);

        if (customer.isEmpty())
            throw new BusinessException("Customer with id not found!");

        return customer.get();
    }
}

