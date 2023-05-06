package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
info =@Info(
		title = "BoutiqueManagement",
	version = "1.1.2",
	description = "Boutique Project",
	contact = @Contact(
			name = "Boutique",
			email = "kratos@max.io"
			)
	)
)
public class BoutiqueApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoutiqueApplication.class, args);
	}

}
