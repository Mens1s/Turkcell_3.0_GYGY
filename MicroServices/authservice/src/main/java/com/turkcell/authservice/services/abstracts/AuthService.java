package com.turkcell.authservice.services.abstracts;

import com.turkcell.authservice.services.dtos.requests.LoginRequest;
import com.turkcell.authservice.services.dtos.requests.RegisterRequest;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface AuthService {
    void register(RegisterRequest request);
    void login(LoginRequest request);
}
