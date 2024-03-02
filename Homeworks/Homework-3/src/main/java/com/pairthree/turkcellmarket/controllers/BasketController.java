package com.pairthree.turkcellmarket.controllers;

import com.pairthree.turkcellmarket.entities.Basket;
import com.pairthree.turkcellmarket.services.abstracts.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/baskets")
public class BasketController {

    @Autowired
    private BasketService basketService;

    @PostMapping
    private void add(@RequestBody Basket basket) {
        basketService.add(basket);
    }

    @PutMapping
    private void update(@RequestBody Basket basket) {
        basketService.update(basket);
    }

    @DeleteMapping
    private void delete(@RequestBody Basket basket) {
        basketService.delete(basket);
    }

    @GetMapping("/{id}")
    private Basket get(@PathVariable("id") String id) {
        return basketService.get(id);
    }

    @GetMapping
    private List<Basket> getAll() {
        return basketService.getAll();
    }
}
