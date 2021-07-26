package SOGE;
/** @author Débora Costa (1150433), João Borges (1150475) e Luís Gouveia (1150437) @ LEI-ISEP */

import java.util.ArrayList;
import java.util.List;

public class ListaOrganizadores {
    
    List<Organizador> lo ;
    
    public ListaOrganizadores(List<Organizador> lo){
        this.lo = lo;
    }
    
    public ListaOrganizadores(){
        lo = new ArrayList<Organizador>();
    }
    
    /**
     * Devolve a lista de Organizadores.
     * @return a lista de Organizadores
     */
    public List<Organizador> getListaOrganizadores(){
        return lo;
    }
    
    public Organizador getOrganizador(Utilizador u){
        int posicao = 0;
        while(lo.equals(u)== false && posicao<lo.size()){
            posicao++;
        }
        return lo.get(posicao);
    }

}