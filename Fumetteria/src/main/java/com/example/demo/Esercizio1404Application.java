package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackages = {"compiler.example.demo", "it.esercizio"})
@EnableJpaRepositories(basePackages = {"it.esercizio.repository"})
@EntityScan(basePackages = {"it.esercizio.model"})
public class Esercizio1404Application {

	public static void main(String[] args) {
		SpringApplication.run(Esercizio1404Application.class, args);
	}

}
