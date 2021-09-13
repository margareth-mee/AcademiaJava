package modulo1;

import java.util.Scanner;

public class Produto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------- Cadastro de Produtos -------------------\n");
        System.out.println("\tBem-vindo(a), digite as informações para cadastrar um produto.");

        System.out.print("\tDigite o nome do produto: ");
        String nome = sc.next();

        System.out.print("\tDigite a descrição do produto: ");
        String descricao = sc.next();

        System.out.print("\tDigite o valor do produto: ");
        double valor = sc.nextDouble();

        System.out.print("\tDigite a categoria do produto: ");
        String categoria = sc.next();

        System.out.printf("\tO nome do produto %s: %s, o valor é R$ %.2f, a categoria é %s.",nome, descricao, valor, categoria);

    }
}
