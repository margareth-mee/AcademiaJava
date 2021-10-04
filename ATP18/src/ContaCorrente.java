public class ContaCorrente {
   private int agencia;
   private int numero;
   private int codigoCliente; 
   private double saldo; 

   public void setAgencia(int agencia) {
       this.agencia = agencia;
   }

   public int getAgencia() {
       return this.agencia;
   }

   public void setNumero(int numero) {
       this.numero = numero;
   }

   public int getNumero() {
       return this.numero;
   }

   public void setCodigoCliente(int codigoCliente) {
       this.codigoCliente = codigoCliente;
   }

   public int getCodigoCliente() {
       return this.codigoCliente;
   }

   public void setSaldo(double saldo) {
       this.saldo = saldo;
   }

   public double getSaldo() {
       return this.saldo;
   }

}
