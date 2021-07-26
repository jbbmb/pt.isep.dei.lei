package lapr.project.controller;

import java.io.Serializable;
import java.util.List;
import lapr.project.model.CandidaturaDemonstracao;
import lapr.project.model.CandidaturaEstadoInicial;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;
import lapr.project.model.ListaCandidaturas;
import lapr.project.model.ListaDemonstracoes;

/**
 * @author Grupo 18_LAPR2 15-16
 */
public class CriarCandidaturaDemonstracaoController implements Serializable{

    private Exposicao exposicao;
    private final CentroExposicoes centroExposicoes;
    private ListaDemonstracoes listaDemonstracao;
    private String idRepresentante;
    private CandidaturaDemonstracao candidatura;
    private Demonstracao demonstracao;
    private ListaCandidaturas listaCandidaturaDemonstracao;
    private ListaCandidaturas listaDemonstracoesComInteresse;

    public CriarCandidaturaDemonstracaoController(CentroExposicoes centro, String id) {
        this.centroExposicoes = centro;
        this.idRepresentante = id;
    }

    public List<Exposicao> getListaExposicoes() {
        return centroExposicoes.getRegistoExposicoes().getListaExposicoes();
    }

    public ListaDemonstracoes getListaDemonstracao(Exposicao e) {
        listaDemonstracao = e.getListaDemonstracoes();
        return listaDemonstracao;
    }

    public CandidaturaDemonstracao novaCandDemonstracao(Demonstracao demonst) {
        this.demonstracao = demonst;
        candidatura = demonst.novaCandidaturaDemonstracao();
        candidatura.setEstado(new CandidaturaEstadoInicial(candidatura));
        return candidatura;
    }

    public void setDados(String descricao) {
        candidatura.setIdRepresentante(idRepresentante);
        candidatura.setDescricao(descricao);
    }

    public ListaCandidaturas getListaCandidaturaDemonstracao() {
        listaCandidaturaDemonstracao = demonstracao.getListaCandidaturas();
        return listaCandidaturaDemonstracao;
    }

    public void setListaCandidaturaDemonstracao(ListaCandidaturas listaCandidaturaDemonstracao) {
        listaCandidaturaDemonstracao = demonstracao.getListaCandidaturas();
    }

    public void registaCandidatura() {
        listaCandidaturaDemonstracao.validaAdicionaCandDemonstracao(candidatura);
    } 
    
}
