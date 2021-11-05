package P2.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import P2.model.PontosTuristicos;

public class PontosTuristicosDao extends BaseDao<PontosTuristicos>{
    public PontosTuristicosDao(){
        super("P2/dados/pontos_turistico.csv");
    }

    public ArrayList<Object> list(){  
        ArrayList<Object> pontos = new ArrayList<Object>();      
        try {
            Scanner sc = new Scanner(new File(this.filename));
            while(sc.hasNextLine()){
                String linha = sc.nextLine(); 
                PontosTuristicos p = new PontosTuristicos(linha);
                pontos.add(p);
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
        return pontos; 
    }

}
