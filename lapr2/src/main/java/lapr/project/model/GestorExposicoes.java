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
public class GestorExposicoes implements Serializable {

    private Utilizador utilizador;

    /**
     * Construtor com utilizador
     *
     * @param utilizador intância de utilizador
     */
    public GestorExposicoes(Utilizador utilizador) {
        this.utilizador = utilizador;
    }

    /**
     * Construtor vazio
     */
    public GestorExposicoes() {

    }

    /**
     * Devolve o utilizador
     *
     * @return
     */
    public Utilizador getUtilizador() {
        return utilizador;
    }

    /**
     * Altera o utilizador
     *
     * @param utilizador
     */
    public void setUtilizador(Utilizador UTILIZADOR) {
        this.utilizador = UTILIZADOR;
    }

    @Override
    public String toString() {
        return "Gestor Exposições:" + utilizador;
    }

    public boolean valida() {
        return true;
    }
}
