package SOGE;
/** @author Débora Costa (1150433), João Borges (1150475) e Luís Gouveia (1150437) @ LEI-ISEP */

import java.util.ArrayList;
import java.util.List;

public class ListaAtribuicoes {
    
    List<Atribuicao> la;
    
    public ListaAtribuicoes(List<Atribuicao> la){
        this.la = la;
    }
    
    public ListaAtribuicoes(){
        la = new ArrayList<Atribuicao>();
    }
    /**
     * Devolve a lista de atribuições feitas.
     * @return lista de atribuições
     */
    public List<Atribuicao> getListaAtribuicoes(){
        return la;
    }
    
    /**
     * Regista a lista de atribuições.
     * @param la a lista de atribuicoes 
     */
    public boolean registarAtribuicoes(List<Atribuicao> la){
        if(this.la.addAll(la)){
            return true;
        } else{
            return false;
        }
    } 
    
    /**
     * Cria uma nova atribuição de uma candidatura a um FAE.
     * @param c candidatura a ser atribuida
     * @param fae FAE em questão
     * @return a atribuição feita
     */
    public Atribuicao newAtribuicao(Candidatura c, FAE fae){
        Atribuicao a = new Atribuicao(c, fae);
        return a;
    }
    
    /**
     * Valida as atribuições feitas.
     * @return o resultado da validação
     */
    public boolean validarAtribuicoes(){
        boolean flag = true;
        for (int i = 0; i < la.size(); i++) {
            Atribuicao a = la.get(i);
            if (a.getCandidatura() == null || a.getFAE() == null){
                i = la.size();
                flag = false;
            }
        }
        return flag;
    }

    public void removerAtribuicao(Atribuicao atribuicao) {
       la.remove(atribuicao);
    }

}