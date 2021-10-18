public class Desktop extends Computador{
    public int tamanho_gabinete;
    public String monitor_externo;
    public String fonte;
    
    @Override
    public String toString() {
        return "Tamanho Gabinete: " + tamanho_gabinete + "Monitor externo: " + monitor_externo + "Fonte: " + fonte;
    }
}
