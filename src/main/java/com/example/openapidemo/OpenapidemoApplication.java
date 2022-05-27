package com.example.openapidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class OpenapidemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenapidemoApplication.class, args);
	}

}
