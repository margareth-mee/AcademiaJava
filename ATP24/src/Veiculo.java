package src;
public class Veiculo{
    public String marca;
    public String modelo;
    public String placa;

    @Override
    public String toString() {
        return "Marca: " + marca + "\nModelo: " + modelo + "\nPlaca: " + placa; 
    }

}