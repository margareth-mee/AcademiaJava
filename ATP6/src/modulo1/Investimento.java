package modulo1;

public class Investimento {
    public static void main(String[] args) {
        System.out.println("\t------------- Calcula Retorno Total de Investimento -------------\n");
        System.out.println("\tEste programa calcula o retorno mensal e total de um investimento.\n");
        double investimento = 5000;
        double juros = 0.02;
        double acrescimoMensal = 0;
        double montante = investimento;

        for (int i = 0; i < 24 ; i++) {
            acrescimoMensal = montante*juros;
            montante += acrescimoMensal;
            System.out.printf("\tO retorno do %dº mês é de %.2f \n", i+1, montante);
        }

        System.out.printf("\n\tO retorno total é %.2f ", montante);
    }

}
