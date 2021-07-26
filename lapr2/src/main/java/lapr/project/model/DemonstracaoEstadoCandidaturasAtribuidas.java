package lapr.project.model;

import java.io.Serializable;

/**
 * @author Grupo 18_LAPR2 15-16
 */
class DemonstracaoEstadoCandidaturasAtribuidas implements DemonstracaoEstado, Serializable {

    private Demonstracao demonstracao;

    public DemonstracaoEstadoCandidaturasAtribuidas(Demonstracao demonstracao) {
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
        return false;
    }

    @Override
    public boolean setConflitosAlterados() {
        return false;
    }

    @Override
    public boolean setCandidaturasAtribuidas() {
        return true;
    }

    @Override
    public boolean setCandidaturasAvaliadas() {
        if (valida()) {
            demonstracao.setEstado(new DemonstracaoEstadoCandidaturasAvaliadas(demonstracao));
        }
        return false;
    }

    @Override
    public boolean setCandidaturasDecididas() {
        return false;
    }

}
