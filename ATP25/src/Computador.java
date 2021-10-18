public class Computador{
    public String marca;
    public int memoria_ram;
    public String processador;
    public int disco_ridigo;

    @Override
    public String toString() {
        return "Marca: " + marca + "\nMem RAM: " + memoria_ram + "\nProcessador: " + processador + "\nDisco Rígido: " + disco_ridigo;
    }
}