package com.example.turkcellmarket.services.concretes;

import com.example.turkcellmarket.entities.CardType;
import com.example.turkcellmarket.repositories.abstracts.CardTypeRepository;
import com.example.turkcellmarket.services.abstracts.CardTypeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CardTypeServiceImpl implements CardTypeService {
    private CardTypeRepository cardTypeRepository;

    @Override
    public void add(CardType cardType) {
        cardTypeRepository.save(cardType);
    }

    @Override
    public List<CardType> getAll() {
        return cardTypeRepository.findAll();
    }
}
