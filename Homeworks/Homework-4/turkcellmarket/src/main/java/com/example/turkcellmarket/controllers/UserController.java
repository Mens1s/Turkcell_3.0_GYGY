package com.example.turkcellmarket.controllers;

import com.example.turkcellmarket.entities.User;
import com.example.turkcellmarket.services.abstracts.UserService;
import com.example.turkcellmarket.services.dtos.requests.UserAddRequest;
import com.example.turkcellmarket.services.dtos.responses.UserGetResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping
    public List<UserGetResponse> getAll(){
        return userService.getAll();
    }

    @PostMapping
    public void add(@RequestBody UserAddRequest request){
        userService.add(request);
    }
}
