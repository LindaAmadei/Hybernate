package com.example.hybernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@SpringBootApplication
public class HybernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(HybernateApplication.class, args);
	}

}

