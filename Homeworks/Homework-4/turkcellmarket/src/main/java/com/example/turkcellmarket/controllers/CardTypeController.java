package com.example.turkcellmarket.controllers;

import com.example.turkcellmarket.entities.CardType;
import com.example.turkcellmarket.services.abstracts.CardTypeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/card-type")
@AllArgsConstructor
public class CardTypeController {
    private final CardTypeService cardTypeService;
    @GetMapping
    public List<CardType> getAll(){
        return cardTypeService.getAll();
    }
    @PostMapping
    public void add(@RequestBody CardType cardType){
        cardTypeService.add(cardType);
    }
}
