import java.util.Scanner;
/*
 _ Leia dois valores do tipo double, digitados pelo usuário.
 _ Realize a chamada para um método que faz a soma entre os dois números e retorna o resultado.
 _ Realize a chamada para um método que faz a subtração entre os dois números e retorna o resultado.
 _ Realize a chamada para um método que faz a multiplicação entre os dois números e retorna o resultado.
 _ Realize a chamada para um método que faz a divisão entre os dois números e retorna o resultado.
*/
public class Metodos {

    public static void main(String[] args) {

        System.out.println("\t----------------- Calculadora ------------------------");
        double num1 = lerNumero("\tDigite o primeiro número: ");
        double num2 = lerNumero("\tDigite o segundo número: ");

        System.out.printf("\n\tAdição: (%.2f) + (%.2f) = %.2f ", num1, num2, soma(num1, num2));
        System.out.printf("\n\tSubtração: (%.2f) - (%.2f) = %.2f", num1, num2, subtracao(num1, num2));
        System.out.printf("\n\tMultiplicação: (%.2f) * (%.2f) = %.2f", num1, num2, multiplicacao(num1, num2));
        System.out.printf("\n\tDivisão: (%.2f) / (%.2f) = %.2f", num1, num2, divisao(num1, num2));

        System.out.println("\n\t----------------- FIM ------------------------");
    }

    static double soma(double num1, double num2){
        return num1 + num2;
    }
    static double subtracao(double num1, double num2){
        return num1 - num2;
    }
    static double multiplicacao(double num1, double num2){
        return num1*num2;
    }
    static double divisao(double num1, double num2){
        if(num2 == 0){
            System.out.println("Erro: o denominador deve ser maior que 0.");
            return 0;
        }
        return num1/num2;
    }
    static Double lerNumero(String mensagem){
        Scanner sc = new Scanner(System.in);
        System.out.print(mensagem);
        Double numero = Double.parseDouble(sc.nextLine());
        return numero;
    }
}

