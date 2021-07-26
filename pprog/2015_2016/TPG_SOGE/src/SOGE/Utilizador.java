package SOGE;
/** @author Débora Costa (1150433), João Borges (1150475) e Luís Gouveia (1150437) @ LEI-ISEP */

public class Utilizador {

    /**
     * O identificador do utilizador.
     */
    private String id;
    
    /**
     * Cria instâncias da classe Utilizador
     * @param id o identificador do utilizador
     */
    public Utilizador(String id){
        this.id = id;
    }
    
    /**
     * Devolve o identificador do Utilizador
     * @return o idenfiticador
     */
    public String getID() {
      return id;
    }
    
    /**
     * Modifica o identificador do Utilizador.
     * @param id o novo identificador
     */
    public void setID(String id){
        this.id = id;
    }

}