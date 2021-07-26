package gestaoCC;
/** @author João Borges, 1150475 - LEI @ ISEP */

public class auditorio extends espacoPrincipal implements AudioVisual, Seguranca {
    
    // Variáveis da classe
    private int numLugaresDisponiveis;
    private int numEquipamentosAudiovisuais;
    private static int numAuditorio = 0;
    private static float custoLugar = 1;
    private static float custoEquipamento = 5;
    
    // Valores pré-definidos
    private static final int NUM_LUGARES_DISPONIVEIS_POR_OMISSAO = 0;
    private static final int NUM_EQUIPAMENTOS_AUDIOVISUAIS_POR_OMISSAO = 0;

    // Construtores de objetos
    public auditorio() {
        super();
        this.numLugaresDisponiveis = NUM_LUGARES_DISPONIVEIS_POR_OMISSAO;
        this.numEquipamentosAudiovisuais = NUM_EQUIPAMENTOS_AUDIOVISUAIS_POR_OMISSAO;
        numAuditorio++;
    }
    
    public auditorio(String identificacao, String descricao, double area, int numLugaresDisponiveis, int numEquipamentosAudiovisuais) {
        super(identificacao, descricao, area);
        this.numLugaresDisponiveis = numLugaresDisponiveis;
        this.numEquipamentosAudiovisuais = numEquipamentosAudiovisuais;
        numAuditorio++;
    }
    
    public auditorio(auditorio auditorio) {
        super(auditorio);
        this.numEquipamentosAudiovisuais = auditorio.getNumEquipamentosAudiovisuais();
        this.numLugaresDisponiveis = auditorio.getNumLugaresDisponiveis();
        numAuditorio++;
    }

    // Métodos de consulta
    public int getNumLugaresDisponiveis() {
        return numLugaresDisponiveis;
    }

    public int getNumEquipamentosAudiovisuais() {
        return numEquipamentosAudiovisuais;
    }
    
    public static float getCustoLugar() {
        return custoLugar;
    }
    
    public static float getCustoEquipamento() {
        return custoEquipamento;
    }
    
    public static int getNumAuditorio() {
        return numAuditorio;
    }
    
    // Métodos de modificação
    public void setNumLugaresDisponiveis(int numLugaresDisponiveis) {
        this.numLugaresDisponiveis = numLugaresDisponiveis;
    }

    public void setNumEquipamentosAudiovisuais(int numEquipamentosAudiovisuais) {
        this.numEquipamentosAudiovisuais = numEquipamentosAudiovisuais;
    }

    public static void setCustoLugar(float custoLugar) {
        auditorio.custoLugar = custoLugar;
    }

    public static void setCustoEquipamento(float custoEquipamento) {
        auditorio.custoEquipamento = custoEquipamento;
    }
    
    // Métodos de função
    /**
     * Calcula o valor total a pagar pelos equipamentos audiovisuais do auditório.
     * @return valor a pagar de equipamentos audiovisuais
     */
    @Override
    public float calcularAudioVisual() {
        return custoEquipamento * numEquipamentosAudiovisuais;
    }

    /**
     * Calcula a despesa com a segurança contratada para o auditório.
     * @return valor a pagar pela segurança do auditório
     */
    @Override
    public float calcularSeguranca() {
        return custoLugar * numLugaresDisponiveis;
    }

    /**
     * Calcula o valor a pagar/custo final do aluguer do auditório.
     * @return valor a pagar pelo aluguer do auditório
     */
    @Override
    public double calcularCustoFinal() {
        return calcularAudioVisual() + calcularSeguranca() + (super.getArea()
                * espacoPrincipal.getPrecoPorMetroQuadrado());
    }

    /**
     * Faz uma representação textual da informação.
     * @return informação em memória
     */
    @Override
    public String toString() {
        return super.toString() +"\n---AUDITÓRIO---" +"\nNúmero de lugares disponíveis: " +numLugaresDisponiveis +"\nNúmero de equipamentos audiovisuais: " +numEquipamentosAudiovisuais + "\nValor a pagar do aluguer: " +calcularCustoFinal() +"€";
    }

}