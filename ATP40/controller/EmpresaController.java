package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import model.Empresa;

public class EmpresaController implements IController{
  
    public void salvar(Empresa obj) {
      
        try {
            FileWriter fw;
            fw = new FileWriter("dados/lista_empresas.csv", true);
            fw.write(obj.toString() +"\n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Empresa> ler() {
        ArrayList<Empresa> lista = new ArrayList<Empresa>();
        try {
            Scanner sc = new Scanner(new File("dados/input.txt"));
            while(sc.hasNextLine()){
                String linha = sc.nextLine();
                Empresa e = new Empresa(linha);
                lista.add(e);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }      
        return lista;
    }
    
}
