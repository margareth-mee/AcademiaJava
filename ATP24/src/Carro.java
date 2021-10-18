package src;
public class Carro {
    public int num_portas;
    public double num_litros_porta_malas;

    @Override
    public String toString() {
        return "Número de Portas: " + num_portas + "\nCapacidade Porta Malas: " + num_litros_porta_malas; 
    }
}
