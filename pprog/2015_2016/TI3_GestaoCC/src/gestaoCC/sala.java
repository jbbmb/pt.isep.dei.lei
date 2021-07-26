package gestaoCC;
/** @author João Borges, 1150475 - LEI @ ISEP */

public class sala extends espacoAuxiliar implements AudioVisual {

    // Atributo personalizado
    public static enum Tipologias {
        U, Quadrado, Retangular, Circulo
    };
    
    // Variáveis da classe
    private Tipologias tipoSala;
    private int numEquipamentosAudiovisuais;
    private static int numSala = 0;
    private static float custoAudiovisuais = 3;
    private static double desconto = 0.2;
    
    private final Tipologias TIPOLOGIA_POR_OMISSAO = tipoSala.U;
    private static final int NUM_EQUIPAMENTOS_AUDIOVISUAIS_POR_OMISSAO = 0;

    // Construtores de objetos
    public sala() {
        super();
        this.tipoSala = TIPOLOGIA_POR_OMISSAO;
        this.numEquipamentosAudiovisuais = NUM_EQUIPAMENTOS_AUDIOVISUAIS_POR_OMISSAO;
        numSala++;
    }
    
    public sala(sala sala) {
        super(sala);
        this.tipoSala = sala.getTipologia();
        this.numEquipamentosAudiovisuais = sala.getNumEquipamentosAudiovisuais();
        numSala++;
    }
    
    public sala(String identificacao, String descricao, double area, Tipologias tipologia, int numEquipamentosAudiovisuais) {
        super(identificacao, descricao, area);
        this.tipoSala = tipologia;
        this.numEquipamentosAudiovisuais = numEquipamentosAudiovisuais;
        numSala++;
    }

    // Métodos de consulta
    public Tipologias getTipologia() {
        return tipoSala;
    }

    public int getNumEquipamentosAudiovisuais() {
        return numEquipamentosAudiovisuais;
    }
    
    public static int getNumSala() {
        return numSala;
    }
    
    // Métodos de modificação
    public void setTipologia(Tipologias tipologia) {
        this.tipoSala = tipologia;
    }

    public void setNumEquipamentosAudiovisuais(int numEquipamentosAudiovisuais) {
        this.numEquipamentosAudiovisuais = numEquipamentosAudiovisuais;
    }

    // Métodos de função
    /**
     * Calcula a despesa com a segurança contratada para a sala.
     * @return valor a pagar pela segurança da sala
     */
    @Override
    public float calcularAudioVisual() {
        return custoAudiovisuais * numEquipamentosAudiovisuais;
    }

    /**
     * Calcula o valor a pagar/custo final do aluguer da sala.
     * @return valor a pagar pelo aluguer da sala
     */
    @Override
    public double calcularCustoFinal() {
        double custo = calcularAudioVisual() + (super.getArea()
                * espacoAuxiliar.getPrecoPorMetroQuadrado());
        if (tipoSala.equals(Tipologias.U)) {
            return custo - custo * desconto;
        }
        return custo;
    }

    /**
     * Faz uma representação textual da informação.
     * @return informação em memória
     */
    @Override
    public String toString() {
        return super.toString() +"---SALA---" +"\nValor a pagar do aluguer: " + calcularCustoFinal();

    }
    
}