package modulo1;

import java.util.Scanner;

public class Cadastro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------------- Sistema de cadastro -------------\n");
        System.out.println("Bem-vindo, digite a categoria para realizar o cadastro:");
        System.out.println("1 : filmes ");
        System.out.println("2 : séries ");
        System.out.println("3 : documentários ");
        System.out.println("4 : sair ");
        int categoria = sc.nextInt();
        sc.nextLine();

        switch (categoria) {
            case 1:
                System.out.print("\tDigite o nome do filme: ");
                String filme = sc.nextLine();
                System.out.print("\tDigite a descrição: ");
                String descricao = sc.nextLine();
                System.out.print("\tDigite o gênero: ");
                String genero = sc.nextLine();
                System.out.print("\tDigite o ano de lançamento: ");
                int anoFilme = sc.nextInt();

                System.out.print("\tCadastro realizado com sucesso!");
                break;
            case 2:
                System.out.print("\tDigite o nome da série: ");
                String serie = sc.nextLine();
                System.out.print("\tDigite a descrição: ");
                String produtora = sc.nextLine();
                System.out.print("\tDigite o ano de lançamento: ");
                int anoSerie = sc.nextInt();

                System.out.print("\tCadastro realizado com sucesso!");
                break;
            case 3:
                System.out.print("\tDigite o nome do Documentário: ");
                String documentario = sc.nextLine();
                System.out.print("\tDigite o tema: ");
                String tema = sc.nextLine();
                System.out.print("\tDigite o ano de lançamento: ");
                int anoDoc = sc.nextInt();

                System.out.print("\tCadastro realizado com sucesso!");
                break;
            case 4:
                System.out.println("Saindo do menu!");
                break;
            default:
                System.out.println("A categoria não existe!");
                break;
        }

    }
}
