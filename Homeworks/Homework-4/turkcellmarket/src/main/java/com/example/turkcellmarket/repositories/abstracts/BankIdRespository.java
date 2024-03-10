package com.example.turkcellmarket.repositories.abstracts;

import com.example.turkcellmarket.entities.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankIdRespository extends JpaRepository<Bank, Integer> {
    Bank findByName(String bank_name);
}
