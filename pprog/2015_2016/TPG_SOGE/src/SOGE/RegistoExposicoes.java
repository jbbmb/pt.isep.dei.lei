package SOGE;
/** @author Débora Costa (1150433), João Borges (1150475) e Luís Gouveia (1150437) @ LEI-ISEP */

import java.util.ArrayList;
import java.util.List;

public class RegistoExposicoes {

    private List<Exposicao> le;

    /**
     * Construtor com parâmetros da classe RegistoExposições
     *
     * @param le Lista com objetos do tipo Exposição
     */
    public RegistoExposicoes(List<Exposicao> le) {
        this.le = le;
    }

    /**
     * Construtor sem parâmetros da classe RegistoExposições
     */
    public RegistoExposicoes() {
        le = new ArrayList<Exposicao>();
    }

    /**
     * Devolve a lista de exposições de um determinado organizador.
     *
     * @param o o organizador em causa
     * @return a lista de exposições
     */
    public List<Exposicao> getListaExposicoesOrganizador(ListaOrganizadores lo, Utilizador o) {
        Organizador org = lo.getOrganizador(o);
        return org.getListaExposicoes();
        
    }

    /**
     * Devolve a lista de exposições de um determinado FAE.
     *
     * @param u o FAE em causa
     * @return a lista de exposições
     */
    public List<Exposicao> getListaExposicoesDoFAE(ListaFAEs lfae, Utilizador u) {
        FAE fae = lfae.getFAE(u);
        return fae.getListaExposicoes();
    }

    /**
     * Devolve a lista de Exposicoes do centro de exposições.
     * @return a lista de exposições.
     */
    public List<Exposicao> getExposicoes() {
        return le;
    }
    
    /**
     * Adiciona uma exposicao à lista.
     * @param e 
     */
    public void addExposicao(Exposicao e){
        le.add(e);
    }

}