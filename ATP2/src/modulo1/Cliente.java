package modulo1;

import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------------- Cadastro de clientes -------------\n");
        System.out.println("\tBem-vindo, digite as informações do cliente.");

        System.out.print("\tDigite o nome do cliente: ");
        String nome = sc.nextLine();
        System.out.print("\tDigite o sobrenome do cliente: ");
        String sobrenome = sc.nextLine();

        System.out.print("\tDigite a idade do cliente: ");
        short idade = sc.nextShort();

        if ( idade >=18 ){
            System.out.printf("\tO cliente %s %s de idade %d anos foi cadastrado com sucesso!", nome, sobrenome, idade);
        }else{
            System.out.printf("\tO cliente %s %s é menor de idade, por isso não pode ser cadastrado!", nome, sobrenome, idade);
        }

    }
}
