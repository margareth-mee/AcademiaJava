package P2;

public class ContaCorrente {
    private double saldo;
    private double taxa_saque = 10.0;
    private double codigo_cliente;

    public ContaCorrente(double saldo, double codigo_cliente){
        this.saldo = saldo;
        this.codigo_cliente = codigo_cliente;
    }
    public void saque(double valor){
        this.saldo -= valor + taxa_saque;
    }
    public void deposito(double valor){
        this.saldo += valor;
    }
}
