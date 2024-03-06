package com.example.turkcellmarket.controllers;

import com.example.turkcellmarket.entities.Product;
import com.example.turkcellmarket.services.abstracts.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@AllArgsConstructor
public class ProductController {
    private ProductService productService;

    @GetMapping
    public List<Product> getAll(){
        return productService.getAll();
    }

    @PostMapping
    public void add(@RequestBody Product product){
        productService.add(product);
    }
}
