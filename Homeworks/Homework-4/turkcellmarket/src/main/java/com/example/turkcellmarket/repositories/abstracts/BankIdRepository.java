package com.example.turkcellmarket.repositories.abstracts;

import com.example.turkcellmarket.entities.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankIdRepository extends JpaRepository<Bank, Integer> {

}
