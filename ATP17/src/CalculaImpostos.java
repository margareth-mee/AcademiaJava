/*
Utilize o repositório criado durante a realização da sua última atividade individual.
_ Execute o commit e push a cada etapa finalizada.
_ Crie uma classe para cálculo de impostos.
_ A classe de calculo deve possuir 3 métodos, um para calculo de ISS,
 outro para cálculo de IOF e outro para cálculo de IR.
_ A classe deve manter em variáveis privadas o valor de cada imposto que deve ser definido por você.
_ Os métodos devem receber como parâmetro um valor que servirá de base para 
cálculo do imposto e retornar o valor do imposto calculado
*/
public class CalculaImpostos{
    private double taxaISS = 0.015;
    private double taxaIOF = 0.020;
    private double taxaIR = 0.005;

    public double calculaISS(double valor){
        return valor*taxaISS;
    }

    public double calculaIOF(double valor){
        return valor*taxaIOF;
    }

    public double calculaIR(double valor){
        return valor*taxaIR;
    }

}