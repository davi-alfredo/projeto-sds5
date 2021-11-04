package com.devsuperior.dsvendas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
		  info = @Info(
		  title = "Semana Spring React - DevSUperior",
		  description = "" +
		    "Api desenvolvida durante a Semana Spring React da DevSuperior para fornecer informações ao frontend DSVendas",
		  contact = @Contact(
		    name = "David Alfredo dos Santos", 
		    url = "https://linkedin.com/in/david-alfredo-a8733243",		    
		    email = "https://github.com/davi-alfredo"
		  )
		)
	)
public class DsvendasApplication {
	public static void main(String[] args) {
		SpringApplication.run(DsvendasApplication.class, args);
	}

}
