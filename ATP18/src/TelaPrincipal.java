public class TelaPrincipal {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        ContaCorrente conta = new ContaCorrente();

        p1.setCodigo(10002);
        int codigo = p1.getCodigo();
        
        p1.setDescricao("Frost-free");
        String descricao = p1.getDescricaco();
        
        p1.setNome("Geladeira");
        String nome = p1.getNome();
        
        p1.setValor(2500.00);
        double valor = p1.getValor();

        conta.setAgencia(1911);
        int agencia = conta.getAgencia();
    
        conta.setNumero(123456);
        int numero = conta.getNumero();

        conta.setCodigoCliente(7890);
        int codigoCliente = conta.getCodigoCliente();
        
        conta.setSaldo(1600.00);
        double saldo = conta.getSaldo();

        System.out.println("---------- Produto ---------");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.printf("Valor %.2f\n", valor);
        System.out.println("Codigo: " + codigo);

        System.out.println("---------- Conta Corrente ---------");
        System.out.println("Agência: " + agencia);
        System.out.println("Número: " + numero);
        System.out.println("Codigo Cliente: " + codigoCliente);
        System.out.printf("Saldo: %.2f", saldo);
    }
}
