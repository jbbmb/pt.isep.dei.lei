/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.Candidatura;
import lapr.project.model.CandidaturaEstadoDecidida;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;
import lapr.project.model.ListaCandidaturas;

/**
 *
 * @author Utilizador
 */
public class CalcularTaxaAceitacaoController {

    private CentroExposicoes centro;
    private ListaCandidaturas listaCandidatura;
    private Exposicao exposicaoSelecionada;
    private List<Candidatura> listaCandidaturas;
//    private Demonstracao demonstracaoSelecionada;
    private CandidaturaExposicao candExpo;
    private int candidaturaAceites;
    private int candidaturaNaoAceites;


    public CalcularTaxaAceitacaoController(CentroExposicoes ce) {
        this.centro = ce;
    }

    public List<Exposicao> getListaExposicoes() {
        return centro.getRegistoExposicoes().getListaExposicoes();
    }

//    public List<Candidatura> getListaCandidaturasExposicao() {
//        this.listaCandidaturas = exposicaoSelecionada.getListaCandidaturas().getListaCandidaturas();
//        return listaCandidaturas;
//    }
//    
//    public List<Candidatura> getListaCandidaturasDemonstracao(){
//        listaCandidaturas = demonstracaoSelecionada.getListaCandidaturas().getListaCandidaturas();
//        return listaCandidaturas;
//    }
    public List<Candidatura> getListaCandidaturas(Exposicao e) {
        this.exposicaoSelecionada = e;
        listaCandidaturas = e.getListaCandidaturas().getListaCandidaturas();
        return listaCandidaturas;
    }

    public void obterDados() {
        candidaturaAceites = 0;
        candidaturaNaoAceites = 0;

        for (Candidatura u : exposicaoSelecionada.getListaCandidaturas().getListaCandidaturas()) {
            if (u.getEstado() instanceof CandidaturaEstadoDecidida) {
                candExpo = new CandidaturaExposicao(u);
                String decisao = candExpo.getDecisao();
                if (decisao.equalsIgnoreCase("Aceite")) {
                    candidaturaAceites++;
                } else {
                    candidaturaNaoAceites++;
                }
            }
        }
        
        if((candidaturaAceites + candidaturaNaoAceites) == 0){
            candidaturaNaoAceites = 1;
        }
    }

    public float calcularPercentagemDeAceitacao() {
        obterDados();
        return ((candidaturaAceites / (candidaturaAceites + candidaturaNaoAceites)) * 100);
    }

    public int candidaturasNaoAvaliadas() {
        return exposicaoSelecionada.getListaCandidaturas().getCandidaturasNaoAvaliadas().size();
    }

    public int candidaturasRemovidas() {
        return exposicaoSelecionada.getListaCandidaturas().getListaCandidaturasRemovidas().size();
    }

}
