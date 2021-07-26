/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lapr.project.model.Atribuicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.DemonstracaoEstadoConflitosAlterados;
import lapr.project.model.Exposicao;
import lapr.project.model.ExposicaoEstado;
import lapr.project.model.ExposicaoEstadoConflitosAlterados;
import lapr.project.model.ListaAtribuicoes;
import lapr.project.model.Mecanismo;

/**
 *
 * @author grupo18
 */
public class AtribuirCandidaturaController implements Serializable {

    private CentroExposicoes centro;
    private Mecanismo mecanismo;
    private Exposicao exposicao;
    private Demonstracao demonstracao;
    private ArrayList<Atribuicao> listaAtribuicoes;
    private ListaAtribuicoes lista;

    public AtribuirCandidaturaController(CentroExposicoes centro) {
        this.centro = centro;
    }

    public List<Exposicao> getListaExposicoesOrganizador(String username) {
        return centro.getRegistoExposicoes().getListaExposicoesOrganizador(username);
    }

    public ExposicaoEstado verificarEstado(Exposicao exposicao) {
        this.exposicao = exposicao;
        return exposicao.getEstadoExp();
    }

    public void setMecanismo(Mecanismo mecanismo) {
        if (exposicao.getEstadoExp() instanceof ExposicaoEstadoConflitosAlterados) {
            lista = exposicao.getListaAtribuicoes();
            listaAtribuicoes = mecanismo.atribuirCandidatura(exposicao.getListaFAE(),
                    exposicao.getListaCandidaturas(),
                    exposicao.getListaAtribuicoes());
        } else if (demonstracao.getEstado() instanceof DemonstracaoEstadoConflitosAlterados) {
            lista = demonstracao.getListaAtribuicoes();
            listaAtribuicoes = mecanismo.atribuirCandidatura(exposicao.getListaFAE(),
                    demonstracao.getListaCandidaturas(),
                    demonstracao.getListaAtribuicoes());
        }
    }

    public List<Demonstracao> getListaDemonstracoes(Exposicao exposicao) {
        return exposicao.getListaDemonstracoes().getListaDemonstracoes();
    }

    public void setDemonstracao(Demonstracao demonstracao) {
        this.demonstracao = demonstracao;
    }

    public void registaAtribuicoesCandidatura() {
        lista.setListaAtribuicao(listaAtribuicoes);
        if (exposicao.getEstadoExp() instanceof ExposicaoEstadoConflitosAlterados) {
            exposicao.setCandidaturasAtribuidas();

        } else if (demonstracao.getEstado() instanceof DemonstracaoEstadoConflitosAlterados) {
            demonstracao.setCandidaturasAtribuidas();
        }
    }
}
