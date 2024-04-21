package com.turkcell.authservice.core.filters;

import com.turkcell.authservice.core.jwt.JwtService;
import com.turkcell.authservice.services.abstracts.UserService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
@RequiredArgsConstructor
public class JwtAuthFilter extends OncePerRequestFilter {
    private final JwtService jwtService;
    private final UserService userService;
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        // do your jobs
        String jwtHeader = request.getHeader("Authorization");
        if(jwtHeader != null && jwtHeader.startsWith("Bearer ")){
            String jwt = jwtHeader.substring(7);

            String username = jwtService.extractUser(jwt);
            UserDetails user = userService.loadUserByUsername(username);

            if(jwtService.validateToken(jwt, user)){
                // enter spring sec
                UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());
                token.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

                SecurityContextHolder.getContext().setAuthentication(token);
            }
        }
        // continue to chain
        filterChain.doFilter(request, response);
    }
}
