package com.carapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.carapp")
@EntityScan(basePackages = "com.carapp.bean")
@EnableJpaRepositories(basePackages = "com.carapp.repository")
public class CarAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarAppApplication.class, args);
		System.out.println("server running on port number 8888");
	}

}
