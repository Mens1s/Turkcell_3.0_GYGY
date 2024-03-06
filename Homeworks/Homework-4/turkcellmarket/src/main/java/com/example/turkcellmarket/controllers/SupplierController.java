package com.example.turkcellmarket.controllers;

import com.example.turkcellmarket.entities.Supplier;
import com.example.turkcellmarket.services.abstracts.SupplierService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplier")
@AllArgsConstructor
public class SupplierController {
    private final SupplierService supplierService;

    @GetMapping
    public List<Supplier> getAll(){
        return supplierService.getAll();
    }

    @PostMapping
    public void add(@RequestBody Supplier supplier){
        supplierService.add(supplier);
    }
}
