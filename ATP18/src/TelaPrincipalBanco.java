public class TelaPrincipalBanco {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();

        conta.setAgencia(1911);  
        conta.setNumero(123456);
        conta.setCodigoCliente(7890);
        conta.setSaldo(1600.00);

        System.out.println("---------- Conta Corrente ---------");
        System.out.println("Agência: " + conta.getAgencia());
        System.out.println("Número: " + conta.getNumero());
        System.out.println("Codigo Cliente: " + conta.getCodigoCliente());
        System.out.printf("Saldo: %.2f", conta.getSaldo());
    }
}
