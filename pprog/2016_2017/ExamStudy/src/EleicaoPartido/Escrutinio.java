package EleicaoPartido;

import java.util.ArrayList;

public class Escrutinio {
    
    private final ArrayList<Candidato> candidatos;
    private int numEleitores;
    private int numVot;
    private int data;
    
    public Escrutinio(int numEleitores, int data){
        this.candidatos = new ArrayList<>();
        this.numEleitores = numEleitores;
        this.numVot = 0;
        this.data = data;
    }

    public ArrayList<Candidato> getCandidatos() {
        return candidatos;
    }

    public int getNumEleitores() {
        return numEleitores;
    }

    public int getNumVot() {
        return numVot;
    }

    public int getData() {
        return data;
    }
    
    public void setNumEleitores(int numEleitores) {
        this.numEleitores = numEleitores;
    }

    public void setNumVot(int numVot) {
        this.numVot = numVot;
    }

    public void setData(int data) {
        this.data = data;
    }
    
    public void calcularVotantes(){
        int numVotAux = 0;
        for(int i = 0; i < getCandidatos().size(); i++){
            numVotAux = (numVotAux + getCandidatos().get(i).getNumVotos());
        }
        this.setNumVot(numVotAux);
    }
    
    public void inicializarVotosCandidatos(){
        for(int i = 0; i < getCandidatos().size(); i++){
            getCandidatos().get(i).inicializarNumVotos();
        }
    }
    
    // Como se faz com vários vencedores?
    public Candidato vencedor(){
        int numMaxVotAux = 0;
        Candidato eleito = null;
        for(int i = 0; i < getCandidatos().size(); i++){
            if(getCandidatos().get(i).getNumVotos() > numMaxVotAux){
                numMaxVotAux = getCandidatos().get(i).getNumVotos();
                eleito = getCandidatos().get(i);
            }
        }
        if(eleito == null){
            System.out.println("Não há vencedor/empate.");
            return null;
        } else {
            System.out.println("Vencedor da eleição: " + eleito.getNome());
            return eleito;
        }
    }
    
}