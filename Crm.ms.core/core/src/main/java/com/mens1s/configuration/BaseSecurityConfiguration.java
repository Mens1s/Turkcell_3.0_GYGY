package com.mens1s.configuration;

import com.mens1s.filters.JwtAuthFilter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import java.util.List;

@RequiredArgsConstructor
@Configuration
public class BaseSecurityConfiguration {
    private final JwtAuthFilter jwtAuthFilter;

    private static final String[] WHITE_LIST_URLS = {
            "/swagger-ui/**",
            "/v2/api-docs",
            "/v3/api-docs",
            "/v3/api-docs/**",
            "/api/v1/auth/**"
    };
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http, List<HttpSecurityCustomizer> httpSecurityCustomizers) throws Exception{
        http
                .csrf(AbstractHttpConfigurer::disable)
                .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class)
                .authorizeHttpRequests(req -> req

                        //.requestMatchers(HttpMethod.GET, "/api/v1/test/**").authenticated()
                        //.requestMatchers(HttpMethod.POST, "/api/v1/test/**").hasAnyAuthority("admin")
                        //.requestMatchers("/swagger-ui/**").authenticated() // comes here authenticate check
                        .requestMatchers(WHITE_LIST_URLS).permitAll()
                        .requestMatchers(HttpMethod.POST, "/api/v1/test/**").hasAnyAuthority("admin")
                        .anyRequest().authenticated()
                );
        // .httpBasic(AbstractHttpConfigurer::disable);
        httpSecurityCustomizers.forEach(customizer -> {
            try {
                customizer.customize(http);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        return http.build();
    }
}
