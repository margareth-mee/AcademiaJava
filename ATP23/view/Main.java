package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.LivrosController;
import model.Livros;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        LivrosController controller = new LivrosController();
        int opcao; 

        do {
            opcao = lerInteiro(
                "\nOpcões do menu:\n\t0 - sair \n\t1 - cadastrar \n\t2 - listar \nDigite uma opcao: ");

            switch (opcao){
                case 1:
                    cadastrar(controller);
                    break;
                case 2:
                    listar(controller);
                    break;
                default:
                    break;
            }
        } while (opcao != 0);
    }

    public static int lerInteiro(String mensagem) {
        System.out.print(mensagem);
        int numero = Integer.parseInt(scan.nextLine());
        return numero;
    }

    public static String lerString(String mensagem){
        System.out.print(mensagem);
        return scan.nextLine();
    }

    public static void cadastrar(LivrosController controller){
        Livros livro = new Livros();
        
        livro.setAutor(lerString("\nDigite o autor do livro: "));
        livro.setTitulo(lerString("Digite o título do livro: "));
        
        controller.create(livro);
    }

    public static void listar(LivrosController controller){
        ArrayList <Livros> lista = controller.read();

        System.out.println("\n----------- Lista de Livros -----------");
        for (Livros livro : lista) {
            System.out.printf("Título: %s, Autor: %s\n", livro.getTitulo(), livro.getAutor());
        }
    }
 
}
