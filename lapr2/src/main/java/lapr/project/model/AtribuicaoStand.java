package lapr.project.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Grupo 18_LAPR2 15-16
 */
public class AtribuicaoStand implements Serializable {

    private Candidatura candidatura;
    private Stand stand;

    public AtribuicaoStand(Candidatura candidatura, Stand stand) {
        this.candidatura = candidatura;
        this.stand = stand;
    }

    public AtribuicaoStand() {
        this.candidatura = null;
        this.stand = null;
    }

    public Candidatura getCandidatura() {
        return candidatura;
    }

    public Stand getStand() {
        return stand;
    }

    public void setCandidatura(Candidatura candidatura) {
        this.candidatura = candidatura;
    }

    public void setStand(Stand stand) {
        this.stand = stand;
    }

    public boolean validaAtribuicaoStand() {
        boolean flag;
        if (candidatura != null && stand != null) {
            flag = true;
        } else {
            flag = false;
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
        final AtribuicaoStand other = (AtribuicaoStand) obj;
        if (!Objects.equals(this.candidatura, other.candidatura)) {
            return false;
        }
        if (!Objects.equals(this.stand, other.stand)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Atribuicao de Stand a Candidatura:\n" + "Candidatura ="
                + candidatura + ", Stand =" + stand;
    }

}
