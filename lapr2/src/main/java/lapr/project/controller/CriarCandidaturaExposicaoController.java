package lapr.project.controller;

import java.io.Serializable;
import java.util.List;
import lapr.project.model.CandidaturaEstadoInicial;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;
import lapr.project.model.ListaDemonstracoes;
import lapr.project.model.ListaProdutos;
import lapr.project.model.Produto;

/**
 * @author Grupo 18_LAPR2 15-16
 */
public class CriarCandidaturaExposicaoController implements Serializable {

    private CandidaturaExposicao candidatura;
    private Exposicao exposicao;
    private String idRepresentante;
    private final CentroExposicoes centroExposicoes;
    private ListaDemonstracoes listaDemonstracao;
    private ListaDemonstracoes listaDemonstracoesCandidatura;
    private ListaProdutos listaProdutos = new ListaProdutos();

    /**
     * Controlador
     *
     * @param centro intância de centro de exposições
     */
    public CriarCandidaturaExposicaoController(CentroExposicoes centro, String id) {
        this.centroExposicoes = centro;
        this.idRepresentante = id;
    }

    public List<Exposicao> getListaExposicoes() {
        return centroExposicoes.getRegistoExposicoes().getListaExposicoes();
    }

    public CandidaturaExposicao novaCandidatura(Exposicao e) {
        this.exposicao = e;
        candidatura = e.novaCandidaturaExposicao();
        candidatura.setEstado(new CandidaturaEstadoInicial(candidatura));
        return candidatura;
    }

    public void addProduto(String caracterizacao) {
        Produto produto = candidatura.novoProduto(caracterizacao);
        candidatura.addProduto(produto);
    }

    public ListaDemonstracoes getListaDemonstracao() {
        listaDemonstracao = exposicao.getListaDemonstracoes();
        return listaDemonstracao;
    }

    public void setDemonstracao(Demonstracao demonstracao) {
        candidatura.setDemonstracao(demonstracao);
    }

    public void registaCandidatura() {
        exposicao.getListaCandidaturas().addCandidaturaExposicao(candidatura);
        candidatura.setCriada();
    }

    public void setDados(String nomeEmpresa, String morada, String contacto,
            int area, int numConvites, String caracterizacao) {
        candidatura.setIdRepresentante(idRepresentante);
        candidatura.setNomeEmpresa(nomeEmpresa);
        candidatura.setMorada(morada);
        candidatura.setContacto(contacto);
        candidatura.setArea(area);
        candidatura.setNumConvites(numConvites);
        candidatura.setCaracterizacao(caracterizacao);
    }

    public CandidaturaExposicao getCandidatura() {
        return candidatura;
    }

    public ListaProdutos getListaProdutos() {
        listaProdutos = candidatura.getListaProdutos();
        return listaProdutos;
    }

    public ListaDemonstracoes getListaDemonstracoesCandidatura() {
        listaDemonstracoesCandidatura = candidatura.getListaDemonstracoes();
        return listaDemonstracoesCandidatura;
    }

    public void setListaDemonstracoesCandidatura(ListaDemonstracoes listaDemonstracoesCandidatura) {
        this.listaDemonstracoesCandidatura = listaDemonstracoesCandidatura;
    }

}
