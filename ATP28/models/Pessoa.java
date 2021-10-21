package models;

public class Pessoa extends Base{
    public String nomeCompleto;
    public Endereco endereco; 

    public Pessoa(){
        endereco = new Endereco();
    }

    @Override
    public String toString() {
        return "ID: " + this.id + "\nNome completo: " + this.nomeCompleto + this.endereco.toString(); 
    }
}