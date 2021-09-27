import java.util.Scanner;

/*
Exiba um cabeçalho com o título “Bradesco Financiamentos”.
_ Exiba um menu com as opções, Crédito Pessoal, Crédito Imobiliário, 
Crédito Empresarial e Empréstimo Consignado.
_ Solicite ao usuário que escolha uma das opções do menu e caso a opção digitada não seja válida, 
o sistema deve imprimir o menu novamente, solicitar que ele digite a opção e validar a resposta 
até que uma opção válida seja digitada.
_ Ao digitar uma opção válida o sistema deve exibir apenas uma mensagem com o nome do módulo, 
nenhuma implementação da funcionalidade do módulo será necessária.


_ Após exibir a opção correta, o sistema deve perguntar ao usuário se ele deseja voltar ao menu principal 
(‘V’) ou sair do sistema(‘S’). 
_ O sistema deve ler a opção digitada pelo usuário e validar se ele digitou uma das opções válidas, 
caso contrário deve solicitar que digite novamente até que uma opção válida seja digitada.
_ O sistema deve encaminhar o usuário para o menu principal caso a resposta seja ‘V’ e se a
 opção digitada for ‘S’ o sistema deve encerrar imprimindo uma mensagem de obrigado.*/

public class Financiamento{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int opcao; 
        
        System.out.println("--------------- Bradesco Financiamentos ----------------");

        do{
            System.out.println("Opções disponíveis: ");
            System.out.println("\t 1 - Crédito Pessoal");
            System.out.println("\t 2 - Crédito Imobiliário");
            System.out.println("\t 3 - Crédito Empresarial");
            System.out.println("\t 4 - Crédito Consignado");
            
            System.out.print("Digite a opção desejada: ");
            opcao  = Integer.parseInt(sc.nextLine());

            switch(opcao){
                case 1:
                    System.out.println("\tCrédito Pessoal");
                break; 
                case 2:
                    System.out.println("\tCrédito Imobiliário");
                break; 
                case 3:
                    System.out.println("\tCrédito Empresarial");
                break; 
                case 4:
                    System.out.println("\tCrédito Consignado");
                break; 
                default:
                System.out.println("\nA opção escolhida é inválida!\n");
                break;
            }

        }while(repete(opcao));
                  
    }

    static boolean repete( int opcao){
        char repete = 'S';
           
        if(opcao >= 1 && opcao <= 4){
    
            System.out.print("Digite V para voltar ao menu ou S para sair: ");
            repete = sc.nextLine().toUpperCase().charAt(0);
            
            if (repete == 'S'){
                System.out.println("\tSaindo do menu...");
                return false; // o usuário deseja sair
            }else{
                return true; // para qualuqer outro valor digitado ele volta para o menu
            }

        }else{
            return true; // opcao inválida, logo o menu deve ser repetido
        }
     
    }
}