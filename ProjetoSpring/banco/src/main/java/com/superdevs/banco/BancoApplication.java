package com.superdevs.banco;

import com.superdevs.banco.model.Filme;
import com.superdevs.banco.repository.FilmeRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BancoApplication implements CommandLineRunner{
	private FilmeRepository repository;

	public BancoApplication(FilmeRepository repository){
			this.repository = repository;
	}

	public static void main(String[] args) {
		SpringApplication.run(BancoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Filme model = new Filme();
		model.setNome("De repente 30");
		model.setNomeDiretor("Wood Allen");
		model.setGenero("comedia");

		/* Filme model = new Filme();
		model.setId(3);
		model.setNome("Esqueceram de mim");
		model.setNomeDiretor("Kevin");
		model.setGenero("Aventura"); */ 

		repository.save(model);

	/* 	List<Filme> lista = (List<Filme>) repository.findAll();

		for (Filme filme : lista) {
			System.out.printf("Id: %d | Nome: %s\n", filme.getId(), filme.getNome());
		}
		System.out.println("\n"); */

		repository.findAll().forEach(f -> System.out.printf("Id: %d | Nome: %s\n", f.getId(), f.getNome()));
	
	}
}
