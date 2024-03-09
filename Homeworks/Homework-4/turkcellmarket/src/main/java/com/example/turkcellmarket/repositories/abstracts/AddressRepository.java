package com.example.turkcellmarket.repositories.abstracts;

import com.example.turkcellmarket.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
