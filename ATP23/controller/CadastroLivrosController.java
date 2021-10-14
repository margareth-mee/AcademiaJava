package controller;

import java.util.ArrayList;

import model.CadastroLivros;

public class CadastroLivrosController {
    private ArrayList<CadastroLivros> lista_livros;  

    public CadastroLivrosController(){
        this.lista_livros = new ArrayList<CadastroLivros>();
    }

    //CRUD
    //create
    public void create(CadastroLivros livro){
        this.lista_livros.add(livro);
    }

    //read
    public ArrayList<CadastroLivros> read(){
        return this.lista_livros; 
    }

    //update
    public void update(CadastroLivros livro){
        int tamanho = this.lista_livros.size();

        for (int i = 0; i < tamanho; i++) {
            CadastroLivros livro_aux = this.lista_livros.get(i);
            
            if(livro_aux.getId() == livro.getId()){
                this.delete(livro_aux);
                this.create(livro);
            }
        }
    }

    //delete
    public void delete(CadastroLivros livro){
        this.lista_livros.remove(livro);
    }

}
