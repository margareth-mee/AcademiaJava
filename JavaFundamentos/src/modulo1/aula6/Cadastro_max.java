package modulo1.aula6;

import java.util.Scanner;

public class Cadastro_max{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = "";
        String sobrenome = "";

        System.out.println("\t------------- Cadastro de clientes -------------\n");
        System.out.print("\tBem-vindo, digite o número de clientes que você deseja cadastrar: ");
        int max_clientes = sc.nextInt();
        sc.nextLine();

        for (int ind = 0; ind <max_clientes; ind++) {
            System.out.printf("\tDigite o nome do %dº cliente: ", ind+1);
            nome = sc.nextLine();
            System.out.printf("\tDigite o sobrenome do %dº cliente: ", ind+1);
            sobrenome = sc.nextLine();
        }
        System.out.println("\n\tFim");
    }
}