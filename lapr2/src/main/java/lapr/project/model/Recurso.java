package lapr.project.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Grupo 18_LAPR2 15-16
 */
public class Recurso implements Serializable {

    private String recurso;

    private static final String RECURSO_POR_OMISSAO = "Recurso não definido";

    public Recurso(String recurso) {
        this.recurso = recurso;
    }

    public Recurso() {
        recurso = RECURSO_POR_OMISSAO;
    }

    public String getRecurso() {
        return recurso;
    }

    public void setRecurso(String recurso) {
        this.recurso = recurso;
    }
       
    public boolean validaRecurso() {
        boolean flag = true;
        if(recurso.equalsIgnoreCase(RECURSO_POR_OMISSAO) || recurso.equals("")){
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
        final Recurso other = (Recurso) obj;
        if (!this.recurso.equals(other.recurso)) {
            return false;
        }
        return true;
    }
    
    

}
