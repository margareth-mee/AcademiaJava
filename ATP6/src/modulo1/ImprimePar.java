package modulo1;

public class ImprimePar {
    public static void main(String[] args) {

        System.out.println("\t------------- Imprime Números Pares -------------\n");
        System.out.println("\tEste programa imprime os números pares de 0 a 100");

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) { // quando for igual de 0 é par
                System.out.printf("\t %d \n", i);
            }
        }

        System.out.println("\t------------- Fim do Programa -------------");
    }
}
