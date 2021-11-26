package com.superdevs.banco;

import com.superdevs.banco.model.Agencia;
import com.superdevs.banco.model.Cliente;
import com.superdevs.banco.repository.AgenciaRepository;
import com.superdevs.banco.repository.ClienteRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BancoApplication implements CommandLineRunner{
	private ClienteRepository repositoryCliente;
	private AgenciaRepository repositoryAgencia;

	public BancoApplication(ClienteRepository repository1, AgenciaRepository repository2){
			this.repositoryCliente = repository1;
			this.repositoryAgencia = repository2;
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
		repositoryCliente.save(model);

		model1.setNome("Michael Jackson");
		repositoryCliente.save(model1);

		/*READ*/
		System.out.println("======== SAVE ========");
		repositoryCliente.findAll().forEach(f -> System.out.printf("Id: %d | Nome: %s\n", f.getId(), f.getNome()));
	
		/*UPDATE*/
		System.out.println("======== UPPDATE ========");
		model1.setId(2);
		model1.setNome("Michael Jordan"); 
		repositoryCliente.save(model1);
		repositoryCliente.findAll().forEach(f -> System.out.printf("Id: %d | Nome: %s\n", f.getId(), f.getNome()));
	
		/*DELETE*/
		System.out.println("======== DELETE========");
		repositoryCliente.delete(model1);
		repositoryCliente.findAll().forEach(f -> System.out.printf("Id: %d | Nome: %s\n", f.getId(), f.getNome()));

		Agencia model2 = new Agencia();
		Agencia model3 = new Agencia();
		
		/*SAVE*/
		model2.setNome("Talents ");
		repositoryAgencia.save(model2);

		model3.setNome("Show Bussines");
		repositoryAgencia.save(model3);

		/*READ*/
		System.out.println("======== SAVE ========");
		repositoryAgencia.findAll().forEach(f -> System.out.printf("Id: %d | Nome: %s\n", f.getId(), f.getNome()));
	
		/*UPDATE*/
		System.out.println("======== UPPDATE ========");
		model3.setId(2);
		model3.setNome("Michael Jordan"); 
		repositoryAgencia.save(model3);
		repositoryAgencia.findAll().forEach(f -> System.out.printf("Id: %d | Nome: %s\n", f.getId(), f.getNome()));
	
		/*DELETE*/
		System.out.println("======== DELETE========");
		repositoryAgencia.delete(model3);
		repositoryAgencia.findAll().forEach(f -> System.out.printf("Id: %d | Nome: %s\n", f.getId(), f.getNome()));
	}
}
