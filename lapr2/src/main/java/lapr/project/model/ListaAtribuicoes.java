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
public class ListaAtribuicoes implements Serializable {

    private ArrayList<Atribuicao> listaAtribuicoes;

    /**
     * Construtor com lista de candidaturas por atribuir
     *
     * @param listaAtribuicoes
     */
    public ListaAtribuicoes(ArrayList<Atribuicao> listaAtribuicoes) {
        this.listaAtribuicoes = listaAtribuicoes;
    }

    /**
     * Construtor vazio
     */
    public ListaAtribuicoes() {
        listaAtribuicoes = new ArrayList<>();
    }

    /**
     * Devolva o Array de Atribuicao
     *
     * @return
     */
    public ArrayList<Atribuicao> getListaAtribuicoes() {
        return listaAtribuicoes;
    }

    /**
     * Altera o array
     *
     * @param listaAtribuicao
     */
    public void setListaAtribuicao(ArrayList<Atribuicao> listaAtribuicao) {
        this.listaAtribuicoes = listaAtribuicao;
    }

    /**
     * Devolve as candidaturas do fae que recebe como parametro
     *
     * @param fae instância de FAE
     * @return
     */
    public List<Candidatura> getCandidaturasAtribuidas(FAE fae) {
        ArrayList<Candidatura> listaAtribuidas = new ArrayList<>();
        for (Atribuicao atribuicao : listaAtribuicoes) {
            if (atribuicao.getFAE().equals(fae)) {
                listaAtribuidas.add(atribuicao.getCandidatura());
            }
        }
        return listaAtribuidas;
    }

    /**
     * Adiciona uma atribuicao à lista de atribuicoes
     *
     * @param atribuicao
     * @return
     */
    public void addAtribuicao(Atribuicao atribuicao) {
        this.listaAtribuicoes.add(atribuicao);
    }

}
