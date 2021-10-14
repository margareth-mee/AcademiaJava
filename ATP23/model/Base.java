package model;

import java.util.Random;

public class Base {
    private int id; 

    Base(){
        Random gerador = new Random();
        this.id = gerador.nextInt(1000);
    }
}
