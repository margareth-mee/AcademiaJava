import java.util.Scanner;

/*
_ Na classe principal, dentro do metodo main, construa um objeto da classe Calculadora de Taxas 
e execute os métodos de transferência e de saque.
_ Ao final da execução do método main, imprima todos os dados das taxas cobradas. 
*/
public class Principal {
    public static void main(String[] args){
        CalculadoraTaxas taxas = new CalculadoraTaxas();
        int opcao;
        
        cabecalho();

        do {
            imprimeMenu();
            opcao = lerNumeroInt("Digite a opção desejada: ");
            
            if(validaOpcao(opcao)){
                menu(taxas, opcao);
            }else{
                System.out.println("\nOpção inválida!");
            }
            
        } while( !(validaOpcao(opcao) && opcao == 5));
    }
    static void cabecalho(){
        System.out.println("========== Banco Bradesco ===========");
    }

    static void imprimeMenu() {
        System.out.println("\nOpções do Menu: ");
        System.out.println("\t 1 - Saldo");
        System.out.println("\t 2 - Sacar");
        System.out.println("\t 3 - Depositar");
        System.out.println("\t 4 - Transferir");
        System.out.println("\t 5 - Sair");
    }

    static int lerNumeroInt(String mensagem) {
        Scanner scan = new Scanner(System.in);
        System.out.print(mensagem);
        int numero = Integer.parseInt(scan.nextLine());
        return numero;
    }

    static double lerNumeroDouble(String mensagem) {
        Scanner scan = new Scanner(System.in);
        System.out.print(mensagem);
        double numero = Double.parseDouble(scan.nextLine());
        return numero;
    }

    static void menu(CalculadoraTaxas taxas, int opcao){
        double valor;

        switch (opcao) {
            case 1:
                System.out.println("\n============ Saldo ============");
                System.out.println("O valor do saldo é: R$ " + taxas.saldo());    
                break;
            case 2:
                System.out.println("\n============ Sacar =============");
                valor = lerNumeroDouble("Digite o valor em R$ para realizar a operação: ");
                taxas.sacar(valor);
                break;
            case 3:
                System.out.println("\n========== Depositar ===========");
                valor = lerNumeroDouble("Digite o valor em R$ para realizar a operação: ");
                taxas.depositar(valor);
                break;
            case 4:
                System.out.println("\n========== Transferir ===========");
                valor = lerNumeroDouble("Digite o valor em R$ para realizar a operação: ");
                taxas.transferir(valor);
                break;
            case 5:
                System.out.println("\nVocê está saindo do menu. Obrigada!");
                break;

        }

    }

    static boolean validaOpcao(int opcao){
        if (opcao < 1 || opcao > 5){;
            return false;
        }
        
        return true; 
    }

}
