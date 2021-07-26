package SOGE;
/** @author Débora Costa (1150433), João Borges (1150475) e Luís Gouveia (1150437) @ LEI-ISEP */

import java.util.List;

public class Atribuicao {
    
    /**
     * Candidatura a ser atribuida ao FAE
     */
    private Candidatura candidatura;

    /**
     * FAE que avalia a candidatura
     */
    private FAE fae;
    
    /**
     * Cria instâncias de candidatura invocando uma Candidatura e um FAE
     * @param candidatura - a ser avaliada e atribuída ao FAE
        * @param listaFae - quem avalia a candidatura, pode ser um ou mais FAE
     */
    public Atribuicao(Candidatura candidatura, FAE fae){
        this.candidatura = candidatura;
        this.fae = fae;
    }
    
    
    /**
     * Retorna a candidatura de uma atribuição
     * @return candidatura
     */
    public Candidatura getCandidatura() {
        return candidatura;
    }

    /**
     * Altera a candidatura de uma atribuição
     * @param candidatura 
     */
    public void setCandidatura(Candidatura candidatura) {
        this.candidatura = candidatura;
    }

    /**
     * Devolve o FAE de uma atribuição
     * @return FAE
     */
    public FAE getFAE() {
        return fae;
    }

    /**
     * Altera o FAE de uma atribuição
     * @param fae 
     */
    public void setFAE(FAE fae) {
        this.fae = fae;
    }
    
    /**
     * Devolve a representação textual dos atributos
     * @return 
     */
    public String toString(){
        return String.format("Atribuição:/n/nCandidatura: %s/nFAE:%s", candidatura.getNome(), fae.getID());
    }
    
    /**
     * Devolve a informação acerca da candidatura por avaliar
     * @return a informacao da candidatura
     */
    public String getInformacaoDaCandidaturaPorAvaliar() {
        return candidatura.toString();
    }

}