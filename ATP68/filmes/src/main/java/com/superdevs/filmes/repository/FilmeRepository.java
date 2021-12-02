package com.superdevs.filmes.repository;

import com.superdevs.filmes.model.Filme;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface FilmeRepository extends PagingAndSortingRepository<Filme, Integer>{
    
}

