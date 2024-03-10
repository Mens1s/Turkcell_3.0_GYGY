package com.example.turkcellmarket.services.concretes;

import com.example.turkcellmarket.entities.Bank;
import com.example.turkcellmarket.repositories.abstracts.BankIdRespository;
import com.example.turkcellmarket.services.abstracts.BankIdService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class BankIdServiceImpl implements BankIdService {
    private BankIdRespository bankIdRespository;

    @Override
    public void add(Bank bank) {
        bankIdRespository.save(bank);
    }

    @Override
    public List<Bank> getAll() {
        return bankIdRespository.findAll();
    }
}
