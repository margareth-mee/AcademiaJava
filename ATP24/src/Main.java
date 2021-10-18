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

        Object obj1 = veiculo;
        
        Object obj2 = carro; 
        
        Veiculo veiculo2 = (Veiculo)obj1;
        Carro carro2 = (Carro)obj2;

        System.out.println(veiculo2);
        System.out.println(carro2);

    }    
}
