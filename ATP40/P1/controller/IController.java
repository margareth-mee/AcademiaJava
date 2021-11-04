package P1.controller;

import java.util.ArrayList;

import P1.model.Empresa;

public interface IController {
    public void salvar(Empresa obj);
    public ArrayList<Empresa> ler();
}
