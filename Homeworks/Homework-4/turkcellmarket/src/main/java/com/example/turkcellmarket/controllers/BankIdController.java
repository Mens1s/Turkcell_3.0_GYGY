package com.example.turkcellmarket.controllers;

import com.example.turkcellmarket.entities.Bank;
import com.example.turkcellmarket.services.abstracts.BankIdService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bank")
@AllArgsConstructor
public class BankIdController {
    private BankIdService bankIdService;
    @GetMapping
    public List<Bank> getAll(){
        return bankIdService.getAll();
    }

    @PostMapping
    public void add(@RequestBody Bank bank){
        bankIdService.add(bank);
    }
}
