package models;

public class Filme extends Base{
    public String titulo;
    public String categoria;

    @Override
    public String toString() {
        return super.toString() + "\nTítulo: " + this.titulo + "\nCategoria: " + this.categoria;
    }

}
