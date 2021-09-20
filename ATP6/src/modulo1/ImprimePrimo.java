package modulo1;

public class ImprimePrimo {
    public static void main(String[] args) {

        System.out.println("\t------------- Imprime Números Primos -------------\n");
        System.out.println("\tEste programa imprime os números primos de 0 a 150.\n");

        for (int i = 0; i <= 150; i++) {
            if(isPrimo(i)){
                System.out.printf("\tO número %d é primo \n", i);
            }
        }

        System.out.println("\t------------- Fim do Programa -------------");
    }

    //função que recebe um numero inteiro e diz se ele é primo ou não
    public static boolean isPrimo(int numero) {
        boolean resultado = true;

        //condição para não deixar 0 ou 1 ser primo
        if(numero==0 || numero ==1){
            resultado = false;
        }

        //laço para testar se um número é primo
        for (int i = 2; i <= numero/2; i++) {
            if (numero % i == 0) {
                resultado = false;
                break;
            }
        }

        return resultado;
    }
}
