package lapr.project.model;

import java.io.Serializable;
import java.util.TimerTask;

/** @author Grupo 18_LAPR2 15-16 */

public class AlterarParaCandidaturasFechadas extends TimerTask implements Serializable{
    
    private Exposicao expo;
    private Demonstracao dem;

    public AlterarParaCandidaturasFechadas(Exposicao exposicao) {
        this.expo = exposicao;
    }
    
    public AlterarParaCandidaturasFechadas (Demonstracao demonstracao){
        this.dem = demonstracao;
    }
    
    @Override
    public void run() {
        if(expo!= null){
            expo.setCandidaturasFechadas();
        } else{
            dem.setCandidaturasTerminadas();
        }
    }
    
    
    
}
