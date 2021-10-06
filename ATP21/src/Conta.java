public class Conta{
    private double saldo;
    private String codigo_cliente;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setCodigo_cliente(String codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }
    public String getCodigo_cliente() {
        return codigo_cliente;
    }

    public void transferencia(double valor){
        this.saldo -= valor; 
    }
    
}