package org.mens1s.customerservice.services.rules;

import lombok.RequiredArgsConstructor;
import org.mens1s.customerservice.core.types.BusinessException;
import org.mens1s.customerservice.entites.Customer;
import org.mens1s.customerservice.repositories.CustomerRepository;
import org.mens1s.customerservice.services.messages.CustomerMessages;
import org.springframework.stereotype.Component;

import java.util.Optional;

@RequiredArgsConstructor
@Component // bunun sayesinde init oluyor ... ramde hashde yer kaplıyor dynamic
public class CustomerBusinessRules {
    private final CustomerRepository customerRepository;

    public void customerWithSameNationalityIdCannotExist(int nationalityId){
        Optional<Customer>  customer = customerRepository.findByNationalityId(nationalityId);

        if(customer.isPresent())
            throw new BusinessException(CustomerMessages.CUSTOMER_WITH_SAME_IDENTITY_EXISTS);
    }
}
