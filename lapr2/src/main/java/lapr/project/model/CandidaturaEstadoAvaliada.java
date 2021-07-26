/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;

/**
 *
 * @author Grupo 18
 */
public class CandidaturaEstadoAvaliada implements CandidaturaEstado, Serializable {

    Candidatura candidatura;

    public CandidaturaEstadoAvaliada(Candidatura candidatura) {
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
        if (valida()) {
            candidatura.setEstado(new CandidaturaEstadoDecidida(candidatura));
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean setAvaliada() {
        return true;
    }
}
