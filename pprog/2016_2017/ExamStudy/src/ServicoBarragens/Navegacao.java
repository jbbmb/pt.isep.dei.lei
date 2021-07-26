package ServicoBarragens;

public class Navegacao extends Barragem implements Navegavel {
    
    private Eclusa eclusaPrincipal;
    
    public Navegacao(String nome, String local, String linhaAgua, int comprimento, int largura) {
        super(nome, local, linhaAgua);
        this.eclusaPrincipal = new Eclusa(comprimento, largura);
    }
    
    public Eclusa getEclusaPrincipal() {
        return eclusaPrincipal;
    }
    
    public void setEclusaPrincipal(Eclusa eclusaPrincipal) {
        this.eclusaPrincipal = eclusaPrincipal;
    }
    
}