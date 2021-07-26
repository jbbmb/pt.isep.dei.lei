/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Grupo 18_LAPR2 15-16
 */
public class ListaRecursos implements Serializable {

    private ArrayList<Recurso> listaRecursos;

    public ListaRecursos() {
        listaRecursos = new ArrayList<>();
    }

    public List<Recurso> getListaRecursos() {
        return listaRecursos;
    }

    public void setListaRecursos(ArrayList<Recurso> listaRecursos) {
        this.listaRecursos = listaRecursos;
    }

    public Recurso novoRecurso() {
        return new Recurso();
    }

    public void addRecurso(Recurso recurso) {
        listaRecursos.add(recurso);
    }

    public boolean validaRecurso(Recurso recurso){
        if(valida(recurso) && recurso.validaRecurso()){
            return true;
        }else{
            return false;
        }
    }
    public boolean valida(Recurso recurso) {
        for (int i = 0; i < listaRecursos.size(); i++) {
            if (listaRecursos.get(i).equals(recurso)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ListaRecursos other = (ListaRecursos) obj;
        if (!Objects.equals(this.listaRecursos, other.listaRecursos)) {
            return false;
        }
        return true;
    }

}
