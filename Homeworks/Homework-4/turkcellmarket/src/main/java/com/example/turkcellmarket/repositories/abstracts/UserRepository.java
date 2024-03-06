package com.example.turkcellmarket.repositories.abstracts;

import com.example.turkcellmarket.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
