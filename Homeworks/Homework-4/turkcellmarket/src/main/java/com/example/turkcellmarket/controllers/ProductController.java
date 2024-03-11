package com.example.turkcellmarket.controllers;

import com.example.turkcellmarket.services.abstracts.ProductService;
import com.example.turkcellmarket.services.dtos.requests.ProductAddRequest;
import com.example.turkcellmarket.services.dtos.responses.ProductGetResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@AllArgsConstructor
public class ProductController {
    private ProductService productService;

    @GetMapping
    public List<ProductGetResponse> getAll(){
        return productService.getAll();
    }

    @GetMapping("search")
    public List<ProductGetResponse> search(@RequestParam String query){
        return productService.searchQuery(query);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void add(@RequestBody @Valid ProductAddRequest product){
        productService.add(product);
    }
}
