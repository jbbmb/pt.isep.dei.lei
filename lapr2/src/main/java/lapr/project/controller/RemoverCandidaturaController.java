package lapr.project.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lapr.project.model.Candidatura;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;
import lapr.project.model.ExposicaoEstado;
import lapr.project.model.ListaCandidaturas;

/**
 * @author Grupo 18_LAPR2 15-16
 */
public class RemoverCandidaturaController implements Serializable {

    private CentroExposicoes centroExposicoes;
    private String idRepresentante;
    private Exposicao exposicaoSelecionada;
    private Demonstracao demonstracaoSelecionada;
    private Candidatura candidaturaSelecionada;
    private List<Exposicao> listaExposicoes;
    private ArrayList<Demonstracao> listaDemonstracoes;

    public RemoverCandidaturaController(CentroExposicoes ce, String id) {
        this.centroExposicoes = ce;
        this.idRepresentante = id;
    }

    public List<Exposicao> getListaExposicoes() {
        this.listaExposicoes = centroExposicoes.getRegistoExposicoes().getListaExposicoes();
        return listaExposicoes;
    }

    public ExposicaoEstado selectExposicao(int indexExposicao) {
        this.exposicaoSelecionada = centroExposicoes.getRegistoExposicoes().getListaExposicoes().get(indexExposicao);
        return exposicaoSelecionada.getEstadoExp();
    }

    public String getCandidaturaExposicaoRepresentante() throws NullPointerException {
        this.candidaturaSelecionada = exposicaoSelecionada.getListaCandidaturas().getCandidaturaRepresentante(idRepresentante);
        return candidaturaSelecionada.toString();
    }

    public List<Demonstracao> getListaDemonstracoes() {
        this.listaDemonstracoes = exposicaoSelecionada.getListaDemonstracoes().getListaDemonstracoes();
        return listaDemonstracoes;
    }

    public void selectDemonstracao(int indexDemonstracao) {
        this.demonstracaoSelecionada = listaDemonstracoes.get(indexDemonstracao);
    }

    public String getCandidaturaDemonstracaoRepresentante() throws NullPointerException{
        this.candidaturaSelecionada = demonstracaoSelecionada.getListaCandidaturas().getCandidaturaRepresentante(idRepresentante);
        return candidaturaSelecionada.toString();
    }

    public void removerCandidatura() {
        if (demonstracaoSelecionada != null) {
            demonstracaoSelecionada.getListaCandidaturas().removerCandidatura(candidaturaSelecionada);
        } else {
            exposicaoSelecionada.getListaCandidaturas().removerCandidatura(candidaturaSelecionada);
        }
    }

}
