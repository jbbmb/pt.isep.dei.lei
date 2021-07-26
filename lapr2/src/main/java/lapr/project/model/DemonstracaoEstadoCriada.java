package lapr.project.model;

import java.io.Serializable;
import java.util.TimerTask;

/** @author Grupo 18_LAPR2 15-16 */

public class DemonstracaoEstadoCriada implements DemonstracaoEstado, Serializable{
    Demonstracao demonstracao;

    public DemonstracaoEstadoCriada(Demonstracao demonstracao) {
        this.demonstracao = demonstracao;
    } 
    
    @Override
    public boolean setCriada() {
        return true;
    }

    @Override
    public boolean valida() {
        return true;
    }

    @Override
    public boolean setDefinitiva() {
        if(valida()){
            TimerTask alterarParaCandidaturaAberta = 
                    new AlterarParaCandidaturasAbertas(demonstracao);
            demonstracao.schedule(alterarParaCandidaturaAberta, 
                    demonstracao.getDataInicio());
            TimerTask alterarParaCandidaturaFechada = 
                    new AlterarParaCandidaturasFechadas(demonstracao);
            demonstracao.schedule(alterarParaCandidaturaAberta, 
                    demonstracao.getDataFim());
            demonstracao.setEstado(new DemonstracaoEstadoDefinitiva(demonstracao));
            return true;
        }
        return false;
    }

    @Override
    public boolean setCandidaturasAbertas() {
        return false;
    }

    @Override
    public boolean setCandidaturasTerminadas() {
       return false;
    }

    @Override
    public boolean setConflitosDetetados() {
       return false; 
    }

    @Override
    public boolean setConflitosAlterados() {
        return false;
    }

    @Override
    public boolean setCandidaturasAtribuidas() {
        return false;
    }

    @Override
    public boolean setCandidaturasAvaliadas() {
        return false;
    }

    @Override
    public boolean setCandidaturasDecididas() {
        return false;
    }
    
}