public class Main {
    public static void main(String[] args) {
        Computador comp = new Computador();
        Notebook note = new Notebook();
        Desktop desktop = new Desktop();

        comp.disco_ridigo = "512 SSD"
        comp.marca = "Lenovo";
        comp.memoria_ram = "4GB";
        comp.processador = "i5";

        note.bateria = 30;
        note.bluetooth = 4.2;
        note.velociadade_wifi = 123.4;

        desktop.tamanho_gabinete = "40x25x25";
        desktop.fonte = 550; 
        desktop.monitor_externo = 24; 
    }
}
