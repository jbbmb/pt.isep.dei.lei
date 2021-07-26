package lapr.project.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lapr.project.model.Avaliacao;
import lapr.project.model.Candidatura;
import lapr.project.model.CandidaturaEstadoAvaliada;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;
import lapr.project.model.ExposicaoEstado;
import lapr.project.model.ExposicaoEstadoCandidaturasAtribuidas;
import lapr.project.model.FAE;
import lapr.project.model.ListaAvaliacoes;

/** @author Grupo 18_LAPR2 15-16 */

public class AvaliarCandidaturaController implements Serializable {
    
    private CentroExposicoes centroExposicoes;
    private Exposicao exposicaoSelecionada;
    private Demonstracao demonstracaoSelecionada;
    private Candidatura candidaturaSelecionada;
    private ListaAvaliacoes listaAvaliacoesCandidaturaSelecionada;
    private List<Candidatura> listaCandidaturas;
    private ExposicaoEstado estado;
    private Avaliacao avaliacao;
    private String IDFae;
    private List<Exposicao> listaExposicoes;
    private ArrayList<Demonstracao> listaDemonstracoes;
    
    public AvaliarCandidaturaController(CentroExposicoes centroExposicoes) {
        this.centroExposicoes = centroExposicoes;
    }
    
    public List<Exposicao> getListaExposicoesFAE(String id){
        this.IDFae = id;
        this.listaExposicoes = centroExposicoes.getRegistoExposicoes().getListaExposicoesFAE(IDFae);
        return listaExposicoes;
    }
    
    public List<Candidatura> getListaCandidaturasExposicao(){
        this.listaCandidaturas = exposicaoSelecionada.getListaCandidaturas().getListaCandidaturas();
        return listaCandidaturas;
    }
    
    public List<Demonstracao> getListaDemonstracoes(){
        this.listaDemonstracoes = exposicaoSelecionada.getListaDemonstracoes().getListaDemonstracoes();
        return listaDemonstracoes;
    }
    
    public List<Candidatura> getListaCandidaturasDemonstracao(){
        listaCandidaturas = demonstracaoSelecionada.getListaCandidaturas().getListaCandidaturas();
        return listaCandidaturas;
    }
    
    public boolean setRespostas(String r1,String r2,String r3,String r4,String r5){
        this.avaliacao.setConhecimentoFAE(r1);
        this.avaliacao.setAdequacaoExposicao(r2);
        this.avaliacao.setAdequacaoDemonstracoes(r3);
        this.avaliacao.setAdequacaoConvites(r4);
        this.avaliacao.setRecomendacao(r5);
        if (this.avaliacao.validarRespostas()){
            return true;
        }else{
            return false;
        }
    } 
    
    public ExposicaoEstado selectExposicao(int indexExposicao){
        this.exposicaoSelecionada = listaExposicoes.get(indexExposicao);
        return this.estado = exposicaoSelecionada.getEstadoExp();
    }
    
    public void selectDemonstracao(int indexDemonstracao){
        this.demonstracaoSelecionada = listaDemonstracoes.get(indexDemonstracao);
    }
    
     public void selectCandidatura(int indexCandidatura){
        this.candidaturaSelecionada = listaCandidaturas.get(indexCandidatura);
        this.listaAvaliacoesCandidaturaSelecionada = candidaturaSelecionada.getListaAvaliacoes();
    }
    
    public void novaAvaliacao(){
        this.avaliacao = this.listaAvaliacoesCandidaturaSelecionada.novaAvaliacao(IDFae);
    }
    
    public void registaAvaliacao(){
        candidaturaSelecionada.registaAvaliacao(avaliacao);
        boolean flag = true;
        for (int i = 0; i < listaCandidaturas.size(); i++) {
            Candidatura c = listaCandidaturas.get(i);
            if(c.getEstado() instanceof CandidaturaEstadoAvaliada == false){
                i = listaCandidaturas.size();
                flag = false;
            }
        }
        if(flag == true && estado instanceof ExposicaoEstadoCandidaturasAtribuidas){
            exposicaoSelecionada.getEstadoExp().setCandidaturasAvaliadas();
        }else{
            if(flag == true){
                demonstracaoSelecionada.getEstado().setCandidaturasAvaliadas();
            }
        }
    }
    
}