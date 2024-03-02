package com.pairthree.turkcellmarket.controllers;

import com.pairthree.turkcellmarket.entities.Product;
import com.pairthree.turkcellmarket.services.abstracts.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping
    public void add(@RequestBody Product product){
        productService.add(product);
    }
    @PutMapping
    public void update(@RequestBody Product product){
        productService.update(product);
    }
    @GetMapping
    public List<Product> getAll(){
        return productService.getAll();
    }
}
