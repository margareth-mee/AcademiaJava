import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class Main{
    public static void main(String[] args) {

        try {
            InputStream fis = System.in;
            Reader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            OutputStream fos = new FileOutputStream("dados/output.txt");
            Writer osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);

            String line = "";
    
            while (line != null && !line.equals("q")) {
                line = br.readLine();
                bw.write(line+"\n");
            }
            br.close();
            bw.close();
        } catch (IOException e) {
            System.out.println("Não foi possível ler a entrada!");
        }      
    }
}
