package com.superdevs.filmes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "filme")
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter //o lombok gera automatica os getters e setters através dessa notatio
    @Setter
    private int id;

    @Getter 
    @Setter
    private String nome;

    @Getter 
    @Setter
    private String nomeDiretor;

    @Getter 
    @Setter
    private String genero;   
}