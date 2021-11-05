package P2.controller;

import java.util.ArrayList;

import P2.dao.Interface;
import P2.model.PontoTuristico;

public class PontoTuristicoLista implements Interface{
    public ArrayList<PontoTuristico> lista = new ArrayList<PontoTuristico>();

    @Override
    public void save(PontoTuristico model) {
        this.lista.add(model);
    }

    @Override
    public ArrayList<PontoTuristico> list() {
        return this.lista;
    }
}
