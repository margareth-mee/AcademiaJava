package model;

public class Livros extends Base{
    private String titulo;
    private String autor;
   
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAutor() {
        return autor;
    } 

    @Override
    public boolean equals(Object obj) {
        Livros livro = (Livros) obj;

        if(this.getId() == livro.getId()){
            return true;
        }
        else{
            return false;
        }
    }
}