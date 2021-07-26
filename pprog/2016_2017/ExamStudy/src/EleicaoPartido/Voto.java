package EleicaoPartido;

public abstract class Voto {
    
    private Candidato candidato;
    private int data;
    private int dataLim;
    
    public Voto(Candidato candidato, int data, int dataLim){
        this.candidato = candidato;
        this.data = data;
        this.dataLim = dataLim;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public int getData() {
        return data;
    }

    public int getDataLim() {
        return dataLim;
    }
    
    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setDataLim(int dataLim) {
        this.dataLim = dataLim;
    }
    
    public abstract boolean eValido();
    
    @Override
    public String toString(){
        if(this.eValido() == true){
            return String.format(" <%s> -> válido", getCandidato().getNome());
        } else return String.format(" <%s> -> inválido", getCandidato().getNome());
    }
    
}