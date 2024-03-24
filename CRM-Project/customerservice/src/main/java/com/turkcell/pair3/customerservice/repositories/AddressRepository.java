package com.turkcell.pair3.customerservice.repositories;

import com.turkcell.pair3.customerservice.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
