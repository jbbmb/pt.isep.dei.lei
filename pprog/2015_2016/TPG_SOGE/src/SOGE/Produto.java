package SOGE;
/** @author Débora Costa (1150433), João Borges (1150475) e Luís Gouveia (1150437) @ LEI-ISEP */

public class Produto {
    
    /**
     * Nome do produto
     */
    private String nome;
    
    /**
     * Nome do produto por omissão
     */
    private static final String NOME_POR_OMISSAO = "Sem nome";
    
    /**
     * Cria instâncias da classe Produto recebendo como parâmetro o nome do produto
     * @param nome - nome do produto
     */
    public Produto(String nome){
        this.nome = nome;
    }
    
    /**
     * Cria instâncias da classe Produto com os valores por omissão
     */
    public Produto(){
        nome = NOME_POR_OMISSAO;
    }
    
    /**
     * Modifica o nome do produto
     * @param nome o novo nome do produto
     */
    public void setNome(String nome){
        this.nome = nome;
    }
    
    /**
     * Devolve o nome do produto
     * @return o nome do produto
     */
    public String getNome(){
        return nome;
    }

}