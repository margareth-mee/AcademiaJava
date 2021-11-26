package com.superdevs.banco.repository;

import com.superdevs.banco.model.Cliente;

import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Integer>{
    
}
