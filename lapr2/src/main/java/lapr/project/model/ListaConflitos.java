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
 * @author Grupo 18_LAPR2 15-16
 */
public class ListaConflitos implements Serializable {

    private List<Conflito> listaConflitos;

    public ListaConflitos(ArrayList<Conflito> listaConflitos) {
        this.listaConflitos = listaConflitos;
    }

    public ListaConflitos() {
        listaConflitos = new ArrayList<>();
    }

    public List<Conflito> getListaConflitos() {
        return listaConflitos;
    }

    public void setListaConflitos(ArrayList<Conflito> listaConflitos) {
        this.listaConflitos = listaConflitos;
    }

    public void registarConflito(FAE fae, Candidatura candidatura) {
        Conflito conflito = new Conflito(fae, candidatura);
        listaConflitos.add(conflito);

    }

    public void apagaConflito(Conflito conf) {
        listaConflitos.remove(conf);
    }

    public void registaAlteracoes(Conflito conflitoCopia, Conflito conflitoSelecionado) {
        int posicao = listaConflitos.indexOf(conflitoSelecionado);
        listaConflitos.add(posicao, conflitoCopia);
    }

    public boolean validaAlteracao(Conflito c) {
        if (c.validaAlteracao(c.getFae(), c.getCandidatura(), c.getTipoConflito())) {
            if (valida(c)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Valida globalmente se existem conflitos duplicados
     *
     * @param c
     * @return
     */
    public boolean valida(Conflito c) {
        for (Conflito conf : listaConflitos) {
            if (conf.equals(c)) {
                return false;
            }
        }
        return true;
    }

}
