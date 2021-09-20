package modulo1;

import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        System.out.println("\t------------- Cadastro de pessoas -------------\n");
        System.out.println("\tBem-vindo(a) ao sistema de cadastro! ");

        System.out.println("\tDigite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("\tDigite seu sobrenome: ");
        String sobrenome = sc.nextLine();

        System.out.println("\t------------- Usando While ------------- ");
        cont = 0;
        while( cont < 10){
            System.out.printf("\t %dº vez: %s %s \n", cont+1, nome, sobrenome);
            cont++;
        }

        System.out.println("\t------------- Usando For ------------- ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("\t %dº vez: %s %s \n", i+1, nome, sobrenome);
        }

        System.out.println("\n\tFim");
    }
}