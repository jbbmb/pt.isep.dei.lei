package SOGE;
/** @author Débora Costa (1150433), João Borges (1150475) e Luís Gouveia (1150437) @ LEI-ISEP */

public class CentroExposicoes {
    
    private RegistoExposicoes le;
    private RegistoMecanismos lm;
    
    /**
     * Cria instâncias da classe CentroExposicoes
     * @param le instância da classe RegistoExposicoes que armazena as exposicoes do centro de exposições
     * @param lm instância da classe RegistoMecanismos que armazena os mecanismos de atribução de candidaturas a FAE do centro de exposições
     */
    public CentroExposicoes (RegistoExposicoes le, RegistoMecanismos lm){
        this.le = le;
        this.lm = lm;
    }
    
    /**
     * Cria instâncias da classe CentroExposicoes.
     */
    public CentroExposicoes(){
        le = new RegistoExposicoes();
        lm = new RegistoMecanismos();
    }
    
    /**
     * Altera o Registo de Exposições do Centro de Exposições
     * @param le o novo registo de Exposições.
     */
    public void setRegistoExposicoes(RegistoExposicoes le){
        this.le = le;
    }
    /**
     * Altera o Registo de Mecanismos de Atribuição de Candidaturas a FAE do Centro de Exposições
     * @param lm o novo Registo de Mecanismos de Atribuição.
     */
    public void setRegistoMecanismos(RegistoMecanismos lm){
        this.lm = lm;
    }
    /**
     * Devolve o registo de exposições do Centro de Exposições.
     * @return o registo pretendido.
     */
    public RegistoExposicoes getRegistoExposicoes(){
        return le;
    }
    
    /**
     * Devolve o registo de Mecanismos de Atribuição do Centro de Exposições.
     * @return o registo pretendido.
     */
    public RegistoMecanismos getRegistoMecanismos(){
        return lm;
    }
    
}