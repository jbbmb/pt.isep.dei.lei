package gestaoCC;
/** @author João Borges, 1150475 - LEI @ ISEP */

public abstract class espacoPrincipal extends espaco implements Seguranca {
    
    // Variáveis da classe
    private static float precoPorMetroQuadrado = 6;
    
    // Métodos de consulta
    public static float getPrecoPorMetroQuadrado() {
        return precoPorMetroQuadrado;
    }

    // Métodos de modificação
    public static void setPrecoPorMetroQuadrado(float precoPorMetroQuadrado) {
        espacoPrincipal.precoPorMetroQuadrado = precoPorMetroQuadrado;
    }
    
    // Construtores de objetos
    public espacoPrincipal(){
        super();
    }
    
    public espacoPrincipal(espacoPrincipal espaco){
        super(espaco);
    }
    
    public espacoPrincipal (String identificacao, String descricao, double area){
        super(identificacao, descricao, area);
    }

}