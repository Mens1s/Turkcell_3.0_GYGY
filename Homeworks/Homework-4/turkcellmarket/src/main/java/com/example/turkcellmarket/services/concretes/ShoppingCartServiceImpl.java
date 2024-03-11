package com.example.turkcellmarket.services.concretes;

import com.example.turkcellmarket.entities.ShoppingCart;
import com.example.turkcellmarket.entities.User;
import com.example.turkcellmarket.repositories.abstracts.ShoppingCartRepository;
import com.example.turkcellmarket.services.abstracts.ShoppingCartService;
import com.example.turkcellmarket.services.dtos.requests.ShoppingCartAddRequest;
import com.example.turkcellmarket.services.dtos.responses.ShoppingCartGetResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ShoppingCartServiceImpl implements ShoppingCartService {
    private final ShoppingCartRepository shoppingCartRepository;

    @Override
    public void add(ShoppingCartAddRequest shoppingCartAddRequest) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setTotalPrice(shoppingCartAddRequest.getTotalPrice());

        User user = new User();
        user.setId(shoppingCartAddRequest.getUserId());
        shoppingCart.setUser(user);

        shoppingCartRepository.save(shoppingCart);
    }

    @Override
    public List<ShoppingCartGetResponse> getAll() {
        return null;
    }
}
