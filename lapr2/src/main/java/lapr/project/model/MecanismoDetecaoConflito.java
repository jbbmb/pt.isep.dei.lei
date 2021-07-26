/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;

/**
 *
 * @author Grupo 18_LAPR2 15-16
 */
public class MecanismoDetecaoConflito implements Serializable {

    private Exposicao exposicao;
    private ListaFAE listaFAE;
    private ListaCandidaturas listaCandidaturas;
    private ListaConflitos listaConflitos;

    public MecanismoDetecaoConflito() {
        this.listaFAE = new ListaFAE();
        this.listaCandidaturas  = new ListaCandidaturas();
        this.listaConflitos = new ListaConflitos();
    }

    public void setExposicao(Exposicao exposicao) {
        this.exposicao = exposicao;
    }

    public void getListaFAE() {
        listaFAE = exposicao.getListaFAE();
    }

    public void getListaCandidaturas() {
        listaCandidaturas = exposicao.getListaCandidaturas();
    }

    public void getListaConflitos() {
        listaConflitos = exposicao.getListaConflitos();
    }

    /**
     * Deteta os conflitos entre todos os FAE e as Candidaturas
     */
    public void detetarConflitos() {
        getListaCandidaturas();
        getListaConflitos();
        getListaFAE();
        for (int i = 0; i < listaFAE.getListaFAE().size(); i++) {
            for (int j = 0; j < listaCandidaturas.getListaCandidaturas().size(); j++) {
                if (isConflito(listaFAE.getListaFAE().get(i), listaCandidaturas.getListaCandidaturas().get(i))) {
                    listaConflitos.registarConflito(listaFAE.getListaFAE().get(i), listaCandidaturas.getListaCandidaturas().get(i));
                }
            }
        }

    }

    /**
     * Retorna true se um FAE e o representante da candidatura forem a mesma
     * pessoa
     *
     * @param fae
     * @param candidatura
     * @return true se for conflito
     */
    public boolean isConflito(FAE fae, Candidatura candidatura) {
        if (fae.getUtilizador().getUsername().equals(candidatura.getIdRepresentante())) {
            return true;
        }
        return false;
    }

}
