package EleicaoPartido;

public class VotoEletronico extends Voto implements ValidaVotos {
    
    public VotoEletronico(Candidato candidato, int data, int dataLim) {
        super(candidato, data, dataLim);
    }

    @Override
    public boolean eValido(){
        return this.verificaData();
    }
    
    @Override
    public boolean verificaData() {
        return (this.getData() < (this.getDataLim()-2));
    }
    
    @Override
    public String toString(){
        return String.format("Voto eletrónico para%s", super.toString());
    }
    
}