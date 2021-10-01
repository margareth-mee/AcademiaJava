// _ Crie uma segunda classe que contenha o método main.
// _ Nesta segunda classe, crie um objeto da classe calculadora, realize a chamada aos três métodos e ao final da execução, imprima o valor de todos os impostos calculados,.

public class Principal {
    public static void main(String[] args) {
        CalculaImpostos impostos = new CalculaImpostos();

        double  valor = 1000;
        double IOF = impostos.calculaIOF(valor);
        double IR = impostos.calculaIR(valor);
        double ISS = impostos.calculaISS(valor);

        System.out.printf("O valor do IOF sobre o valor %.4f: R$ %.4f \n", valor, IOF);
        System.out.printf("O valor do IR sobre o valor %.4f: R$ %.4f \n", valor, IR);
        System.out.printf("O valor do ISS sobre o valor %.4f: R$ %.4f \n", valor, ISS);

    }
}
