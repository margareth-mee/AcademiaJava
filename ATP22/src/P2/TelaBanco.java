package P2;

public class TelaBanco {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1000.0, "123");
        System.out.println(cc);
        
        cc.saque(350.0);
        System.out.println("Um saque de R$ 350.0 foi realizado!");
        System.out.println(cc);

        cc.deposito(500.0);
        System.out.println("Um depósito de R$ 500.0 foi realizado!");
        System.out.println(cc);
    }
}
