package P2.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import P2.model.PontoTuristico;

public class PontoTuristicoDao extends BaseDao<PontoTuristico>{
    public PontoTuristicoDao(){
        super("P2/dados/pontos_turisticos.csv");
    }

    public ArrayList<Object> list(){  
        ArrayList<Object> pontos = new ArrayList<Object>();      
        try {
            Scanner sc = new Scanner(new File(this.filename));
            while(sc.hasNextLine()){
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
