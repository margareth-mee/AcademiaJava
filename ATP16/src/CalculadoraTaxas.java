/*
_ Construa uma classe CalculadoraTaxas que possua os métodos de cálculo de taxas.
_ Crie dois métodos para cálculo de taxa sobre transações bancárias, 
o primeiro será aplicado uma taxa de 0,001% sobre o valor transferido, 
o segundo uma taxa de saque de R$1.30 a cada 5 saques realizados.
*/

public class CalculadoraTaxas{
    private double saldo;
    private int qtdSaques;

    public void depositar(double valor){
        saldo += valor; 
    }

    public void sacar(double valor){
        saldo -= valor;
        qtdSaques++;
        taxaSaque();
    }

    public void taxaSaque(){
        if(validaTaxaSaque()){
            saldo -= 1.30;
            System.out.println("Você realizou 5 saques, uma taxa de R$ 1,30 está sendo aplicada.");
        }
    }

    public boolean validaTaxaSaque(){
        if(qtdSaques%5 == 0){
            return true;
        }else{
            return false;
        }
    }

    public double saldo(){
        return saldo;
    }

    public void transferir(double valor){
        saldo -= valor;
        taxaTransferecia(valor);
    }

    public void taxaTransferecia(double valor){
        double taxa = valor*0.00001;
        saldo -= taxa;
        System.out.printf("Uma taxa de transferência de R$ %.4f está sendo aplicada.\n", taxa);
    }

}