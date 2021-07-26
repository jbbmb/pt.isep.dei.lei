package gestaoCC;
/** @author João Borges, 1150475 - LEI @ ISEP */

public class hall extends espacoAuxiliar implements Seguranca {
    
    // Variáveis da classe
    private int numStands;
    private static float custoVariavel = 2;
    private static float custoFixo = 4;
    
    // Valores pré-definidos
    private static final int NUM_STANDS_POR_OMISSAO = 0;
    
    // Construtores de objetos
    public hall() {
        this.numStands = NUM_STANDS_POR_OMISSAO;
    }

    public hall(hall hall) {
        super(hall);
        this.numStands = hall.getNumStands();
    }
    
    public hall(String identificacao, String descricao, double area, int numStands) {
        super(identificacao, descricao, area);
        this.numStands = numStands;
    }

    // Métodos de consulta
    public int getNumStands() {
        return numStands;
    }

    public static float getCustoVariavel() {
        return custoVariavel;
    }
    
    public static float getCustoFixo() {
        return custoFixo;
    }
    
    // Métodos de modificação
    public void setNumStands(int numStands) {
        this.numStands = numStands;
    }

    public static void setCustoVariavel(float custoVariavel) {
        hall.custoVariavel = custoVariavel;
    }

    public static void setCustoFixo(float custoFixo) {
        hall.custoFixo = custoFixo;
    }

    // Métodos de função
    /**
     * Calcula a despesa com a segurança contratada para o hall.
     * @return valor a pagar pela segurança do hall
     */
    @Override
    public float calcularSeguranca() {
        return custoFixo + custoVariavel * numStands;
    }

    /**
     * Calcula o valor a pagar/custo final do aluguer do hall.
     * @return o valor do aluguer do hall
     */
    @Override
    public double calcularCustoFinal() {
        return calcularSeguranca() + (super.getArea() * espacoAuxiliar.getPrecoPorMetroQuadrado());
    }

    /**
     * Faz uma representação textual da informação.
     * @return informação em memória
     */
    @Override
    public String toString() {
        return super.toString() +"\n---HALL---" +"\nNúmero de stands: " +numStands +"\nValor a pagar do aluguer: " +calcularCustoFinal() +"€";
    }

}