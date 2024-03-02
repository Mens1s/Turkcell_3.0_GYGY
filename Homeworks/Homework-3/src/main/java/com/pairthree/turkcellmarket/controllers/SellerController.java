package com.pairthree.turkcellmarket.controllers;

import com.pairthree.turkcellmarket.entities.user.Seller;
import com.pairthree.turkcellmarket.services.abstracts.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sellers")
public class SellerController {
    @Autowired
    private SellerService sellerService;

    @PostMapping
    private void add(@RequestBody Seller seller) {
        sellerService.add(seller);
    }

    @PutMapping
    private void update(@RequestBody Seller seller) {
        sellerService.update(seller);
    }

    @DeleteMapping("/{id}")
    private void delete(@PathVariable("id") String id) {
        sellerService.delete(id);
    }

    @GetMapping("/{id}")
    private Seller get(@PathVariable("id") String id) {
        return sellerService.get(id);
    }

    @GetMapping
    private List<Seller> getAll() {
        return sellerService.getAll();
    }
}
