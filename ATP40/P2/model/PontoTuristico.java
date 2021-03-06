package P2.model;
/* 
_  Crie um sistema para cadastro de Pontos Turísticos. A classe de modelo deve possuir três atributos públicos: nome, descrição e localização.
_  Crie uma interface que contenha os métodos de leitura e gravação de dados para pontos turísticos.
_  Crie duas implementações da interface. Uma que usará um lista para armazenar os dados e outra que utilizará um arquivo texto como fonte de dados.
_  Crie duas classes View para testar cada uma das implementações criadas. */

public class PontoTuristico extends BaseModel{
    public String nome;
    public String descricao;
    public String localizacao;

    public PontoTuristico(){
        super();
    }
    public PontoTuristico(String linha){
        String[] dados = linha.split(";");
        this.id = dados[0];
        this.nome= dados[1];
        this.descricao = dados[2];
        this.localizacao = dados[3];
    }

    @Override
    public String toString() {
        String retorno = String.format("%s;%s;%s;%s", this.id, this.nome, this.descricao, this.localizacao);

    return retorno;
    }
}
