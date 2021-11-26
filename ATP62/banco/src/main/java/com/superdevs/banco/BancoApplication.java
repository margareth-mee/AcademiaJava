package com.superdevs.banco;

import com.superdevs.banco.model.Cliente;
import com.superdevs.banco.repository.ClienteRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BancoApplication implements CommandLineRunner{
	private ClienteRepository repository;

	public BancoApplication(ClienteRepository repository){
			this.repository = repository;
	}

	public static void main(String[] args) {
		SpringApplication.run(BancoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Cliente model = new Cliente();
		Cliente model1 = new Cliente();
		
		/*SAVE*/
		model.setNome("Inês Brasil");
		repository.save(model);

		model1.setNome("Michael Jackson");
		repository.save(model1);

		/*READ*/
		System.out.println("======== SAVE ========");
		repository.findAll().forEach(f -> System.out.printf("Id: %d | Nome: %s\n", f.getId(), f.getNome()));
	
		/*UPDATE*/
		System.out.println("======== UPPDATE ========");
		model1.setId(2);
		model1.setNome("Michael Jordan"); 
		repository.save(model1);
		repository.findAll().forEach(f -> System.out.printf("Id: %d | Nome: %s\n", f.getId(), f.getNome()));
	
		/*DELETE*/
		System.out.println("======== DELETE========");
		repository.delete(model1);
		repository.findAll().forEach(f -> System.out.printf("Id: %d | Nome: %s\n", f.getId(), f.getNome()));
	}
}
