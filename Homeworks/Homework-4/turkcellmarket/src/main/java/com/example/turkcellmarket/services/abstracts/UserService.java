package com.example.turkcellmarket.services.abstracts;

import com.example.turkcellmarket.entities.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> getAll();
}
