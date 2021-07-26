package lapr.project.model;

import java.io.Serializable;

/**
 * @author Grupo 18_LAPR2 15-16
 */
public class FAE implements Serializable {

    private Utilizador utilizador;

    /**
     * Construtor com utilizador
     *
     * @param utilizador intância de utilizador
     */
    public FAE(Utilizador utilizador) {
        this.utilizador = utilizador;
    }

    /**
     * Construtor vazio
     */
    public FAE() {

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
        return "FAE:" + utilizador;
    }

    public boolean valida() {
        return true;
    }

}
