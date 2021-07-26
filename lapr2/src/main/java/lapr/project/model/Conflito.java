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
public class Conflito implements Serializable {

    private FAE fae;
    private Candidatura candidatura;
    private TipoConflito tipoConflito;
    
    public Conflito(FAE fae, Candidatura candidatura) {
        this.fae = fae;
        this.candidatura = candidatura;
    }
    
    public Conflito(){
        
    }

    /**
     * Construtor cópia
     *
     * @param conflitoSelecionado
     */
    public Conflito(Conflito conflitoSelecionado) {
        this.fae = conflitoSelecionado.getFae();
        this.candidatura = conflitoSelecionado.getCandidatura();
        this.tipoConflito = conflitoSelecionado.getTipoConflito();
    }

    public FAE getFae() {
        return fae;
    }

    public void setFae(FAE fae) {
        this.fae = fae;
    }

    public Candidatura getCandidatura() {
        return candidatura;
    }

    public void setCandidatura(Candidatura candidatura) {
        this.candidatura = candidatura;
    }

    public TipoConflito getTipoConflito() {
        return tipoConflito;
    }

    public void setTipoConflito(TipoConflito tipoConflito) {
        this.tipoConflito = tipoConflito;
    }

    public String getDadosConflito() {
        return "FAE: " + fae + "\nCandidatura: " + candidatura
                + "\nTipo de Conflito:" + tipoConflito;
    }

    public void setDadosAlterados(FAE fae, Candidatura candidatura,
            TipoConflito tipoConflito) {
        if (validaAlteracaoFAE(fae)) {
            setFae(fae);
        }
        if (validaAlteracaoCandidatura(candidatura)) {
            setCandidatura(candidatura);
        }
        if (validaAlteracaoTipoConflito(tipoConflito)) {
            setTipoConflito(tipoConflito);
        }
    }

    public boolean validaAlteracaoFAE(FAE fae) {
        if (fae != null) {
            return true;
        }
        return false;
    }

    public boolean validaAlteracaoCandidatura(Candidatura candidatura) {
        if (candidatura != null) {
            return true;
        }
        return false;
    }

    public boolean validaAlteracaoTipoConflito(TipoConflito tipoConflito) {
        if (tipoConflito != null) {
            return true;
        }
        return false;
    }

    public boolean validaAlteracao(FAE fae, Candidatura candidatura,
            TipoConflito tipoConflito) {
        boolean flag = false;
        if (validaAlteracaoFAE(fae) && validaAlteracaoCandidatura(candidatura)
                && validaAlteracaoTipoConflito(tipoConflito)) {
            setFae(fae);
            setCandidatura(candidatura);
            setTipoConflito(tipoConflito);
            flag = true;

        }
        return flag;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Conflito other = (Conflito) obj;
        if (!this.fae.equals(other.fae)) {
            return false;
        }
        if (!this.candidatura.equals(other.candidatura)) {
            return false;
        }
        if (!this.tipoConflito.equals(other.tipoConflito)) {
            return false;
        }
        return true;
    }

}
