package gestaoCC;
/** @author João Borges, 1150475 - LEI @ ISEP */

public abstract class espaco {

    // Variáveis da classe
    private String identificacao;
    private String descricao;
    private double area;

    // Valores pré-definidos das variáveis
    private static final String DESCRICAO_POR_OMISSAO = "null";
    private static final String IDENTIFICACAO_POR_OMISSAO = "null";
    private static final double AREA_POR_OMISSAO = 0;

    // Construtores dos objetos
    public espaco() {
        this.identificacao = IDENTIFICACAO_POR_OMISSAO;
        this.descricao = DESCRICAO_POR_OMISSAO;
        this.area = AREA_POR_OMISSAO;
    }
    
    public espaco (espaco espaco){
        this.identificacao = espaco.getIdentificacao();
        this.descricao = espaco.getDescricao();
        this.area = espaco.getArea();
    }
    
    public espaco(String identificacao, String descricao, double area) {
        this.identificacao = identificacao;
        this.descricao = descricao;
        this.area = area;
    }

    // Métodos de consulta
    public String getIdentificacao() {
        return identificacao;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public double getArea() {
        return area;
    }
    
    // Métodos de modificação
    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    /**
     * Faz uma representação textual da informação.
     * @return informação em memória
     */
    @Override
    public String toString() {
        return "---ESPAÇO---" +"\nIdentificação do espaço: " +identificacao +"\nDescrição: " +descricao +"\nÁrea total: " +area +" m2";
    }

    // Métodos a serem posteriormente implementados
    public abstract double calcularCustoFinal();
    
}