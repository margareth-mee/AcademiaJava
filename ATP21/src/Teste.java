public class Teste {
    public static void main(String[] args) {
        Conta conta = new Conta();
        ContaCorrente conta_corrente = new ContaCorrente();

        System.err.println("------ Cadastrando Cliente do tipo Conta ----------");
        conta.setCodigo_cliente("114110571");
        conta.setSaldo(2500.00);

        //imprimindo informações da conta
        System.out.println("Código Cliente: " + conta.getCodigo_cliente());
        System.out.println("Saldo: " + conta.getSaldo());

        //realizando tranferencia
        double transferencia1 = 500;
        conta.transferencia(transferencia1);
        System.out.printf("Uma transferência de %.2f foi realizada!\n", transferencia1);

        //imprimindo informações da conta após transferência
        System.out.println("Código Cliente: " + conta.getCodigo_cliente());
        System.out.println("Saldo: " + conta.getSaldo());

        System.out.println("\n------- Cadastrando Cliente do tipo ContaCorrente ------");
        conta_corrente.setCodigo_cliente("114110576");
        conta_corrente.setSaldo(4500.00);

        //imprindo informações da conta
        System.out.println("\nCódigo Cliente: " + conta_corrente.getCodigo_cliente());
        System.out.println("Saldo: " + conta_corrente.getSaldo());

        double transferencia2 = 50;
        for (int i = 1; i <= 10; i++) {
            //realizando transferencia
            conta_corrente.transferencia(transferencia2);
            System.out.printf("\nOperação nº %d: uma transferência de %.2f foi realizada!\n", i, transferencia2);
 
            //imprimindo informações da conta após transferência
            System.out.println("Código Cliente: " + conta_corrente.getCodigo_cliente());
            System.out.println("Saldo: " + conta_corrente.getSaldo());
        }                
    }
}
