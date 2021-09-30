import java.util.Scanner;

/*
_ Na classe principal, dentro do metodo main, construa um objeto da classe Calculadora de Taxas 
e execute os métodos de transferência e de saque.
_ Ao final da execução do método main, imprima todos os dados das taxas cobradas. 
*/
public class Principal {
    public static void main(String[] args) {
        CalculadoraTaxas taxas = new CalculadoraTaxas();
        
        imprimeMenu();
        lerNumeroInt("Digite a opção desejada: ");

        System.out.println("O saldo atual é: " + taxas.saldo());
        taxas.depositar(1000);
        System.out.println("O saldo atual é: " + taxas.saldo());
        taxas.sacar(200);
        System.out.println("O saldo atual é: " + taxas.saldo());
        taxas.transferir(500);
        System.out.println("O saldo atual é: " + taxas.saldo());       

    }
    static void imprimeMenu(){
        System.out.println("Opções do Menu: ");
        System.out.println("\t 1 - Saldo");
        System.out.println("\t 2 - Sacar");
        System.out.println("\t 3 - Depositar");
        System.out.println("\t 4 - Tranferir");
        System.out.println("\t 5 - Sair");
    }
    static int lerNumeroInt(String mensagem){
        Scanner scan = new Scanner(System.in);
        System.out.print(mensagem);
        int numero = Integer.parseInt(scan.nextLine());
        return numero;
    }
    
}
