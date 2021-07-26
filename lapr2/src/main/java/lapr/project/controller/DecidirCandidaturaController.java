/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.io.Serializable;
import java.util.List;
import lapr.project.model.Candidatura;
import lapr.project.model.CandidaturaEstadoAvaliada;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;
import lapr.project.model.ExposicaoEstado;
import lapr.project.model.ExposicaoEstadoCandidaturasAvaliadas;

/**
 *
 * @author Grupo 18_LAPR2 15-16
 */
public class DecidirCandidaturaController implements Serializable{
    private CentroExposicoes centroExposicoes;
    private Exposicao exposicao;
    private Demonstracao demonstracao;
    private Candidatura candidatura;
    private String decisao;
    private ExposicaoEstado estado;
    private List<Exposicao> listaExposicoes;
    private List<Candidatura> listaCandidaturas;

    public DecidirCandidaturaController(CentroExposicoes centroExposicoes) {
        this.centroExposicoes = centroExposicoes;
    }
    
    public List<Exposicao> getListaExposicao(String username){
        return listaExposicoes = centroExposicoes.getRegistoExposicoes().
                getListaExposicoesOrganizador(username);
    }
    
    public ExposicaoEstado selectExposicao(int indexExposicao){
        this.exposicao = listaExposicoes.get(indexExposicao);
        estado = exposicao.getEstadoExp();
        return estado;        
    }
    
    public List<Candidatura> getListaCandidaturas(Exposicao e){
        listaCandidaturas = e.getListaCandidaturas().getListaCandidaturas();
        /*for (int i = 0; i < listaExposicoes.size(); i++) {
            if (listaCandidaturas.get(i) instanceof CandidaturaEstadoAvaliada) {
                listaCandidaturas.add(listaCandidaturas.get(i));
            }
        }*/
        return listaCandidaturas;
    }
    
    public void selectCandidatura(int indexCandidatura){
        this.candidatura = listaCandidaturas.get(indexCandidatura);
    }
    
    public String getDadosCandidatura(){
        return candidatura.toString();
    }
    
    public boolean setDecisao(String decisao){
        this.decisao = decisao;
        boolean flag = candidatura.validaDecisao(decisao);
        return flag; 
    }
    
    public void registaDecisao(){
        candidatura.registaDecisao(decisao);
        
        boolean flag = true;
        /*for (int i = 0; i < getListaCandidaturas().size(); i++) {
            Candidatura c = getListaCandidaturas().get(i);
            if(c.getEstado() instanceof CandidaturaEstadoAvaliada == false){
                i = getListaCandidaturas().size();
                flag = false;
            }
        }*///flag == true && 
        /*if(estado instanceof ExposicaoEstadoCandidaturasAvaliadas){
            exposicao.getEstadoExp().setCandidaturasDecididas();
        }else{
            if(flag == true){
                demonstracao.getEstado().setCandidaturasDecididas();
            }
        }*/
        
    }
    
    
    
    
    
    
    
    
    
}
