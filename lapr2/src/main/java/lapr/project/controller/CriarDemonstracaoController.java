/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.io.Serializable;
import java.util.List;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;
import lapr.project.model.ExposicaoEstadoComFAESemDemonstracao;
import lapr.project.model.ListaDemonstracoes;
import lapr.project.model.Recurso;

/**
 *
 * @author Grupo 18_LAPR2 15-16
 */
public class CriarDemonstracaoController implements Serializable {

    private CentroExposicoes centroExposicoes;
    private List<Exposicao> listaExposicoes;
    private List<Exposicao> listaExposicoesSemDemonstracao;
    private Exposicao exposicao;
    private ListaDemonstracoes listaDemonstracoes;
    private Demonstracao demonstracao;
    private List<Recurso> listaRecursosDoCentro;
    private Recurso recurso;

    public CriarDemonstracaoController(CentroExposicoes centroExposicoes) {
        this.centroExposicoes = centroExposicoes;
    }

    public List<Exposicao> getListaExposicoes(String username) {
        listaExposicoesSemDemonstracao = centroExposicoes.getRegistoExposicoes().getListaExposicoesOrganizador(username);
        for (int i = 0; i < listaExposicoesSemDemonstracao.size(); i++) {
            if (listaExposicoesSemDemonstracao.get(i).getEstadoExp() instanceof ExposicaoEstadoComFAESemDemonstracao) {
                listaExposicoesSemDemonstracao.add(listaExposicoes.get(i));
            }
        }
        return listaExposicoesSemDemonstracao;
    }

    public void selectExposicao(int indexExposisao) {
        this.exposicao = listaExposicoesSemDemonstracao.get(indexExposisao);
    }

    public Demonstracao novaDemonstracao() {
        listaDemonstracoes = exposicao.getListaDemonstracoes();
        demonstracao = listaDemonstracoes.novaDemonstracao();
        return demonstracao;
    }

    public void setDados(String codigoUnico, String descricao) {
        demonstracao.setCodigoUnico(codigoUnico);
        demonstracao.setDescricao(descricao);
    }

    public List<Recurso> getListaRecursos() {
        listaRecursosDoCentro = centroExposicoes.getListaRecursos().getListaRecursos();
        return listaRecursosDoCentro;
    }

    public void selectRecurso(int indexRecurso) {
        this.recurso = listaRecursosDoCentro.get(indexRecurso);
    }

    public List<Recurso> getListaRecursosDem() {
        return demonstracao.getListaRecursos().getListaRecursos();
    }

    public void addRecurso(String recurso) {
        for (int i = 0; i < listaRecursosDoCentro.size(); i++) {
            if(recurso.equals(listaRecursosDoCentro.get(i).getRecurso())){
                demonstracao.getListaRecursos().getListaRecursos().add(listaRecursosDoCentro.get(i));
            }
        }
    }
    
    public void removerRecurso(String recurso){
        for (int i = 0; i < demonstracao.getListaRecursos().getListaRecursos().size(); i++) {
            if(recurso.equals(demonstracao.getListaRecursos().getListaRecursos().get(i).getRecurso())){
                demonstracao.getListaRecursos().getListaRecursos().remove(demonstracao.getListaRecursos().getListaRecursos().get(i));
            }
        }
    }

    public boolean registaDemonstracao() {
        if (listaDemonstracoes.registaDemonstracao(demonstracao)) {
            return true;
        }
        return false;
    }

}
