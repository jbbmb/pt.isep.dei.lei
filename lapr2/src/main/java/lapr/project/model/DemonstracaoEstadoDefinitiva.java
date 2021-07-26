package lapr.project.model;

import java.io.Serializable;

/**
 * @author Grupo 18_LAPR2 15-16
 */
public class DemonstracaoEstadoDefinitiva implements DemonstracaoEstado, Serializable {

    Demonstracao demonstracao;

    public DemonstracaoEstadoDefinitiva(Demonstracao demonstracao) {
        this.demonstracao = demonstracao;
    }

    @Override
    public boolean setCriada() {
        return false;
    }

    @Override
    public boolean valida() {
        return true;
    }

    @Override
    public boolean setDefinitiva() {
        return true;
    }

    @Override
    public boolean setCandidaturasAbertas() {
        if (valida()) {

        }
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
