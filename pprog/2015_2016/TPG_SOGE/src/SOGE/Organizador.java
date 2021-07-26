package SOGE;
/** @author Débora Costa (1150433), João Borges (1150475) e Luís Gouveia (1150437) @ LEI-ISEP */

import java.util.ArrayList;
import java.util.List;

public class Organizador {

    /**
     * O identificador do Organizador.
     */
    private String id;
    
    /**
     * O identificador do Organizador por defeito.
     */
    private static final String ID_POR_DEFEITO = "sem identificação";
    
    /**
     * A lista de exposições do organizador.
     */
    private List<Exposicao> le;
    
    /**
     * Cria instâncias da classe Organizador
     * @param id o identificador do Organizador
     * @param le a lista de exposições do organizador.
     */
    public Organizador(String id, List<Exposicao> le){
        this.id = id;
        this.le = le;
    }
    /**
     * Cria instâncias da classe Organizador
     * @param id o identificador do Organizador
     */
    public Organizador(String id){
        this.id = id;
        le = new ArrayList<Exposicao>();
    }
    
    /**
     * Cria instâncias da classe Organizador
   */
    public Organizador(){
        id = ID_POR_DEFEITO;
        le = new ArrayList<Exposicao>();
    }
    
    /**
     * Devolve o identificador do Organizador.
     * @return o identificador
     */
    public String getID() {
        return id;
    }

    /**
     * Devolver a lista de exposições do Organizador.
     * @return a lista de Exposições.
     */
    public List<Exposicao> getListaExposicoes() {
        return le;
    }
    
    /**
     * Modifica o identificador do Organizador.
     * @param id o novo identificador
     */
    public void setID(String id) {
        this.id = id;
    }
    
    /**
     * Modifica a lista de Exposições do Organizador.
     * @param le a nova lista de Exposições
     */
    public void setListaExposicoes(List<Exposicao> le){
        this.le = le;
    }
    
}