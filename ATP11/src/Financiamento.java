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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--------------- Bradesco Financiamentos ----------------");
        System.out.println("Opções disponíveis: ");
        System.out.println("\t 1 - Crédito Pessoal");
        System.out.println("\t 2 - Crédito Imobiliário");
        System.out.println("\t 3 - Crédito Empresarial");
        System.out.println("\t 4 - Crédito Consignado");
        

    }
}