package EleicaoPartido;

public class VotoCorreio extends Voto implements ValidaVotos {
    
    private boolean assinado;
    
    public VotoCorreio(Candidato candidato, int data, int dataLim, boolean assinado) {
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
        return (this.verificaData() && this.eAssinado());
    }

    @Override
    public boolean verificaData() {
        return (this.getData() < this.getDataLim());
    }
    
    @Override
    public String toString(){
        return String.format("Envio de voto em papel para%s", super.toString());
    }
    
}