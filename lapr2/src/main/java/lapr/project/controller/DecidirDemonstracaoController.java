package lapr.project.controller;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;
import lapr.project.model.ListaDemonstracoes;

/** @author Grupo 18_LAPR2 15-16 */

public class DecidirDemonstracaoController implements Serializable{
    private CentroExposicoes centroExposicoes;
    private Exposicao exposicao;
    private List<Exposicao> listaExposicoes;
    private ListaDemonstracoes listaDemonstracoes;
    private Demonstracao demonstracao;
    private String decisao;
    

    public DecidirDemonstracaoController(CentroExposicoes centroExposicoes) {
        this.centroExposicoes = centroExposicoes;
    }
    
    public List<Exposicao> getListaExposicoes(String username){
        return listaExposicoes = centroExposicoes.getRegistoExposicoes().getListaExposicoesOrganizador(username);
    }
    
    public void selectExposicao(int indexExposicao){
        this.exposicao = listaExposicoes.get(indexExposicao);
    }
    
    public ListaDemonstracoes getDemonstracoes(){
        return listaDemonstracoes = exposicao.getListaDemonstracoes();
    
    }
    
    public void selectDemonstracao(int indexDemonstracao){
        this.demonstracao = listaDemonstracoes.getListaDemonstracoes().get(indexDemonstracao);
    }
    
    public String getDadosDemonstracao(){
        return demonstracao.getDadosDemonstracao();
    }
    
    public void setDecisao(String decisao){
        this.decisao = decisao;
    }
    
    public void setPeriodoCandidaturas(Date dataInicio, Date dataFim){
        demonstracao.setDataInicio(dataInicio);
        demonstracao.setDataFim(dataFim);
    }
    
    public void registaDemonstracaoAceite(){
        if(decisao.equalsIgnoreCase("aceite")){
            listaDemonstracoes.registaDemonstracaoAceite(demonstracao);
        } else{
            listaDemonstracoes.getListaDemonstracoes().remove(demonstracao);
        }
    }
    
}