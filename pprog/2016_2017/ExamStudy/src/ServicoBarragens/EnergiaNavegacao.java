package ServicoBarragens;

public class EnergiaNavegacao extends Barragem implements Navegavel {
    
    private static final String TIPO_DE_CENTRAL = "Contígua à barragem";
    
    public EnergiaNavegacao(String nome, String local, String linhaAgua) {
        super(nome, local, linhaAgua);
    }

    public static String getTIPO_DE_CENTRAL() {
        return TIPO_DE_CENTRAL;
    }
    
}