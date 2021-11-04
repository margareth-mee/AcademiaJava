package P1.view;

import P1.controller.EmpresaController;
import P1.controller.IController;
import P1.model.Empresa;

public class Main {
    public static void main(String[] args) {
        IController c = new EmpresaController();
        Empresa e1 = new Empresa("Cap;123456;tech");
        Empresa e2 = new Empresa("Bradesco;7891011;financeiro");

        c.salvar(e1);
        c.salvar(e2);

        for (Empresa e : c.ler()) {
            System.out.println(e);
        }
    }
}
