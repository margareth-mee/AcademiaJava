package controller;

import java.util.ArrayList;

import model.Empresa;

public interface IController {
    public void salvar(Empresa obj);
    public ArrayList<Empresa> ler();
}
