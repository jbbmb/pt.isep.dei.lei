package ServicoBarragens;

public class Energia extends Barragem {
    
    private int potenciaTotalInstalada;
    private int energiaPorAno;
    
    private static final String TIPO_DE_CENTRAL = "Pé de barragem com bombagem";
    
    public Energia(String nome, String local, String linhaAgua, int potenciaTotalInstalada, int energiaPorAno) {
        super(nome, local, linhaAgua);
        this.potenciaTotalInstalada = potenciaTotalInstalada;
        this.energiaPorAno = energiaPorAno;
    }

    public static String getTIPO_DE_CENTRAL() {
        return TIPO_DE_CENTRAL;
    }
    
}