package lapr.project.model;

import java.io.Serializable;

/** @author Grupo 18_LAPR2 15-16 */

public class Representante implements Serializable{
     private Utilizador utilizador;

    /**
     * Contrutor vazio
     */
    public Representante(Utilizador u) {
        utilizador = u;
    }

    /**
     * Altera o Utilizador do representante
     *
     * @param u intância de Utilizador
     */
    public void setRepresentante(Utilizador u) {
        this.utilizador = u;
    }

    /**
     * Retorna o utilizador
     *
     * @return utilizador
     */
    public Utilizador getRepresentante() {
        return utilizador;
    }

    @Override
    public String toString() {
        return "Representante:\n" + "Utilizador: " + this.utilizador.getUsername() + "\n";
    }

    // ainda falta termina lo
    boolean obterCandidatura(Candidatura candidatura) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}