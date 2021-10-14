package view;

import java.lang.ModuleLayer.Controller;
import java.util.ArrayList;
import java.util.Scanner;

import controller.LivrosController;
import model.Livros;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        LivrosController controller = new LivrosController();
        int opcao = lerInteiro(
                "Digite uma das opcoes abaixo: \n\t1 - create \n\t2 - read \n\t3 - update \n\t4 - delete");

        do {
            switch (opcao) {
                case 1:
                    create(controller);
                    break;
                case 2:
                    read(controller);
                    break;
                /*case 3:
                    update(controller);
                    break;
                case 4:
                    delete(controller);
                    break;*/
                default:
                    break;
            }
        } while (opcao != 0);
    }

    public static int lerInteiro(String mensagem) {
        System.out.println(mensagem);
        int numero = Integer.parseInt(scan.nextLine());
        return numero;
    }
    public static String lerString(String mensagem){
        System.out.println(mensagem);
        return scan.nextLine();
    }
    public static void create(LivrosController controller){
        Livros livro = new Livros();
        
        livro.setAutor(lerString("Digite o autor do livro: "));
        livro.setTitulo(lerString("Digite o título do livro: "));
        controller.create(livro);
    }
    public static void read(LivrosController controller){
        ArrayList <Livros> lista = controller.read();

        for (Livros livro : lista) {
            System.out.printf("\nTítulo: %s, Autor: %s\n", livro.getTitulo(), livro.getAutor());
        }
    }
    /*public static void update(LivrosController controller, Livros livro){
        controller.update(livro);

    }
    public static void delete(LivrosController controller, Livros livro){
        controller.delete(livro);
    }*/

}
