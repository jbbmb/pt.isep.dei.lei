package SOGE;
/** @author Débora Costa (1150433), João Borges (1150475) e Luís Gouveia (1150437) @ LEI-ISEP */

public class Avaliacao {

    /**
     * Atribuição da candidatura a FAE
     */
    private Atribuicao atribuicao;
    
    /**
     * A decisão da avaliação da candidatura.
     *
     * (ver se é String ou decisão)
     */
    private String decisao;

    /**
     *  valor por defeito para a variavel decisao.
     */
    private static final String DECISAO_POR_DEFEITO = "sem decisão";
    
    /**
     * O texto justificativo que acompanha a decisão da avaliação.
     */
    private String justificacao;
    
    /**
     *  valor por defeito para a variavel jutificacao.
     */
    private static final String JUSTIFICACAO_POR_DEFEITO = "sem justificação";

    /**
     * Cria instâncias da classe Avaliação.
     * @param decisao o resultado da avaliação da candidatura
     * @param justificacao texto justificativo da decisão
     */
    public Avaliacao(String decisao, String justificacao){
        this.decisao = decisao;
        this.justificacao = justificacao;
    }   

    /**
     * Cria instâncias da classe Avaliação.
     */
    public Avaliacao (){
        decisao = DECISAO_POR_DEFEITO;
        justificacao = JUSTIFICACAO_POR_DEFEITO;
    }
    
    /** 
     * Define uma Atribuição
     *
     * @param a a Atribuição a ser definida a Avaliação em questão
     */
    public void setAtribuicao(Atribuicao a) {
        atribuicao = a;
    }

    /**
     * Define uma Decisão para a Avaliação
     *
     * @param decisao a decisão a ser guardada
     */
    public void setDecisao(String decisao) {
           this.decisao = decisao;
    }

    /**
     * Define uma justificação para a Decisão dada na Avaliação
     *
     * @param justificacao a justificadao da decisão da Avaliação
     */
    public void setJustificacao(String justificacao) {
        this.justificacao = justificacao;
    }
    
    /**
     * Devolve a atribuição 
     * @return 
     */
    public Atribuicao getAtribuicao() {
        return atribuicao;
    }

    /**
     * Retorna a decisão da candidatura, se é aceite ou rejeitada
     * @return decisao
     */
    public String getDecisao() {
        return decisao;
    }

    /**
     * Retorna a justificação da avaliação da candidatura
     * @return 
     */
    public String getJustificacao() {
        return justificacao;
    }

    /**
     * Valida se todos os campos da avaliação estão preenchidos.
     *
     * @return true se a avaliação estiver devidamente preenchida, false se houver
     * um campo não preenchido
     */
    public boolean valida() {
        if(decisao != null && justificacao != null ){
            return true;
        }
        return false;
    }

}