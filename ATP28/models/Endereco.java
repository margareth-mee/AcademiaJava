package models;

public class Endereco extends Base{
    public String rua;
    public String numero;
    public String cidade;
    public String CEP;
    
    @Override
    public String toString() {
        return "\nEndereço ID: " +  this.id + "\nLougrado: " + this.rua + ", nº " + this.numero + "\nCidade: " + this.cidade + "\nCEP: " + this.CEP;
    }
}
