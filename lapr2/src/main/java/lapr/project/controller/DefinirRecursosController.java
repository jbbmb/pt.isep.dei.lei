/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.ListaRecursos;
import lapr.project.model.Recurso;

/**
 *
 * @author Grupo 18
 */
public class DefinirRecursosController {
    private CentroExposicoes centroExposicoes;
    private ListaRecursos listaRecursos;
    private Recurso recurso;

    public DefinirRecursosController(CentroExposicoes centroExposicoes) {
        this.centroExposicoes = centroExposicoes;
    }
    
   public List<Recurso> getListaRecursos(){
       this.listaRecursos = centroExposicoes.getListaRecursos();
       return listaRecursos.getListaRecursos();
    }
    
    public void novoRecurso(){
        this.recurso = listaRecursos.novoRecurso();
    }
    
    public boolean setRecurso(String recurso){
        this.recurso.setRecurso(recurso);
        return this.listaRecursos.validaRecurso(this.recurso);
    }
    public void registarRecurso(){
        this.listaRecursos.addRecurso(recurso);
    }
}
