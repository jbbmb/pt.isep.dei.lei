package EleicaoPartido;

public class Candidato {
    
    private String nome;
    private int numVotos;
    
    public Candidato(String nome){
        this.nome = nome;
        this.numVotos = 0 ;
    }
    
    public String getNome() {
        return nome;
    }

    public int getNumVotos() {
        return numVotos;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumVotos(int numVotos) {
        this.numVotos = numVotos;
    }
    
    public void incrementarVotos(){
        this.setNumVotos(getNumVotos()+1);
    }
    
    public void inicializarNumVotos(){
        this.setNumVotos(0);
    }
    
}