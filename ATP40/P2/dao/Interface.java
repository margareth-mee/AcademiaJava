package P2.dao;

import java.util.ArrayList;

import P2.model.PontoTuristico;

public interface Interface{
    public void save(PontoTuristico model);
    public ArrayList<PontoTuristico> list();
}
