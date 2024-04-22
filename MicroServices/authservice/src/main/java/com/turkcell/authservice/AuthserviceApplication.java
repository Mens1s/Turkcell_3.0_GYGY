package com.turkcell.authservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication()
//@Import({JwtService.class, UserServiceImpl.class, UserRepository.class})
@ComponentScan(basePackages = {"com.mens1s"})
@EntityScan(basePackages = {"com.mens1s.entities"})
@EnableJpaRepositories(basePackages = {"com.mens1s.repositories"})
public class AuthserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthserviceApplication.class, args);
	}

}
