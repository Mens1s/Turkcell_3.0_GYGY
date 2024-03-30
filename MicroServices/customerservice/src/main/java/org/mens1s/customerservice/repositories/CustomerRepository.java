package org.mens1s.customerservice.repositories;

import org.mens1s.customerservice.entites.Customer;
import org.mens1s.customerservice.services.dtos.requests.SearchCustomerRequest;
import org.mens1s.customerservice.services.dtos.responses.SearchCustomerResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query(
            "SELECT new org.mens1s.customerservice.services.dtos.responses." +
            "SearchCustomerResponse(c.customerId, c.firstName, c.lastName, c.secondName, c.nationalityId)" +
            " from Customer c" +
                " where ( :#{#request.getNationalityId()} <= 0 or c.nationalityId= :#{#request.getNationalityId()})" +
                " and ( :#{#request.getCustomerId()} is null or c.customerId= :#{#request.getCustomerId()})"
    )
    List<SearchCustomerResponse> search(SearchCustomerRequest request);

    Optional<Customer> findByNationalityId(int nationalityId);
}
