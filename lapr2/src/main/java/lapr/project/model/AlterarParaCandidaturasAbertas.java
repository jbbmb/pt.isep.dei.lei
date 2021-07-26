/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;
import java.util.TimerTask;

/**
 *
 * @author grupo18
 */
public class AlterarParaCandidaturasAbertas extends TimerTask implements Serializable {

    private  Exposicao expo;
    private Demonstracao dem;

    public AlterarParaCandidaturasAbertas(Exposicao expo) {
        this.expo = expo;
    }

    AlterarParaCandidaturasAbertas(Demonstracao demonstracao) {
        this.dem = demonstracao;
    }

    @Override
    public void run() {
        if(expo != null){
            expo.setCandidaturasAbertas();
        } else{
            dem.setCandidaturasAbertas();
        }
    }

}
