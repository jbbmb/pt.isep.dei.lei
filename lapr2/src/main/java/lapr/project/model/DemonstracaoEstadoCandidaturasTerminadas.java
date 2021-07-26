package lapr.project.model;

import java.io.Serializable;

/**
 * @author Grupo 18_LAPR2 15-16
 */
public class DemonstracaoEstadoCandidaturasTerminadas implements DemonstracaoEstado, Serializable {

    private Demonstracao demonstracao;

    public DemonstracaoEstadoCandidaturasTerminadas(Demonstracao demonstracao) {
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
        return true;
    }

    @Override
    public boolean setConflitosDetetados() {
        if (valida()) {
            demonstracao.setEstado(new DemonstracaoEstadoConflitosDetetados(demonstracao));
        }
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
