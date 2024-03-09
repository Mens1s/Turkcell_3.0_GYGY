package com.example.turkcellmarket.controllers;

import com.example.turkcellmarket.entities.ProductSupplier;
import com.example.turkcellmarket.services.abstracts.ProductSupplierService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/product-supplier")
@AllArgsConstructor
public class ProductSupplierController {
    private final ProductSupplierService productSupplierService;

    public List<ProductSupplier> getAll(){
        return productSupplierService.getAll();
    }

    public void add(@RequestBody ProductSupplier productSupplier){
        productSupplierService.add(productSupplier);
    }
}
