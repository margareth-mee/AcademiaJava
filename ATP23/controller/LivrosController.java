package controller;

import java.util.ArrayList;

import model.Livros;

public class LivrosController {
    private ArrayList<Livros> lista_livros;  

    public LivrosController(){
        this.lista_livros = new ArrayList<Livros>();
    }

    //CRUD
    //create
    public void create(Livros livro){
        this.lista_livros.add(livro);
    }

    //read
    public ArrayList<Livros> read(){
        return this.lista_livros; 
    }

    //update
    public void update(Livros livro){
        int tamanho = this.lista_livros.size();

        for (int i = 0; i < tamanho; i++) {
            Livros livro_aux = this.lista_livros.get(i);
            
            if(livro_aux.getId() == livro.getId()){
                this.delete(livro_aux);
                this.create(livro);
            }
        }
    }

    //delete
    public void delete(Livros livro){
        this.lista_livros.remove(livro);
    }

}
