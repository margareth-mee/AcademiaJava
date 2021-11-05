package P2.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import P2.model.PontoTuristico;

public class PontoTuristicoDao implements Interface {
    private String filename = "P2/dados/pontos_turisticos.csv";

    public void save(PontoTuristico model) {
        try {
            FileWriter fw = new FileWriter(filename, true);
            fw.write(model.toString() + "\n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<PontoTuristico> list() {
        ArrayList<PontoTuristico> pontos = new ArrayList<PontoTuristico>();

        try {
            Scanner sc = new Scanner(new File(this.filename));
            while (sc.hasNextLine()) {
                String linha = sc.nextLine();
                PontoTuristico p = new PontoTuristico(linha);
                pontos.add(p);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return pontos;
    }
}
