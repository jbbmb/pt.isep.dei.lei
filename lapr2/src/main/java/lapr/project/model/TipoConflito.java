package lapr.project.model;

import java.io.Serializable;

/**
 * @author Grupo 18_LAPR2 15-16
 */
public class TipoConflito implements Serializable {

    private String descricao;
    private MecanismoDetecaoConflito mecanismoDetecaoConflito;

    public TipoConflito(String descricao) {
        this.descricao = descricao;
    }

    public TipoConflito(){
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public MecanismoDetecaoConflito getMecanismoDetecaoConflito() {
        return mecanismoDetecaoConflito;
    }

    public boolean valida() {
        if (descricao == null) {
            return false;
        }
        return true;
    }

    public void setMecanismoDetecaoConflito(MecanismoDetecaoConflito mecanismoDetecaoConflito) {
        this.mecanismoDetecaoConflito = mecanismoDetecaoConflito;
    }

}
