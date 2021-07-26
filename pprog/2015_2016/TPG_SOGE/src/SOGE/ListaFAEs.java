package SOGE;
/** @author Débora Costa (1150433), João Borges (1150475) e Luís Gouveia (1150437) @ LEI-ISEP */

import java.util.ArrayList;
import java.util.List;

public class ListaFAEs {
    
    List<FAE> lfae;
    
    public ListaFAEs(List<FAE> lfae){
        this.lfae = lfae;
    }
    
    public ListaFAEs(){
        lfae = new ArrayList<FAE>();
    }
    /**
     * Devolve a lista de FAEs.
     * @return a lista de FAE
     */
    public List<FAE> getListaFAEs(){
        return lfae;
    }
    
    public FAE getFAE(Utilizador u){
        int posicao = 0;
        while(lfae.equals(u)== false && posicao<lfae.size()){
            posicao++;
        }
        return lfae.get(posicao);
    }

}