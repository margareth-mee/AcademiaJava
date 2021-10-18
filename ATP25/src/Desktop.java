public class Desktop extends Computador{
    public String tamanho_gabinete;
    public int monitor_externo;
    public double fonte;
    
    @Override
    public String toString() {
        return super.toString() + "\nTamanho Gabinete: " + tamanho_gabinete + "\nMonitor externo: " + monitor_externo + "\nFonte: " + fonte;
    }
}
