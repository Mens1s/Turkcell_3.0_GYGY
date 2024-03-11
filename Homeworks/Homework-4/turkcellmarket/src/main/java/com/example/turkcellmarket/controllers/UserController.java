package com.example.turkcellmarket.controllers;

import com.example.turkcellmarket.entities.User;
import com.example.turkcellmarket.services.abstracts.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping
    public List<User> getAll(){
        return userService.getAll();
    }

    @PostMapping
    public void add(@RequestBody User user){
        userService.add(user);
    }
}
