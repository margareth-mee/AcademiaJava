package modulo1;

import java.util.Scanner;

public class Clientes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = "";
        String sobrenome = "";
        String cpf = "";
        String rg = "";
        int categoria;
        boolean validar = true;

        do{
            System.out.println("\n------------------ Sistema de cadastro -----------------\n");
            System.out.println("Bem-vindo, digite a opção desejada: ");
            System.out.println("1 : cadastrar o novo cliente ");
            System.out.println("2 : listar clientes ");
            System.out.println("3 : sair ");

            categoria = sc.nextInt();
            sc.nextLine();

            switch (categoria) {
                case 1:
                    do{
                        System.out.print("\tDigite o nome do cliente: ");
                        nome = sc.nextLine();

                        if(nome.length() < 3){
                            System.out.println("\tO nome deve conter mais do que 3 caracteres. Tente novamente!");
                        }

                    }while(nome.length() < 3);

                    do{
                        System.out.print("\tDigite o sobrenome do cliente: ");
                        sobrenome = sc.nextLine();

                        if(sobrenome.length() < 3){
                            System.out.println("\tO sobrenome deve conter mais do que 3 caracteres. Tente novamente!");
                        }

                    }while(sobrenome.length() < 3);

                    do{
                        System.out.print("\tDigite o CPF do cliente: ");
                        cpf = sc.nextLine();

                        if(cpf.length() < 11){
                            System.out.println("\tO CPF deve conter mais do que 11 caracteres. Tente novamente!");
                        }

                    }while(cpf.length() < 11);

                    do{
                        System.out.print("\tDigite o RG do cliente: ");
                        rg = sc.nextLine();

                        if(rg.length() < 4){
                            System.out.println("\tO RG deve conter mais do que 4 caracteres. Tente novamente!");
                        }

                    }while(rg.length() < 4);

                    System.out.print("\tCadastro realizado com sucesso!");
                    break;
                case 2:
                    System.out.printf("\tO nome do cliente é: %s \n", nome);
                    System.out.printf("\tO sobrenome do cliente é: %s \n", sobrenome);
                    System.out.printf("\tO CPF do cliente é: %s \n", cpf);
                    System.out.printf("\tO RG do cliente é: %s \n", rg);
                    break;
                case 3:
                    System.out.println("\tSaindo do menu!");
                    validar = false;

                    break;
                default:
                    System.out.println("\tA opção não existe!");
                    break;
            }
        }while(validar);
    }
}
