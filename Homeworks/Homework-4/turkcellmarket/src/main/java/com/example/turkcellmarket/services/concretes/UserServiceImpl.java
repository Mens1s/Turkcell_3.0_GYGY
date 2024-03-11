package com.example.turkcellmarket.services.concretes;

import com.example.turkcellmarket.entities.User;
import com.example.turkcellmarket.repositories.abstracts.UserRepository;
import com.example.turkcellmarket.services.abstracts.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    @Override
    public void add(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }
}
