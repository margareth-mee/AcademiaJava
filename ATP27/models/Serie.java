package models;

public class Serie extends Base {
    public String titulo;
    public int numEpisodios; 

   @Override
   public String toString() {
        return super.toString() + "\nTítulo: " + this.titulo + "\nNúmero de Episódios: " + this.numEpisodios;
   }
   
}
