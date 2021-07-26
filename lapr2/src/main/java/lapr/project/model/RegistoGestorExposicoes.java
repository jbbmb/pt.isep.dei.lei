/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author grupo18
 */
public class RegistoGestorExposicoes implements Serializable {

    private List<GestorExposicoes> listaGestores;

    public RegistoGestorExposicoes() {
        listaGestores = new ArrayList<>();
    }

    public List<GestorExposicoes> getListaGestores() {
        return listaGestores;
    }

    public void setListaGestores(List<GestorExposicoes> listaGestores) {
        this.listaGestores = listaGestores;
    }

    public boolean verificarGestorPorUsername(String username) {
        for (GestorExposicoes gestor : listaGestores) {
            if (gestor.getUtilizador().getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }
}
