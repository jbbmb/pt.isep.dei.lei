package gestaoCC;
/** @author João Borges, 1150475 - LEI @ ISEP */

public class pavilhao extends espacoPrincipal implements Seguranca {

    // Variáveis da classe
    private int numEntradasSaidas;
    private static int numPavilhao = 0;
    private static float custoEntradaSaida = 2;
    
    // Valores pré-definidos
    private static final int NUM_ENTRADAS_SAIDAS_POR_OMISSAO = 0;

    // Construtores de objetos
    public pavilhao() {
        super();
        this.numEntradasSaidas = NUM_ENTRADAS_SAIDAS_POR_OMISSAO;
        numPavilhao++;
    }
    
    public pavilhao(pavilhao pavilhao){
        super(pavilhao);
        this.numEntradasSaidas = pavilhao.getNumEntradasSaidas();
        numPavilhao++;
    }
    
    public pavilhao(String identificacao, String descricao, double area, int numEntradasSaidas) {
        super(identificacao, descricao, area);
        this.numEntradasSaidas = numEntradasSaidas;
        numPavilhao++;
    }

    // Métodos de consulta
    public int getNumEntradasSaidas() {
        return numEntradasSaidas;
    }
    
    public static float getCustoEntradaSaida() {
        return custoEntradaSaida;
    }
    
    public static int getNumPavilhao() {
        return numPavilhao;
    }

    // Métodos de modificação
    public void setNumEntradasSaidas(int numEntradasSaidas) {
        this.numEntradasSaidas = numEntradasSaidas;
    }

    public static void setCustoEntradaSaida(float custoEntradaSaida) {
        pavilhao.custoEntradaSaida = custoEntradaSaida;
    }

    // Métodos de função
    /**
     * Calcula a despesa com a segurança contratada para o pavilhão.
     * @return valor a pagar pela segurança do pavilhão
     */
    @Override
    public float calcularSeguranca() {
        return custoEntradaSaida * numEntradasSaidas;
    }

    /**
     * Calcula o valor a pagar/custo final do aluguer do pavilhão.
     * @return o valor do aluguer do pavilhão
     */
    @Override
    public double calcularCustoFinal() {
        return calcularSeguranca() + (super.getArea() * espacoPrincipal.getPrecoPorMetroQuadrado());
    }

    /**
     * Faz uma representação textual da informação.
     * @return informação em memória
     */
    @Override
    public String toString() {
        return super.toString() +"---PAVILHÃO---" +"\nNúmero de entradas/saídas: " +numEntradasSaidas +"\nValor a pagar do aluguer: " + calcularCustoFinal();

    }

}