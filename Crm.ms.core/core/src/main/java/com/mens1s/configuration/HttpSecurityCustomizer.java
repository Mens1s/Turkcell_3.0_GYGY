package com.mens1s.configuration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;

public interface HttpSecurityCustomizer {
    void customize(HttpSecurity httpSecurity) throws Exception;
}
