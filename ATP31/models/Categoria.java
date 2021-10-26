package models;

public class Categoria extends BaseID{
    public String descricao;

    @Override
    public String toString() {
        return "\nCategoria ID: " + this.id + "\nCategoria: " + descricao;
    }
}
