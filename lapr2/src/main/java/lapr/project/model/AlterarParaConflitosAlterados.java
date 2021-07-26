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
public class AlterarParaConflitosAlterados extends TimerTask implements Serializable{

    private Exposicao exposicao;
    
    public AlterarParaConflitosAlterados(Exposicao exposicao) {
        this.exposicao = exposicao;
    }

    @Override
    public void run() {
        exposicao.setConflitosAlterados();
    }
    
}
