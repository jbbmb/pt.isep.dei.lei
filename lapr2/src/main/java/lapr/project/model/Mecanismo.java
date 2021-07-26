/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author grupo18
 */
public class Mecanismo implements Serializable {

    public Mecanismo() {

    }

    public ArrayList<Atribuicao> atribuirCandidatura(ListaFAE listaFAE,
            ListaCandidaturas listaCandidaturas, ListaAtribuicoes listaAtribuicoes) {

        if (listaFAE.getListaFAE().size() < 1
                || listaCandidaturas.getListaCandidaturas().size() < 1) {
            return null;
        }

        int j = 0;
        for (int i = 0; i
                < listaCandidaturas.getListaCandidaturas().size(); i++) {

            if (j >= listaFAE.getListaFAE().size()) {
                j = 0;
            }
            listaAtribuicoes.addAtribuicao(new Atribuicao(
                    listaFAE.getListaFAE().get(j),
                    listaCandidaturas.getListaCandidaturas().get(i)));
            j++;
        }

        return listaAtribuicoes.getListaAtribuicoes();
    }

}
