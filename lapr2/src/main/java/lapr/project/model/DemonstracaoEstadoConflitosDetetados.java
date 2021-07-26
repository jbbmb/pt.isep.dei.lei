package lapr.project.model;

import java.io.Serializable;

/**
 * @author Grupo 18_LAPR2 15-16
 */
public class DemonstracaoEstadoConflitosDetetados implements DemonstracaoEstado, Serializable {

    private Demonstracao demonstracao;

    public DemonstracaoEstadoConflitosDetetados(Demonstracao demonstracao) {
        this.demonstracao = demonstracao;
    }

    @Override
    public boolean valida() {
        return true;
    }

    @Override
    public boolean setCriada() {
        return false;
    }

    @Override
    public boolean setDefinitiva() {
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
        return true;
    }

    @Override
    public boolean setConflitosAlterados() {
        if (valida()) {
            demonstracao.setEstado(new DemonstracaoEstadoConflitosAlterados(demonstracao));
        }
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
