package com.example.turkcellmarket.services.concretes;

import com.example.turkcellmarket.entities.CardItem;
import com.example.turkcellmarket.entities.ProductSupplier;
import com.example.turkcellmarket.entities.ShoppingCart;
import com.example.turkcellmarket.repositories.abstracts.CardItemRepository;
import com.example.turkcellmarket.services.abstracts.CardItemService;
import com.example.turkcellmarket.services.dtos.requests.CardItemAddRequest;
import com.example.turkcellmarket.services.dtos.responses.CardItemGetResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CardItemServiceImpl implements CardItemService {

    private final CardItemRepository cardItemRepository;

    @Override
    public void add(CardItemAddRequest cardItemAddRequest) {
        CardItem cardItem = new CardItem();
        cardItem.setItemCount(cardItem.getItemCount());
        cardItem.setPrice(cardItem.getPrice());

        ProductSupplier productSupplier = new ProductSupplier();
        productSupplier.setId(cardItemAddRequest.getProductSupplierId());
        cardItem.setProductSupplier(productSupplier);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setId(cardItemAddRequest.getShoppingCartId());
        cardItem.setShoppingCart(shoppingCart);

        cardItemRepository.save(cardItem);
    }

    @Override
    public List<CardItemGetResponse> getAll() {
        return null;
    }
}
