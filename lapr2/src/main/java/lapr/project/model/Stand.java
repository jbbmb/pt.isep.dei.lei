package lapr.project.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Grupo 18_LAPR2 15-16
 */
public class Stand implements Serializable {

    private String descricao;
    private final String DESCRICAO_POR_DEFEITO = "Sem Descrição";

    /**
     *
     * @param descricao
     */
    public Stand(String descricao) {
        this.descricao = descricao;
    }

    /**
     *
     */
    public Stand() {
        this.descricao = DESCRICAO_POR_DEFEITO;
    }

    /**
     *
     * @return
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     *
     * @param descricao
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     *
     * @return
     */
    public boolean validaStand() {
        boolean flag = true;
        if (descricao == "" || descricao == DESCRICAO_POR_DEFEITO) {
            flag = false;
        }
        return flag;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != Stand.class) {
            return false;
        }
        final Stand s = (Stand) obj;
        if (!Objects.equals(this.descricao, s.descricao)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Stand:\n" + "descrição =" + descricao;
    }

}
