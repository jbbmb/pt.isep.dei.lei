/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;

/**
 *
 * @author grupo18
 */
public class Atribuicao implements Serializable {

    private FAE FAE;
    private Candidatura candidatura;

    /**
     * Construtor com fae e candidatura
     *
     * @param fae instância de FAE
     * @param candidatura instância de candidatura
     */
    public Atribuicao(FAE fae, Candidatura candidatura) {
        this.FAE = fae;
        this.candidatura = candidatura;
    }

    /**
     * Retorns o FAE da atribuicao
     *
     * @return
     */
    public FAE getFAE() {
        return FAE;
    }

    /**
     * Altera FAE
     *
     * @param fae
     */
    public void setFAE(FAE fae) {
        this.FAE = fae;
    }

    /**
     * Devolve Candidatura de atribuição
     *
     * @return
     */
    public Candidatura getCandidatura() {
        return candidatura;
    }

    /**
     * Altera candidatura
     *
     * @param candidatura
     */
    public void setCANDIDATURA(Candidatura candidatura) {
        this.candidatura = candidatura;
    }

    @Override
    public String toString() {
        return this.candidatura + "----" + this.FAE;
    }

    /**
     * True se Candidatura e FAE iguais ou se têm mesma referência. false se
     * null ou se obj não for instância de Atribuicao
     *
     * @param obj
     * @return true se forem iguais
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != Atribuicao.class) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Atribuicao a = (Atribuicao) obj;
        return this.candidatura.equals(a.candidatura) && this.FAE.equals(a.FAE);
    }
}
