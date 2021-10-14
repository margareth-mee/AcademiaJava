package Q7;

public class Main {
   public static void main(String[] args) {
       Localizacao localiza = new Localizacao(114110, 571);

       System.out.println("Longitude: " + localiza.getLongitude());
       System.out.println("Latitude: " + localiza.getLatitude());

       localiza.setLatitude(1234);
       localiza.setLongitude(5678);

       System.out.println(localiza);
   } 
}
