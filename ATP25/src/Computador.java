public class Computador{
    public String marca;
    public String memoria_ram;
    public String processador;
    public String disco_ridigo;

    @Override
    public String toString() {
        return "Marca: " + marca + "\nMem RAM: " + memoria_ram + "\nProcessador: " + processador + "\nDisco Rígido: " + disco_ridigo;
    }
}