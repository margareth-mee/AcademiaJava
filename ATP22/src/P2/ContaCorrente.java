package P2;

public class ContaCorrente {
    private double saldo;
    private double taxa_saque = 10.0;
    private String  codigo_cliente;

    public ContaCorrente(double saldo, String codigo_cliente){
        this.saldo = saldo;
        this.codigo_cliente = codigo_cliente;
    }
    public void saque(double valor){
        this.saldo -= valor + taxa_saque;
    }
    public void deposito(double valor){
        this.saldo += valor;
    }
    @Override
    public String toString() {
        String mensagem = "Codigo Cliente: " + this.codigo_cliente + "\n" + "Saldo: " + this.saldo + "\n";
        return mensagem;
    }
}
