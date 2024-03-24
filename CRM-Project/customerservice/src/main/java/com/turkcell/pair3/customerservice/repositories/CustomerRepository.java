package com.turkcell.pair3.customerservice.repositories;

import com.turkcell.pair3.customerservice.entities.Customer;
import com.turkcell.pair3.customerservice.services.dtos.requests.SearchCustomerRequest;
import com.turkcell.pair3.customerservice.services.dtos.responses.SearchCustomerResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    /*@Query("Select new com.turkcell.pair3.customerservice.service.dtos.responses." +
            "SearchCustomerResponse(c.customerId, c.firstName, c.lastName, c.secondName, c.nationalityId)" +
            " from Customer c" +
            " where (:nationalityId <= 0 or c.nationalityId=:nationalityId) " +
            " and ( :customerId is null or c.customerId=:customerId)")
        // Parameter SPEL Expression (Spring Expression)
    List<SearchCustomerResponse> search(String customerId, int nationalityId);
    */

    Customer findByNationalityId(int nationalityId);

    Customer findByCustomerId(String customerId);
    @Query("Select new com.turkcell.pair3.customerservice.services.dtos.responses." +
            "SearchCustomerResponse(c.customerId, c.firstName, c.lastName, c.secondName, c.nationalityId)" +
            " from Customer c" +
            " where ( :#{#request.getNationalityId()} <= 0 or c.nationalityId= :#{#request.getNationalityId()})" +
            " and ( :#{#request.getCustomerId()} is null or c.customerId= :#{#request.getCustomerId()})")
        // Parameter SPEL Expression (Spring Expression)
    List<SearchCustomerResponse> search(SearchCustomerRequest request);
}
