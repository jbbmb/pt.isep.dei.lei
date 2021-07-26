package lapr.project.model;

import java.io.Serializable;

/**
 * @author Grupo 18_LAPR2 15-16
 */
public class CandidaturaEstadoCriada implements CandidaturaEstado, Serializable {

    Candidatura candidatura;

    public CandidaturaEstadoCriada(Candidatura candidatura) {
        this.candidatura = candidatura;
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
    public boolean setAtribuida() {
        if (valida()) {
            candidatura.setEstado(new CandidaturaEstadoAtribuida(candidatura));
            return true;
        }
        return false;
    }

    @Override
    public boolean setDecidida() {
        return false;
    }

    @Override
    public boolean setAvaliada() {
        return false;
    }

}
