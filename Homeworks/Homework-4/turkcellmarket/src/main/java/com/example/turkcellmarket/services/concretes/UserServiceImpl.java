package com.example.turkcellmarket.services.concretes;

import com.example.turkcellmarket.entities.ShoppingCart;
import com.example.turkcellmarket.entities.User;
import com.example.turkcellmarket.repositories.abstracts.UserRepository;
import com.example.turkcellmarket.services.abstracts.ShoppingCartService;
import com.example.turkcellmarket.services.abstracts.UserService;
import com.example.turkcellmarket.services.dtos.requests.UserAddRequest;
import com.example.turkcellmarket.services.dtos.responses.UserGetResponse;
import com.example.turkcellmarket.services.mappers.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private ShoppingCartService shoppingCartService;
    @Override
    public User add(UserAddRequest request) {
        User user = UserMapper.INSTANCE.userFromAddRequest(request);
        ShoppingCart shoppingCart = shoppingCartService.createShoppingCartForUser();
        shoppingCart.setUser(user);
        user.setShoppingCart(shoppingCart);

        userRepository.save(user);
        return user;
    }

    @Override
    public List<UserGetResponse> getAll() {
        List<User> users = userRepository.findAll(); // Assuming findAll() method is available in UserRepository
        return users.stream()
                .map(UserMapper.INSTANCE::userToGetResponse) // Use instance of UserMapper interface
                .collect(Collectors.toList());
    }
}
