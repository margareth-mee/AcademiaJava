/*
_ Na classe principal, dentro do metodo main, construa um objeto da classe Calculadora de Taxas 
e execute os métodos de transferência e de saque.
_ Ao final da execução do método main, imprima todos os dados das taxas cobradas. 
*/
public class Principal {
    public static void main(String[] args) {
        CalculadoraTaxas taxas = new CalculadoraTaxas();

        System.out.println("O saldo atual é: " + taxas.saldo());
        taxas.depositar(1000);
        System.out.println("O saldo atual é: " + taxas.saldo());
        taxas.sacar(200);
        System.out.println("O saldo atual é: " + taxas.saldo());
        taxas.transferir(500);
        System.out.println("O saldo atual é: " + taxas.saldo());

    }
    
}
