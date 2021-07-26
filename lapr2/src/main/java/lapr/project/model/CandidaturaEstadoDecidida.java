package lapr.project.model;

import java.io.Serializable;

/** @author Grupo 18_LAPR2 15-16 */

public class CandidaturaEstadoDecidida implements CandidaturaEstado, Serializable  {

    Candidatura candidatura;

    public CandidaturaEstadoDecidida(Candidatura candidatura) {
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
        return false;
    }

    @Override
    public boolean setDecidida() {
        return true;
    }

    @Override
    public boolean setAvaliada() {
        return false;
    }

}