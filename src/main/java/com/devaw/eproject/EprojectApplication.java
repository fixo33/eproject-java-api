package com.devaw.eproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class EprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EprojectApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer()
	{
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				WebMvcConfigurer.super.addCorsMappings(registry);
				registry.addMapping("/**").allowedOrigins("http://localhost:4200");
			}
		};
	}
}
