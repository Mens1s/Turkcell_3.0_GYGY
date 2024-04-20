package com.turkcell.authservice.services.concretes;

import com.turkcell.authservice.services.abstracts.AuthService;
import com.turkcell.authservice.services.abstracts.UserService;
import com.turkcell.authservice.services.dtos.requests.LoginRequest;
import com.turkcell.authservice.services.dtos.requests.RegisterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    private UserService userService;
    private final AuthenticationManager authenticationManager;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void register(RegisterRequest request){

        userService.add(request);
    }

    @Override
    public void login(LoginRequest request) {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));
        System.out.println(authentication.isAuthenticated());
    }

}
