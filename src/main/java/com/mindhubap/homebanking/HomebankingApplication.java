package com.mindhubap.homebanking;

import com.mindhubap.homebanking.models.Client;
import com.mindhubap.homebanking.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HomebankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomebankingApplication.class, args);
	}

	@Bean
	public CommandLineRunner init(ClientRepository clientRepository){
		return args -> {
			Client client = new Client("Alicia", "Sombra", "alis8@mindhub.com");
			System.out.println(client);
			clientRepository.save(client);
			System.out.println(client);


			//person.name = "Guille";
			//System.out.println(person.name);

		};
	}
}
