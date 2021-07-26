package SOGE;
/** @author Débora Costa (1150433), João Borges (1150475) e Luís Gouveia (1150437) @ LEI-ISEP */

import java.util.ArrayList;
import java.util.List;

public class ListaCandidaturas {
    
    /**
     * Lista que armazena as variáveis do tipo Candidatura.
     */
    private List<Candidatura> lc;
    
    /**
     * Construtor sem parâmetros da classe ListaCandidaturas
     */
    public ListaCandidaturas(){
        lc = new ArrayList<Candidatura>();
    }
    /**
     * Construtor com parâmetros da classe ListaCandidaturas
     * @param lc = lista com objetos do tipo Candidatura. 
     */
    public ListaCandidaturas(List<Candidatura> lc){
        this.lc = lc;
    }
    
   /**
    * Retorna a lista de candidaturas.
    * @return lista com objetos do tipo Candidatura
    */
    public List<Candidatura> getListaCandidaturas(){
        return lc;
    }

    /**
     * Adiciona uma candidatura à lista de candidaturas já existentes
     * @param c - candidatura a ser adicionada
     */

    public void addCandidatura(Candidatura c) {
        lc.add(c);
    }

}