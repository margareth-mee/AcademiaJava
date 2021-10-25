import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("---------------- Bem-vindo(a) à Calculadora -----------------");
        int opcao;
        Calculadora hp = new Calculadora();

        do {
            imprimeMenu();

            do {
                opcao = getOpcao("\nDigite a opção desejada: ");
            } while (!validaOpcao(opcao));

            hp.setN1(getInteiro("Digite o valor do primeiro operando: "));
            hp.setN2(getInteiro("Digite o valor do segundo operando: "));

            menu(opcao, hp);

        } while (opcao != 5);
    }

    public static void imprimeMenu() {
        System.out.println("\nOpções do menu: \n1-Soma \n2-Subtração \n3.Multiplicação \n4-Divisão \n5-Sair");
    }

    public static int getOpcao(String mensagem) {
        int numero = 0;
        System.out.print(mensagem);

        try {
            numero = Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException ex) {
            return -1;
        }

        return numero;
    }

    public static boolean validaOpcao(int opcao) {
        if (opcao == -1) {
            System.out.println("O número digitado não é um valor inteiro.");
            return false;
        } else if (opcao < 1 || opcao > 5) {
            System.out.println("O número digitado não corresponde a uma opcão disponível.");
            return false;
        }
        return true;
    }

    public static int getInteiro(String mensagem) {
        int numero = 0;
        boolean valida = true;

        do{
            System.out.print(mensagem);
            try {
                numero = Integer.parseInt(scan.nextLine());
                valida = true;
            } catch (NumberFormatException ex) {
                System.out.println("O número digitado não é um valor inteiro!");
                valida = false;
            }
        }while(!valida);
        
        return numero;
    }

    public static void menu(int opcao, Calculadora hp) {
        int resultado;

        switch (opcao) {
        case 1:
            System.out.println("Soma: "+ hp.soma());
            break;
        case 2:
            System.out.println("Subtração: "+ hp.subtracao());
            break;
        case 3:
            System.out.println("Multiplicação: "+ hp.multiplicacao());
            break;
        case 4:
            System.out.println("Divisão: "+ hp.divisao());
            break;
        case 5:
            System.out.println("Obrigada por utilizar a calculadora");
            break;
        }

    }
}