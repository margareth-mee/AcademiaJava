package com.superdevs.banco.repository;

import com.superdevs.banco.model.Filme;

import org.springframework.data.repository.CrudRepository;

public interface FilmeRepository extends CrudRepository<Filme, Integer>{
    
}
