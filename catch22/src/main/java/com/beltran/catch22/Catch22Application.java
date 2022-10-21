package com.beltran.catch22;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class Catch22Application {

	public static void main(String[] args) {
		SpringApplication.run(Catch22Application.class, args);
	}

}
