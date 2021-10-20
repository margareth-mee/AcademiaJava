package views;

import java.util.ArrayList;

import controllers.FilmeController;
import controllers.SerieController;
import models.Filme;
import models.Serie;

public class Main {
    public static void main(String[] args) {
        FilmeController filmeController = new FilmeController();
        SerieController serieController = new SerieController();

        Filme f1 = new Filme();
        f1.id = 123;
        f1.titulo = "Titanic";
        f1.categoria = "Drama";

        Filme f2 = new Filme();
        f2.id = 123;
        f2.titulo = "Matrix";
        f2.categoria = "Ficção";

        Serie s1 = new Serie();
        s1.id = 124;
        s1.titulo = "Lost";
        s1.numEpisodios = 10000;

        Serie s2 = new Serie();
        s2.id = 124;
        s2.titulo = "Todo mundo odeia o Chris";
        s2.numEpisodios = 500;

        filmeController.create(f1);
        serieController.create(s1);

        System.out.println("-------------- Listando Filmes --------------");
        listar(filmeController);
        System.out.println("--------------Listando Series --------------");
        listar(serieController);

        filmeController.update(f2);
        serieController.update(s2);

        System.out.println("-------------- Update Filmes --------------");
        listar(filmeController);
        System.out.println("-------------- Update Serie --------------");
        listar(serieController);

        filmeController.delete(f2);
        serieController.delete(s2);

    }

    static public void listar(Object obj) {

        if (obj instanceof FilmeController) {
            FilmeController controller = (FilmeController) obj;
            ArrayList<Filme> lista = controller.read();

            for (Filme filme : lista) {
                System.out.println(filme);
            }
        } else if (obj instanceof SerieController) {
            SerieController controller = (SerieController) obj;
            ArrayList<Serie> lista = controller.read();

            for (Serie serie : lista) {
                System.out.println(serie);
            }
        }
    }
}
