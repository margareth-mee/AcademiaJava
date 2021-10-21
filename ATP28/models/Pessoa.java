package models;

public class Pessoa extends Base{
    public String nomeCompleto;
    public Endereco endereco; 

    public Pessoa(){
        endereco = new Endereco();
    }

    @Override
    public String toString() {
        return "ID: " + this.id + "\nNome completo: " + this.nomeCompleto + "\nEndereço: " + this.endereco.rua + ", nº " + this.endereco.numero + "\nCidade: " + this.endereco.cidade + "\nCEP: " + this.endereco.CEP; 
    }
}