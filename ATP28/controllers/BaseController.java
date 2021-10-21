package controllers;

import java.util.ArrayList;

public class BaseController<T>{
    ArrayList<T> lista;

    public BaseController(){
        lista = new ArrayList<T>();
    }

    public void create(T obj){
        lista.add(obj);
    }

    public ArrayList<T> read(){
        return lista;
    }

    public void update(T obj){
        if(existe(obj)){
            this.delete(obj);
            this.create(obj);
        }
    }

    public void delete(T obj){
        lista.remove(obj);
    }

    public boolean existe(T obj){
        return this.lista.contains(obj);       
    }
    
}
