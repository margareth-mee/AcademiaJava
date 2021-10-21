package models;

public class Pessoa{
    public String nomeCompleto;
    public String id;
    public Endereco endereco; 

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
}