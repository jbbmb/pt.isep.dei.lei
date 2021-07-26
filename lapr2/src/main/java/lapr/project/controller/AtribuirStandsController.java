package lapr.project.controller;


import java.util.ArrayList;
import java.io.Serializable;
import java.util.List;
import lapr.project.model.AtribuicaoStand;
import lapr.project.model.Candidatura;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.ListaAtribuicoesStands;
import lapr.project.model.ListaCandidaturas;
import lapr.project.model.ListaStands;
import lapr.project.model.RegistoExposicoes;
import lapr.project.model.Stand;
import lapr.project.utils.toString;

/** @author Grupo 18_LAPR2 15-16 */

public class AtribuirStandsController implements Serializable{
    
    private CentroExposicoes centroExposicoes;
    private Exposicao exposicaoSelecionada;
    private Candidatura candidaturaSelecionada;
    private Stand standSelecionado;
    private String idOrganizador;
    private ListaAtribuicoesStands listaAtribuicoesStands;
    private AtribuicaoStand AtribuicaoStand;
    private List<Exposicao> listaExposicoes;
    private ArrayList<Candidatura> listaCandidaturasExposicao;
    private List<Stand> listaStands;

    public AtribuirStandsController(CentroExposicoes centroExposicoes, String idOrganizador) {
        this.centroExposicoes = centroExposicoes;
    }

    public CentroExposicoes getCentroExposicoes() {
        return centroExposicoes;
    }

    public void setCentroExposicoes(CentroExposicoes centroExposicoes) {
        this.centroExposicoes = centroExposicoes;
    }
    
    public List<Exposicao> getListaExposicoes(String idOrganizador){
        this.listaExposicoes = centroExposicoes.getRegistoExposicoes().getListaExposicoesOrganizador(idOrganizador);
     return listaExposicoes;
    }
    
    public void selectExposicao(int indexExposicao){
        if(indexExposicao == 1){
            indexExposicao--;
        }
        this.exposicaoSelecionada = listaExposicoes.get(indexExposicao);
        this.listaAtribuicoesStands = exposicaoSelecionada.getListaAtribuicoesStands();
        this.AtribuicaoStand = listaAtribuicoesStands.novaAtribuicaoStand();
        
    }
    public List<Candidatura> getListaCandidaturas(){
        this.listaCandidaturasExposicao = exposicaoSelecionada.getListaCandidaturas().getListaCandidaturas();
        return listaCandidaturasExposicao;
    }
    public List<Stand> getListaStands(){
        this.listaStands = centroExposicoes.getListaStands().getListaStands();
        return listaStands;
    }
    
    
    public boolean setDados(int indexCandidatura, int indexStand){
       
        if(indexCandidatura == 1){
            indexCandidatura--;
        }
        if (indexStand == 1) {
           indexStand--; 
        }
        
        this.candidaturaSelecionada = listaCandidaturasExposicao.get(indexCandidatura);
        this.standSelecionado = listaStands.get(indexStand);
        this.AtribuicaoStand.setCandidatura(candidaturaSelecionada);
        this.AtribuicaoStand.setStand(standSelecionado);
        boolean flag = listaAtribuicoesStands.validaAtribuicaoStand(this.AtribuicaoStand);
        return flag;
    }
    
    public void registarAtribuicaoStand(){
        listaAtribuicoesStands.registarAtribuicaoStand(this.AtribuicaoStand);
    }
    
}
