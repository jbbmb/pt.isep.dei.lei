package SOGE.Controllers;
/** @author Débora Costa (1150433), João Borges (1150475) e Luís Gouveia (1150437) @ LEI-ISEP */

import SOGE.Atribuicao;
import SOGE.CentroExposicoes;
import SOGE.Exposicao;
import SOGE.ListaAtribuicoes;
import SOGE.MecanismoAtribuicao;
import SOGE.RegistoMecanismos;
import SOGE.Utilizador;
import java.util.List;

public class AtribuirCandidaturaController {
    /**
     * Centro de exposições no qual contém a exposicão a que se vai proceder ao 
     * registo de candidatura.
     */
    private CentroExposicoes centroExposicoes;
    
    /**
     * Exposicao que vai ser selecionada para depois apresntar as candidaturas 
     * apenas daquela exposição.
     */
    private Exposicao exposicao;
    
    /**
     * Lista de exposições de um dados organizador.
     */
    private List<Exposicao> listaExposicoes;
    
    /**
     * Lista de Atribuições de Candidaturas a FAEs.
     */
    private ListaAtribuicoes listaAtribuicoes; 
    
    /** 
     * Mecanismo de atribuicao selecionado.
     */
    private MecanismoAtribuicao mecanismoAtribuicao;
    /**
     * Cria instâncias de AtribuirCandidaturaController
     * @param centroExposicoes 
     */
    public AtribuirCandidaturaController(CentroExposicoes centroExposicoes){
        this.centroExposicoes = centroExposicoes;
    }
    
    /**
     * Devolve uma lista de exposições de um dado utilizador
     * @param u - Organizador
     * @return Lista exposições
     */
    public List<Exposicao> getlistaExposicoes(Utilizador u){
        return listaExposicoes = centroExposicoes.getRegistoExposicoes().getListaExposicoesOrganizador(exposicao.getRegistoOrganizadores(), u);
    }
    
    /**
     * Seleciona a exposicao
     * @param e - exposição a alterar
     */
    public void selectExposicao(Exposicao e){
        exposicao = e;
        listaAtribuicoes = exposicao.getRegistoAtribuicoes();
                
    }
    
    /**
     * Retorna a lista de mecanismos de atribuição disponíveis para escolha
     * @return Lista de mecanismos de atribuição
     */
    public List<MecanismoAtribuicao> getListaMecanismos(){
        return centroExposicoes.getRegistoMecanismos().getListaMecanismos();
    }
    
    /**
     * Seleciona um mecanismo de atribuição
     * @param m - Mecanismo modificado
     */
    public void selectMecanismo(MecanismoAtribuicao m){
        this.mecanismoAtribuicao = m;
    }
    
    /**
     * Retorna a lista de atribuicões segundo um mecanismo
     * @return Lista atribuições
     */
    public List<Atribuicao> getListaAtribuicao(){
        return mecanismoAtribuicao.getListaAtribuicoes(exposicao);
    }
    
    /**
     * Regista atribuição escolhida pelo organizador
     * @return Retorna true quando é registado com sucesso
     */
    public boolean registarAtribuicoes(List<Atribuicao> la){
        if(listaAtribuicoes.registarAtribuicoes(la)){
            return true;
        }else{
            return false;
        }
    }
        
}