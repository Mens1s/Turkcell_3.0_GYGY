package com.pairthree.turkcellmarket.services.concretes;

import com.pairthree.turkcellmarket.entities.Basket;
import com.pairthree.turkcellmarket.repositories.concretes.BasketRepository;
import com.pairthree.turkcellmarket.services.abstracts.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketServiceImpl implements BasketService {

    @Autowired
    private BasketRepository basketRepository;

    @Override
    public void add(Basket basket) {
        basketRepository.add(basket);
    }

    @Override
    public void update(Basket basket) {
        basketRepository.update(basket);
    }

    @Override
    public void delete(Basket basket) {
        basketRepository.delete(basket.getId());
    }

    @Override
    public Basket get(String id) {
        return basketRepository.get(id);
    }

    @Override
    public List<Basket> getAll() {
        return basketRepository.getAll();
    }
}
