package modulo1.aula1;

import java.util.Scanner;

public class a1_console {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.next();

        System.out.print("Digite o seu sobre nome: ");
        String sobrenome = scanner.next();

        System.out.println("O nome e o sobrenome são: "+ nome + "" + sobrenome);
    }
}
