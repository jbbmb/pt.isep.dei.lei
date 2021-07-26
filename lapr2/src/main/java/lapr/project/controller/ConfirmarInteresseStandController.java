package lapr.project.controller;

import java.io.Serializable;
import java.util.List;
import lapr.project.model.Candidatura;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.Stand;

/** @author Grupo 18_LAPR2 15-16 */

public class ConfirmarInteresseStandController implements Serializable{
    
    private CentroExposicoes ce;
    private Exposicao exposicaoSelecionada;
    private String idRepresentante;
    private Candidatura candidaturaDoRepresentante;
    private Stand standAtribuido;
    private List<Exposicao> listaExposicoes;
    
    public ConfirmarInteresseStandController(CentroExposicoes ce, String idRepresentante){
        this.ce = ce;
        this.idRepresentante = idRepresentante;
    }
    
    public List<Exposicao> getRegistoExposicoes(){
        return listaExposicoes = ce.getRegistoExposicoes().getListaExposicoes();
    }
    
    public void selecionaExposicao(int indexExposicao){
        this.exposicaoSelecionada = listaExposicoes.get(indexExposicao);
    }
    
    public String getCandidatura() throws NullPointerException {
        candidaturaDoRepresentante = exposicaoSelecionada.getListaCandidaturas().getCandidaturaRepresentante(idRepresentante);
        return candidaturaDoRepresentante.toString();
    }
    
    public String getStandAtribuido(){
        standAtribuido = exposicaoSelecionada.getListaAtribuicoesStands().getAtribuicao(candidaturaDoRepresentante).getStand();
        return standAtribuido.toString();
    }
    
    public void setStand(){
        candidaturaDoRepresentante.setStand(standAtribuido);
    }

}