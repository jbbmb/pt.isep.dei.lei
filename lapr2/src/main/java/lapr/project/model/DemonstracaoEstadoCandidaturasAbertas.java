package lapr.project.model;

import java.io.Serializable;

/**
 * @author Grupo 18_LAPR2 15-16
 */
public class DemonstracaoEstadoCandidaturasAbertas implements DemonstracaoEstado, Serializable {

    Demonstracao demonstracao;

    public DemonstracaoEstadoCandidaturasAbertas(Demonstracao demonstracao) {
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
        return false;
    }

    @Override
    public boolean setCandidaturasAbertas() {
        return true;
    }

    @Override
    public boolean setCandidaturasTerminadas() {
        if (valida()) {
            demonstracao.setEstado(new DemonstracaoEstadoCandidaturasTerminadas(demonstracao));
        }
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
