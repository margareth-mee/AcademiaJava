package models;

public class Pessoa{
    public String nomeCompleto;
    public String id;
    public Endereco endereco; 

    public Pessoa(){
        endereco = new Endereco();
    }

    @Override
    public boolean equals(Object obj) {

        if(obj instanceof Pessoa){
            Pessoa p = (Pessoa)obj;

            if(this.id.equals(p.id)){
                return true;
               }
        }
       
        return false;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + "\nNome completo: " + this.nomeCompleto + "\nEndereço: " + this.endereco.rua + ", nº " + this.endereco.numero + "\nCidade: " + this.endereco.cidade + "\nCEP: " + this.endereco.CEP; 
    }
}