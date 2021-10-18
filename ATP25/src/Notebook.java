public class Notebook extends Computador{
    public int bateria;
    public double velociadade_wifi;
    public double bluetooth;

    @Override
    public String toString() {
        return super.toString() + "\nBateria: " + bateria + "\nVelocidade Wifi: " + velociadade_wifi + "\nBluetooth: " + bluetooth;
    }
    
}
