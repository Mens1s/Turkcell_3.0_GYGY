package com.example.turkcellmarket.services.concretes;

import com.example.turkcellmarket.entities.Bank;
import com.example.turkcellmarket.repositories.abstracts.BankIdRepository;
import com.example.turkcellmarket.services.abstracts.BankIdService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class BankIdServiceImpl implements BankIdService {
    private BankIdRepository bankIdRepository;

    @Override
    public void add(Bank bank) {
        bankIdRepository.save(bank);
    }

    @Override
    public List<Bank> getAll() {
        return bankIdRepository.findAll();
    }
}
