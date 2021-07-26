package EleicaoPartido;

public class VotoPapel extends Voto {
    
    private boolean assinado;
    
    public VotoPapel(Candidato candidato, int data, int dataLim, boolean assinado) {
        super(candidato, data, dataLim);
        this.assinado = assinado;
    }

    public boolean eAssinado() {
        return assinado;
    }

    public void setAssinado(boolean assinado) {
        this.assinado = assinado;
    }
    
    @Override
    public boolean eValido() {
        return this.eAssinado();
    }
    
    @Override
    public String toString(){
        return String.format("Voto em papel para%s", super.toString());
    }
    
}