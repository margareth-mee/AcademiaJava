package models;

public class PessoaFisica extends Pessoa {
    public String CPF;
    
    @Override
    public String toString() {
        return super.toString() + "\nCPF: " + CPF;
    }
}
