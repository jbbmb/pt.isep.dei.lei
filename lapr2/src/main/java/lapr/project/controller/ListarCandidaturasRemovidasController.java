/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lapr.project.model.Candidatura;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;

/**
 *
 * @author Grupo 18
 */
public class ListarCandidaturasRemovidasController implements Serializable {

    private CentroExposicoes centroExposicoes;
    private String idOrganizador;
    private Exposicao exposicaoSelecionada;
    private Demonstracao demonstracaoSelecionada;
    private List<Exposicao> listaExposicoesOrganizador;
    private List<Demonstracao> listaDemonstracoesOrganizador;

    public ListarCandidaturasRemovidasController(CentroExposicoes centroExposicoes, String id) {
        this.centroExposicoes = centroExposicoes;
        this.idOrganizador = id;
    }

    public List<Exposicao> getListaExposicoesOrganizador() {
        this.listaExposicoesOrganizador = centroExposicoes.getRegistoExposicoes().getListaExposicoesOrganizador(idOrganizador);
        return listaExposicoesOrganizador;

    }
    
    public List<Demonstracao> getListaDemonstracoesOrganizador(){
        listaDemonstracoesOrganizador = new ArrayList<>();
        List<Exposicao> listaExposicoes = getListaExposicoesOrganizador();
        for (Exposicao e : listaExposicoes) {
            listaDemonstracoesOrganizador.addAll(e.getListaDemonstracoes().getListaDemonstracoes());
        }
        return listaDemonstracoesOrganizador;
    }

    public void selectExposicao(int indexExposicao) {
        listaExposicoesOrganizador = getListaExposicoesOrganizador();
        this.exposicaoSelecionada = listaExposicoesOrganizador.get(indexExposicao);
    }
    
    public void selectDemonstracao(int indexDemonstracao){
        this.demonstracaoSelecionada = this.listaDemonstracoesOrganizador.get(indexDemonstracao);
    }

    public List<Candidatura> mostrarListaCandidaturasRemovidas() {
       if(exposicaoSelecionada != null){
           List<Candidatura> listaCandidaturasRemovidas = exposicaoSelecionada.getListaCandidaturasRemovidas();
           return listaCandidaturasRemovidas;
       }else{
           List<Candidatura> listaCandidaturasRemovidas = demonstracaoSelecionada.getListaCandidaturasRemovidas();
           return listaCandidaturasRemovidas;
       }
    }
}
