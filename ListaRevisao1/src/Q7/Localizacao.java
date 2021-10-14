package Q7;

public class Localizacao {
    private int longitude;
    private int latitude;

    public Localizacao(int longitude, int latitude){
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }
    public int getLongitude() {
        return longitude;
    }
    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }
    public int getLatitude() {
        return latitude;
    }

    @Override
    public String toString() {
        String retorno = "Longitude: " + this.longitude + " \nLatitude:" + this.latitude;
        return retorno;
    }
    
}
