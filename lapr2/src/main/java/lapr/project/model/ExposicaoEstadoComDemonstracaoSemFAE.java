/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;

/**
 *
 * @author Grupo 18_LAPR2 15-16
 */
public class ExposicaoEstadoComDemonstracaoSemFAE implements ExposicaoEstado, Serializable {

    private Exposicao exposicao;

    public ExposicaoEstadoComDemonstracaoSemFAE(Exposicao exposicao) {
        this.exposicao = exposicao;
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
    public boolean setComFAESemDemonstracao() {
        return false;
    }

    @Override
    public boolean setComDemonstracoesSemFAE() {
        return true;
    }

    @Override
    public boolean setCompleta() {
        if (valida()) {
            exposicao.setEstadoExp(new ExposicaoEstadoCompleta(exposicao));
            return true;
        }
        return false;
    }

    @Override
    public boolean setCandidaturasExposicaoAbertas() {
        return false;
    }

    @Override
    public boolean setCandidaturasExposicaoFechadas() {
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
