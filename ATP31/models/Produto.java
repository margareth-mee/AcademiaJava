package models;

public class Produto extends BaseID{
    public String nome;
    public Categoria categoria;

    @Override
    public String toString() {
        return "Produto ID: " + this.id + "\nNome: " + this.nome + this.categoria.toString();
    }
}