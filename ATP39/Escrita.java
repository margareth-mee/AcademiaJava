import java.io.FileWriter;
import java.io.IOException;

public class Escrita {
    public static void main(String[] args) {
        FileWriter fw = null;

        try {
            fw = new FileWriter("dados/output2.txt", true);
            fw.write("O poeta é um fingidor\n");
            fw.write("Finge tão completamente\n");
            fw.write("Que chega a fingir que é dor\n");
            fw.write("A dor que deveras sente.");
            fw.close();
        } catch (IOException e) {
            System.out.println("Não foi possível escrever no arquivo!");
        }    
    }
}
