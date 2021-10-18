package src;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        Carro carro = new Carro();

        veiculo.marca = "volkswagen";
        veiculo.modelo = "fusca";
        veiculo.placa = "PMG345";

        carro.num_portas = 4;
        carro.num_litros_porta_malas = 150;
    }
    
}
