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
            imprimeOpcoes();
            opcao = getNumber("Digite a opção desejada: ");
            menu(opcao);

        }while(repete(opcao));
                  
    }

    static void imprimeOpcoes(){
        System.out.println("Opções disponíveis: ");
        System.out.println("\t 1 - Crédito Pessoal");
        System.out.println("\t 2 - Crédito Imobiliário");
        System.out.println("\t 3 - Crédito Empresarial");
        System.out.println("\t 4 - Crédito Consignado");
    }

    static int getNumber(String mensagem){
        System.out.print(mensagem);
        int opcao  = Integer.parseInt(sc.nextLine());
        
        return opcao;
    }

    static void menu( int opcao){
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
    }

    static boolean repete( int opcao){
        char repete = 'S';
        boolean continua = true; 
           
        if(opcao >= 1 && opcao <= 4){
    
            do{
                repete = getChar("Digite V para voltar ao menu ou S para sair: ");
                
                switch(repete){
                    case 'S':
                        System.out.println("\tSaindo do menu...");
                        continua = false; // o usuário deseja sair
                    break;
                    case 'V':
                        continua = true; // o usuario deseja volta ao menu
                    break;
                    default:
                        System.out.println("\tOpção inválida!");
                }

            }while(repete!= 'S' && repete!= 'V');

        }else{
            continua = true; // opcao inválida, logo o menu deve ser repetido
        }

     return continua;
    }

    static char getChar(String mensagem){
        System.out.print(mensagem);
        char repete = sc.nextLine().toUpperCase().charAt(0);
        return repete;
    }

}