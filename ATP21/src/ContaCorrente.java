/*_ Crie uma classe Conta Corrente com os atributos privados: taxa transferência, taxa manutenção e número de transferências.*/
public class ContaCorrente extends Conta{
    private double taxa_transferencia = 10.50;
    private double taxa_manutencao = 2.5;
    private int numero_transferencias = 0;

    @Override
    public void transferencia(double valor){
        
        super.transferencia(valor);
        setSaldo(getSaldo() - taxa_transferencia);
        numero_transferencias++;
        
        if(numero_transferencias % 5 == 0){
            setSaldo(getSaldo() - taxa_manutencao);
        }
    }
}
