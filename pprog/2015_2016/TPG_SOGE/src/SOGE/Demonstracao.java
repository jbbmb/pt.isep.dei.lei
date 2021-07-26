package SOGE;
/** @author Débora Costa (1150433), João Borges (1150475) e Luís Gouveia (1150437) @ LEI-ISEP */

public class Demonstracao {
    
    /**
     * O Nome da demonstração.
     */
    private String nome;
    /**
     * Cria instâncias da classe Demonstração.
     * @param nome 
     */
    public Demonstracao (String nome){
        this.nome = nome;
    }
    
    /**
     * Devolve o nome da Demonstração.
     * @return o nome da demonstração.
     */
    public String getNome(){
        return nome;
    }
    
    /**
     * Altera o nome da Demonstração.
     * @param nome o novo nome.
     */
    public void setNome(String nome){
        this.nome = nome;
    }
}