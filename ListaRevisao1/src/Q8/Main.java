package Q8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] lista = new int[10];

        for (int i = 0; i < lista.length; i++) {
            lista[i] = -1;
        }

        for (int i : lista) {
            System.out.println(i);
        }

        for ( int i = 0; i < lista.length; i++) {
            System.out.printf("Digite o %dº número ímpar: ", i);
            int numero = Integer.parseInt(scan.nextLine());
            if(numero %2 != 0){
                lista[i] = numero;
            }else{
                System.out.println("O número deve ser ímpar!");
                i--;
            }
        }

        for (int i : lista) {
            System.out.println(i);
        }
    }
}
