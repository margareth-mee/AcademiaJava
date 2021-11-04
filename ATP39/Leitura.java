import java.util.Scanner;
import java.io.File;
/* 
_  Crie um sistema para leitura e escrita em arquivos.
_  Crie uma classe que contenha a estrutura para a leitura de um arquivo de texto, o arquivo deve estar salvo em uma pasta de nome dados. Esta leitura deve utilizar a classe Scanner para ler os dados do arquivo. Imprima todas as linhas no terminal
_  Crie uma outra classe que contenha a estrutura de escrita em um arquivo de texto, o arquivo deve estar salvo em uma pasta de nome dados. A escrita deve utilizar a classe FileWriter para salvar novas linhas no arquivo. Utilize a opção de append para que o arquivo não seja reescrito. 
*/
import java.io.FileNotFoundException;

public class Leitura {
    public static void main(String[] args) {
        Scanner sc;
        try {
            sc = new Scanner(new File("dados/input.txt"));

            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        }     
    }
}
