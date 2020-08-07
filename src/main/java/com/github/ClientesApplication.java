package com.github;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.model.entity.Cliente;
import com.github.model.repository.ClienteRepository;


@SpringBootApplication
@RestController
public class ClientesApplication {
	
	
	@Value("${application.name}")
	private String applicationName;
	
	@GetMapping("/hello")
	public String hellorWorld() {
		return applicationName;
	}
	
	/*
	@Bean
	public CommandLineRunner run (@Autowired ClienteRepository repository) {
		return args ->{
			Cliente cliente = Cliente.builder().cpf("93586590253").nome("Eduardo").build();
			repository.save(cliente);
		};
	}*/
	

	public static void main(String[] args) {
		SpringApplication.run(ClientesApplication.class, args);
		
		
	}

}
