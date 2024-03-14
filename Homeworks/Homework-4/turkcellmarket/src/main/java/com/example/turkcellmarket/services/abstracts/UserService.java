package com.example.turkcellmarket.services.abstracts;

import com.example.turkcellmarket.entities.User;
import com.example.turkcellmarket.services.dtos.requests.UserAddRequest;
import com.example.turkcellmarket.services.dtos.responses.UserGetResponse;

import java.util.List;

public interface UserService {
    User add(UserAddRequest user);
    List<UserGetResponse> getAll();
}
