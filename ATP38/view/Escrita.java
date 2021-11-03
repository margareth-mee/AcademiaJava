package view;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Escrita {
    public static void main(String[] args) {

        try{
        FileOutputStream fos = new FileOutputStream("dados/output.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Olá esta é a primeira linha");
        bw.newLine();
        bw.write("Esta é a segunda linha");

        bw.close();
        System.out.println("Arquivo aberto com sucesso");
    }catch(FileNotFoundException e){
            System.out.println("Arquivo não encontrado!");
    }
    catch(IOException e){
        System.out.println("Não foi possível escrever no arquivo");
    }
    }
}