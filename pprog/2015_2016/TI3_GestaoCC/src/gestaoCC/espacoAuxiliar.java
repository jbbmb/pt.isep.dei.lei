package gestaoCC;
/** @author João Borges, 1150475 - LEI @ ISEP */

public abstract class espacoAuxiliar extends espaco {
    
    // Variáveis da classe
    private static float precoPorMetroQuadrado = 2;
    
    // Métodos de consulta
    public static float getPrecoPorMetroQuadrado() {
        return precoPorMetroQuadrado;
    }

    // Métodos de modificação
    public static void setPrecoPorMetroQuadrado(float precoPorMetroQuadrado) {
        espacoAuxiliar.precoPorMetroQuadrado = precoPorMetroQuadrado;
    }
    
    // Construtores de objetos
    public espacoAuxiliar(){
        super();
    }
    
    public espacoAuxiliar(espacoAuxiliar espaco){
        super(espaco);
    }
    
    public espacoAuxiliar (String identificacao, String descricao, double area){
        super(identificacao, descricao, area);
    }
    
}