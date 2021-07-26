/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;
import java.util.TimerTask;
import lapr.project.controller.DetetarConflitosController;

/**
 *
 * @author Grupo 18_LAPR2 15-16
 */
public class ExposicaoEstadoInicial implements ExposicaoEstado, Serializable {

    private Exposicao exposicao;

    public ExposicaoEstadoInicial(Exposicao exposicao) {
        this.exposicao = exposicao;
    }

    @Override
    public boolean valida() {
        return true;
    }

    @Override
    public boolean setCriada() {
        if (valida()) {
            TimerTask alterarParaCandidaturaAberta
                    = new AlterarParaCandidaturasAbertas(exposicao);
            exposicao.schedule(alterarParaCandidaturaAberta,
                    exposicao.getDataSubmissaoInicio());
            TimerTask alterarParaCandidaturaFechada
                    = new AlterarParaCandidaturasFechadas(exposicao);
            exposicao.schedule(alterarParaCandidaturaFechada,
                    exposicao.getDataSubmissaoFim());
            TimerTask detetarConflitosController
                    = new DetetarConflitosController(exposicao.getCentroExposicoes(), exposicao);
            exposicao.schedule(detetarConflitosController,
                    exposicao.getDataSubmissaoFim());
            TimerTask alterarPraConflitosAlterados
                    = new AlterarParaConflitosAlterados(exposicao);
            exposicao.setEstadoExp(new ExposicaoEstadoCriada(exposicao));
            return true;
        }
        return false;
    }

    @Override
    public boolean setComFAESemDemonstracao() {
        return false;
    }

    @Override
    public boolean setComDemonstracoesSemFAE() {
        return false;
    }

    @Override
    public boolean setCompleta() {
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
