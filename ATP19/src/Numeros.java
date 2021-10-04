import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayInteiros = new int[10];

        for (int i = 0; i < arrayInteiros.length; i++) {
            System.out.printf("Digite o valor do %dº número inteiro: ", i+1);
            arrayInteiros[i] = Integer.parseInt(sc.nextLine());
        }

        for (int j : arrayInteiros) {
            System.out.printf("Valor: %d\n", j);         
        }

    }
}
