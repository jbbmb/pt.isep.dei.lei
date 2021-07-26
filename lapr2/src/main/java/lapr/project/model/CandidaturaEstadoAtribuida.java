package lapr.project.model;

import java.io.Serializable;

/**
 * @author Grupo 18_LAPR2 15-16
 */
public class CandidaturaEstadoAtribuida implements CandidaturaEstado, Serializable {

    Candidatura candidatura;

    public CandidaturaEstadoAtribuida(Candidatura candidatura) {
        this.candidatura = candidatura;
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
    public boolean setAtribuida() {
        return true;
    }

    @Override
    public boolean setDecidida() {
        return false;
    }

    @Override
    public boolean setAvaliada() {
        if (valida()) {
            candidatura.setEstado(new CandidaturaEstadoAvaliada(candidatura));
            return true;
        } else {
            return false;
        }
    }

}
