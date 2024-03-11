package com.example.turkcellmarket.services.concretes;

import com.example.turkcellmarket.entities.Product;
import com.example.turkcellmarket.entities.User;
import com.example.turkcellmarket.entities.WishList;
import com.example.turkcellmarket.repositories.abstracts.WishListRepository;
import com.example.turkcellmarket.services.abstracts.WishListService;
import com.example.turkcellmarket.services.dtos.requests.WishListAddRequest;
import com.example.turkcellmarket.services.dtos.responses.WishListGetResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class WishListServiceImpl implements WishListService {

    private final WishListRepository wishListRepository;

    @Override
    public void add(WishListAddRequest wishListAddRequest) {
        WishList wishList = new WishList();

        User user = new User();
        user.setId(wishListAddRequest.getUserId());
        wishList.setUser(user);

        Product product = new Product();
        product.setId(wishListAddRequest.getProductId());
        wishList.setProduct(product);

        wishListRepository.save(wishList);
    }

    @Override
    public List<WishListGetResponse> getAll() {
        return null;
    }
}
