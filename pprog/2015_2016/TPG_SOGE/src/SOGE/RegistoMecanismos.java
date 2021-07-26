package SOGE;
/** @author Débora Costa (1150433), João Borges (1150475) e Luís Gouveia (1150437) @ LEI-ISEP */

import java.util.ArrayList;
import java.util.List;

public class RegistoMecanismos {
    
    List<MecanismoAtribuicao> listaMecanismos;

    
    public RegistoMecanismos(List<MecanismoAtribuicao> lm){
        this.listaMecanismos = lm;
    }
    
    public RegistoMecanismos(){
        listaMecanismos = new ArrayList<MecanismoAtribuicao>();
    }
   /**
    * Devolve a lista de Mecanismos de Atribuição.
    * @return a lista de mecanismos
    */ 
    public List<MecanismoAtribuicao> getListaMecanismos(){
        return listaMecanismos;
    }
    
    public void setListaMecanismos(List<MecanismoAtribuicao> listaMecanismos) {
        this.listaMecanismos = listaMecanismos;
    }

}