package lapr.project.model;

import java.io.Serializable;

/**
 * @author Grupo 18_LAPR2 15-16
 */
public class CandidaturaEstadoInicial implements CandidaturaEstado, Serializable {

    Candidatura candidatura;

    public CandidaturaEstadoInicial(Candidatura candidatura) {
        this.candidatura = candidatura;
    }

    @Override
    public boolean setCriada() {
        if (valida()) {
            candidatura.setEstado(new CandidaturaEstadoCriada(candidatura));
            return true;
        }
        return false;
    }

    @Override
    public boolean valida() {
        return true;
    }

    @Override
    public boolean setAtribuida() {
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
