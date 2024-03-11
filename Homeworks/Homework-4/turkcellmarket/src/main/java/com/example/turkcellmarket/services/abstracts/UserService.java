package com.example.turkcellmarket.services.abstracts;

import com.example.turkcellmarket.entities.User;
import com.example.turkcellmarket.services.dtos.product.requests.UserAddRequest;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> getAll();
}
