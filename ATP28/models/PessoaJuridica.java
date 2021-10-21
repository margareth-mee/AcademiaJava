package models;

public class PessoaJuridica extends Pessoa{
    public String CNPJ;

    @Override
    public String toString() {
        return super.toString() + "\nCNPJ: " + this.CNPJ;
    }
}
