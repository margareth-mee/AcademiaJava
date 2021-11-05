package P2.view;

import P2.controller.PontoTuristicoLista;
import P2.model.PontoTuristico;

public class ViewLista {
    public static void main(String[] args) {
        PontoTuristico pt1 = new PontoTuristico();
        pt1.id = "001";
        pt1.nome = "Ponta do Seixas";
        pt1.descricao = "Praia no litoral paraibano";
        pt1.localizacao = "João Pessoa"; 
        
        PontoTuristicoLista controller = new PontoTuristicoLista();
        controller.save(pt1);

        for (PontoTuristico pt : controller.list()) {
            System.out.println(pt);
        }
    }
}
