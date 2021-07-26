package ServicoBarragens;

public abstract class Barragem {
    
    private String nome;
    private String local;
    private String linhaAgua;
    
    private static final int CUSTO_MANUTENCAO_BASE = 15040;
    private static final int CUSTO_MANUTENCAO_ENERGIA = 30800;
    private static final int CUSTO_MANUTENCAO_NAVEGACAO = 20900;
    
    
    public Barragem(String nome, String local, String linhaAgua){
        this.nome = nome;
        this.local = local;
        this.linhaAgua = linhaAgua;
    }

    public String getNome() {
        return nome;
    }

    public String getLocal() {
        return local;
    }

    public String getLinhaAgua() {
        return linhaAgua;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setLinhaAgua(String linhaAgua) {
        this.linhaAgua = linhaAgua;
    }
    
    public int calcularCustoManutencao(){
        int custoAux = 0;
        if(this instanceof Energia){
            custoAux = (CUSTO_MANUTENCAO_BASE + CUSTO_MANUTENCAO_ENERGIA);
        } else if(this instanceof EnergiaNavegacao){
            custoAux = (CUSTO_MANUTENCAO_BASE + CUSTO_MANUTENCAO_ENERGIA + CUSTO_MANUTENCAO_NAVEGACAO);
        } else if(this instanceof Navegacao){
            custoAux = (CUSTO_MANUTENCAO_BASE + CUSTO_MANUTENCAO_NAVEGACAO);
        }
        return custoAux;
    }
    
}