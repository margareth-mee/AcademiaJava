public class Desktop extends Computador{
    public String tamanho_gabinete;
    public int monitor_externo;
    public double fonte;
    
    @Override
    public String toString() {
        return "Tamanho Gabinete: " + tamanho_gabinete + "Monitor externo: " + monitor_externo + "Fonte: " + fonte;
    }
}
