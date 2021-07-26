package EleicaoPartido;

import java.util.ArrayList;

public class SimulaEleicao {
    
    private final ArrayList<Voto> votos = new ArrayList();

    public ArrayList<Voto> getVotos() {
        return votos;
    }
    
    public void contarVotos(){
        System.out.println("--- CONTAGEM DE VOTOS ---");
        for (Voto voto : getVotos()) {
            System.out.println(voto.toString());
            if(voto.eValido() == true){
                voto.getCandidato().incrementarVotos();
            }
        }
        System.out.println("--- FIM ---");
    }
    
}