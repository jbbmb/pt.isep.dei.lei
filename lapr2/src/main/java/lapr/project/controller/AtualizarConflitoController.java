 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.io.Serializable;
import java.util.List;
import lapr.project.model.Candidatura;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Conflito;
import lapr.project.model.Exposicao;
import lapr.project.model.FAE;
import lapr.project.model.ListaConflitos;
import lapr.project.model.TipoConflito;

/**
 *
 * @author Grupo 18_LAPR2 15-16
 */
public class AtualizarConflitoController implements Serializable{

    private final CentroExposicoes centroExposicoes;
    private Exposicao exposicaoSelecionada;
    private ListaConflitos listaConflitos;
    private Conflito conflitoSelecionado;
    private Conflito conflitoCopia;

    public AtualizarConflitoController(CentroExposicoes centroExposicoes) {
        this.centroExposicoes = centroExposicoes;
    }

    public List<Exposicao> getListaExposicoes(String id) {
        return centroExposicoes.getRegistoExposicoes().getListaExposicoesFAE(id);
    }

    public void selectExposicao(Exposicao e) {
        exposicaoSelecionada = e;
    }

    public void getListaConflitos() {
        listaConflitos = exposicaoSelecionada.getListaConflitos();
    }

    public List<Conflito> getConflitos() {
        return listaConflitos.getListaConflitos();
    }

    public void selectConflito(Conflito conf) {
        conflitoSelecionado = conf;
        conflitoCopia = new Conflito(conflitoSelecionado);
    }

    public String getDadosConflito() {
        return conflitoSelecionado.getDadosConflito();
    }

    public void setConflito(FAE fae, Candidatura candidatura, TipoConflito tipoConflito) {
        conflitoCopia.setDadosAlterados(fae, candidatura, tipoConflito);
        listaConflitos.validaAlteracao(conflitoCopia);
    }

    public void apagarConflito() {
        listaConflitos.apagaConflito(conflitoSelecionado);
    }

    public void registaAlteracoes() {
        listaConflitos.registaAlteracoes(conflitoCopia, conflitoSelecionado);
    }
    
}
