package model;
/* 
_  Crie um sistema para cadastro de Empresas. A empresa deve possuir três atributos públicos: nome, cnpj e ramo de atividade
_  Utilize o padrão DAO para criar uma estrutura de armazenamento de dados em um arquivo do tipo CSV.
_  A estrutura de armazenamento deve apenas salvar e ler os dados. 
_  Os dados devem ser convertidos de Objeto para String ao salvar.
_  Os dados devem ser convertidos de String para Objeto ao ler.
_  Utilize os métodos de leitura e escrita em uma classe View. */

public class Empresa {
    public String nome;
    public String cnpj;
    public String ramo;

    public Empresa(String linha){
        String[] dados = linha.split(";");
        this.nome= dados[0];
        this.cnpj = dados[1];
        this.ramo = dados[2];
    }
    
    @Override
    public String toString() {
        String retorno = String.format("%s;%s;%s", 
        this.nome, 
        this.cnpj,
        this.ramo);
        
    return retorno;
    }
}
