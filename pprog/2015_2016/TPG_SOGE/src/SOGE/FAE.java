package SOGE;
/** @author Débora Costa (1150433), João Borges (1150475) e Luís Gouveia (1150437) @ LEI-ISEP */

import java.util.ArrayList;
import java.util.List;

public class FAE {
    /**
     * Lista de candidaturas atribuída ao FAE
     */
    private List<Candidatura> listaCandidaturas;
    
    /**
     * Lista de exposições nas quais o FAE participa
     */
    private List<Exposicao> listaExposicoes;
    
    /**
     * ID do FAE
     */
    private String id;
    
    /**
     * ID do FAE por omissão
     */
    private static final String ID_POR_OMISSAO = "Sem id";
    
    /**
     * Cria instâncias da classe FAE recebendo como parâmetro o ID do FAE
     */
    public FAE(String id){
        this.id = id;
        listaCandidaturas = new ArrayList<Candidatura>();
        listaExposicoes = new ArrayList<Exposicao>();
    }
    
    /**
     * Cria instâncias da classe FAE com os valores por omissão
     */
    public FAE(){
        id = ID_POR_OMISSAO;
        listaCandidaturas = new ArrayList<Candidatura>();
        listaExposicoes = new ArrayList<Exposicao>();
    }
    
    // ~exposicao : Exposicao
    //por acabar
    public String getID(){
        return id;
    }

    /**
     * Devolve a lista de candidaturas de um dado FAE
     */
    public List<Candidatura> getListaCandidaturas() {
        return listaCandidaturas;
    }

    /**
     * Devolve a lista de exposições de um dado FAE
     * @return Lista de exposições
     */
    public List<Exposicao> getListaExposicoes() {
        return listaExposicoes;
    }
    
    /**
     * Altera o conteúdo da variável ID.
     * @param id o novo id.
     */
    public void setID(String id){
        this.id = id;
    }
    
    /**
     * Altera a lista de candidaturas do FAE.
     * @param listaCandidaturas a nova lista de candidaturas
     */
    public void setListaCandidaturas(List<Candidatura> listaCandidaturas){
        this.listaCandidaturas = listaCandidaturas;
    }
    
    /**
     * Altera a lista de exposições do FAE.
     * @param listaExposicoes a nova lista de exposições
     */
    public void setListaExposicoes(List<Exposicao> listaExposicoes){
        this.listaExposicoes = listaExposicoes;
    }

}