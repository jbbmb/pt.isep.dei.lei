/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.io.Serializable;
import java.util.Date;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.ListaOrganizadores;
import lapr.project.model.RegistoUtilizadores;
import lapr.project.model.Utilizador;

/**
 *
 * @author grupo18
 */
public class CriarExposicaoController implements Serializable{
    
    private final CentroExposicoes centroExposicoes;
    private Exposicao exposicao;

    public CriarExposicaoController(CentroExposicoes centroExposicoes) {
        this.centroExposicoes = centroExposicoes;
    }
    
    public void novaExposicao(){
        exposicao = centroExposicoes.getRegistoExposicoes().novaExposicao();
    }
    
    public void setDados(String titulo, String textoDescritivo, Date dataInicio,
            Date dataFim, String local, Date periodoSubCandInicio, 
            Date periodoSubCanFim, Date limConflitos){
        exposicao.setTitulo(titulo);
        exposicao.setTextoDescritivo(textoDescritivo);
        exposicao.setLocal(local);
        exposicao.setPeriodoRealizacao(dataInicio, dataFim);
        exposicao.setPeriodoSubmissao(periodoSubCandInicio, periodoSubCanFim);
        exposicao.setDataLimConflitos(limConflitos);
    }
    
    public Utilizador getUtilizador(String username){
        return centroExposicoes.getRegistoUtilizador().getUtilizador(username);
    }
    
    public RegistoUtilizadores getListaUtilizadores(){
        return centroExposicoes.getRegistoUtilizador();
    }
    
    public void addOrganizador(Utilizador utilizador){
        exposicao.getListaOrganizadores().addOrganizador(utilizador);
    }
    
    public void registaExposicao(){
        centroExposicoes.getRegistoExposicoes().registaExposicao(exposicao);
    }
    
    public ListaOrganizadores getListaOrganizadores(){
        return exposicao.getListaOrganizadores();
    }

    public Exposicao getExposicao() {
        return exposicao;
    }
    
    
}
