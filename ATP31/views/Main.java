package views;

import java.util.Scanner;

import controllers.ProdutoController;
import models.Produto;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        ProdutoController controller = new ProdutoController();
        int opcao;

        do {
            imprimeOpcoes();
            opcao = getNumero();
            menu(opcao, controller);
        } while (opcao != 5);

    }

    public static void imprimeOpcoes() {
        System.out.println("Opções: \n1 - Cadastrar \n2 - Atualizar \n3 - Listar \n4 - Deletar \n5 - Sair");
    }

    private static int getNumero() {
        int numero = 0;
        boolean valido;

        do {
            System.out.print("Digite a opção desejada: ");
            try {
                numero = Integer.parseInt(scan.nextLine());
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("O número digitado não é um inteiro!");
                valido = false;
            }
        } while (!valido);

        return numero;
    }

    public static void menu(int opcao, ProdutoController controller) {
        switch (opcao) {
        case 1:
            System.out.println("------- Cadastrar -------");
            controller.create(cadastrar());
            break;
        case 2:
            System.out.println("------- Atualizar -------");
            controller.update(atualizar());
            break;
        case 3:
            System.out.println("------- Listar -------");
            listar(controller);
            break;
        case 4:
            System.out.println("------- Deletar -------");
            controller.delete(deletar());
            break;
        case 5:
            System.out.println("Obrigada por usar o Menu! Até mais.");
            break;
        default:
            System.out.println("A opcão é inválida!");
            break;
        }
    }

    public static Produto cadastrar() {
        Produto p = new Produto();

        System.out.print("Digite o id do produto: ");
        p.id = scan.nextLine();

        System.out.print("Digite o nome do produto: ");
        p.nome = scan.nextLine();

        System.out.print("Digite o id da categoria: ");
        p.categoria.id = scan.nextLine();

        System.out.print("Digite a categoria do produto: ");
        p.categoria.descricao = scan.nextLine();

        System.out.println("O produto foi cadastrado com sucesso!");

        return p;
    }

    public static Produto atualizar() {
        Produto p = new Produto();

        System.out.print("Digite o id do produto que você deseja atualizar: ");
        p.id = scan.nextLine();

        return p;
    }

    public static void listar(ProdutoController controller) {
        for (Produto p : controller.read()) {
            System.out.println(p);
        }
    }

    public static Produto deletar() {
        Produto p = new Produto();

        System.out.print("Digite o id do produto que você deseja deletar: ");
        p.id = scan.nextLine();

        return p;
    }
}
