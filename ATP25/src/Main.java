public class Main {
    public static void main(String[] args) {
        Computador comp = new Computador();
        Notebook note = new Notebook();
        Desktop desktop = new Desktop();

        comp.disco_ridigo = "512 SSD";
        comp.marca = "Lenovo";
        comp.memoria_ram = "4GB";
        comp.processador = "i5";

        note.disco_ridigo = "256 SSD";
        note.marca = "Dell";
        note.memoria_ram = "8GB";
        note.processador = "i7";
        note.bateria = 30;
        note.bluetooth = 4.2;
        note.velociadade_wifi = 123.4;

        desktop.disco_ridigo = "128 SSD";
        desktop.marca = "Acer";
        desktop.memoria_ram = "4GB";
        desktop.processador = "i3";
        desktop.tamanho_gabinete = "40x25x25";
        desktop.fonte = 550; 
        desktop.monitor_externo = 24; 

        Object obj1 = comp;
        Object obj2 = note;
        Object obj3 = desktop; 

        Computador comp2 = (Computador)obj1;
        Notebook note2 = (Notebook)obj2;
        Desktop desktop2 = (Desktop)obj3;
        
        System.out.println(comp2);
        System.out.println(note2);
        System.out.println(desktop2);
    }
}
