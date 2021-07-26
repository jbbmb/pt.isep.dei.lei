package lapr.project.model;

import java.io.Serializable;

/**
 * @author Grupo 18_LAPR2 15-16
 */
public class Organizador implements Serializable {

    private Utilizador utilizador;

    /**
     * Contrutor vazio
     */
    public Organizador() {
    }

    public Organizador(Utilizador u) {
        this.utilizador = u;
    }

    /**
     * Altera o Utilizador do organizador
     *
     * @param u intância de Utilizador
     */
    public void setUtilizador(Utilizador u) {
        this.utilizador = u;
    }

    /**
     * Retorna o utilizador
     *
     * @return utilizador
     */
    public Utilizador getUtilizador() {
        return utilizador;
    }

    @Override
    public String toString() {
        return "Organizador:\n" + "Utilizador: " + this.utilizador.getUsername() + "\n";
    }

}
