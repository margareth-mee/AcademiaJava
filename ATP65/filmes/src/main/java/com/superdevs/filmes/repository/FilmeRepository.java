package com.superdevs.filmes.repository;

import com.superdevs.filmes.model.Filme;

import org.springframework.data.repository.CrudRepository;

public interface FilmeRepository extends CrudRepository<Filme, Integer>{
    
}

