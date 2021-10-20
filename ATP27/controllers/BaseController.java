package controllers;

import java.util.ArrayList;

public class BaseController<T>{
    private ArrayList<T> lista; 

    public BaseController(){
        lista = new ArrayList<T>();
    }

    public void create(T obj){
        this.lista.add(obj);
    }
    
    public ArrayList<T> read(){
        return this.lista;
    }

    public void update(T obj){
        if(existe(obj)){
            this.delete(obj);
            this.create(obj);
        }
    }

    public void delete(T obj){
        this.lista.remove(obj);
    }

    public boolean existe(T obj){
        return this.lista.contains(obj);
    }

}