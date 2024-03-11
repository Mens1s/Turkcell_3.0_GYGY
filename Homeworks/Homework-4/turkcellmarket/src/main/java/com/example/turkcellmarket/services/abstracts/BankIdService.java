package com.example.turkcellmarket.services.abstracts;

import com.example.turkcellmarket.entities.Bank;

import java.util.List;

public interface BankIdService {
    void add(Bank bank);
    List<Bank> getAll();
}
