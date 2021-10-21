package views;

import controllers.PessoaFisicaController;
import controllers.PessoaJuridicaController;
import models.PessoaFisica;
import models.PessoaJuridica;

public class Main {
    public static void main(String[] args) {
        PessoaFisicaController pfcontroller = new PessoaFisicaController();
        PessoaJuridicaController pjcontroller = new PessoaJuridicaController();

        PessoaFisica p1 = new PessoaFisica();
        p1.id = "001";
        p1.nomeCompleto = "Margareth Mee";
        p1.CPF = "0101010101";
        p1.endereco.id = "001";
        p1.endereco.rua = "Rua Diogo da Costa";
        p1.endereco.numero = "387";
        p1.endereco.cidade = "Campina Grande";
        p1.endereco.CEP = "57400-300";

        PessoaJuridica j1 = new PessoaJuridica();
        j1.id = "001";
        j1.nomeCompleto = "Margareth Mee";
        j1.CNPJ = "02020202020";
        j1.endereco.id = "001";
        j1.endereco.rua = "Rua Vinte e Sete de Julho";
        j1.endereco.numero = "100";
        j1.endereco.cidade = "João Pessoa";
        j1.endereco.CEP = "57429-330";

        pfcontroller.create(p1);
        pjcontroller.create(j1);

        PessoaFisica p2 = new PessoaFisica();
        p2.id = "001";
        p2.nomeCompleto = "Maykon Dyego";
        p2.CPF = "030303030";
        p2.endereco.id = "001";
        p2.endereco.rua = "Rua Ines Brasil";
        p2.endereco.numero = "37";
        p2.endereco.cidade = "Blumenal";
        p2.endereco.CEP = "574780-000";

        PessoaJuridica j2 = new PessoaJuridica();
        j2.id = "001";
        j2.nomeCompleto = "CIA Ines Brasil";
        j2.CNPJ = "7171717177171";
        j2.endereco.id = "001";
        j2.endereco.rua = "Rua do Brasil";
        j2.endereco.numero = "71";
        j2.endereco.cidade = "Rio de Janeiro";
        j2.endereco.CEP = "54560-799";

        pfcontroller.update(p2);
        pjcontroller.update(j2);

        listar(pfcontroller);
        listar(pjcontroller);

        pfcontroller.delete(p2);
        pjcontroller.delete(j2);

    }
    static public void listar(Object obj) {

        if (obj instanceof PessoaFisicaController) {
            PessoaFisicaController controller = (PessoaFisicaController) obj;
            
            for (PessoaFisica p : controller.read()) {
                System.out.println(p);
            }
        } else if (obj instanceof PessoaJuridicaController) {
            PessoaJuridicaController controller = (PessoaJuridicaController) obj;
            
            for (PessoaJuridica p: controller.read()) {
                System.out.println(p);
            }
        }
    }
    
}
