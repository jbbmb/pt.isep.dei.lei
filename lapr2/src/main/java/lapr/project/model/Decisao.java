package lapr.project.model;

import java.io.Serializable;

/**
 * @author Grupo 18_LAPR2 15-16
 */
public class Decisao implements Serializable {

    private String decisao;
    private static final String DECISAO_POR_OMISSAO = "Sem decisão";

    public Decisao(String decisao) {
        this.decisao = decisao;
    }

    public Decisao() {
        decisao = DECISAO_POR_OMISSAO;
    }

    public String getDecisao() {
        return decisao;
    }

    public void setDecisao(String decisao) {
        this.decisao = decisao;
    }

    public boolean validaDecisao() {
        if (!decisao.equals(DECISAO_POR_OMISSAO)) {
            return true;
        }
        return false;
    }

}
