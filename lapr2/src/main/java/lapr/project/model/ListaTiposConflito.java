package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Grupo 18_LAPR2 15-16
 */
public class ListaTiposConflito implements Serializable {

    private List<TipoConflito> listaTipoConf;
    private Exposicao exposicao;

    public ListaTiposConflito(ArrayList<TipoConflito> listaTipoConf) {
        this.listaTipoConf = listaTipoConf;

    }

    public ListaTiposConflito() {
        this.listaTipoConf = new ArrayList<>();
        TipoConflito tc = new TipoConflito("FAE ser Representante");
        tc.setMecanismoDetecaoConflito(new MecanismoDetecaoConflito());
        listaTipoConf.add(tc);
    }

    public List<TipoConflito> getListaTipoConf() {
        return listaTipoConf;
    }

    public void setListaConf(List<TipoConflito> listaTipoConf) {
        this.listaTipoConf = listaTipoConf;
    }

    public TipoConflito novoTipoConflito(String descricao) {
        return new TipoConflito(descricao);
    }

    public void registaTipoConflito(TipoConflito tipoConflito) {
        if (validaTipoConflito(tipoConflito)) {
            addTipoConflito(tipoConflito);
        }
    }

    private boolean validaTipoConflito(TipoConflito tipoConflito) {
        for (TipoConflito tipoConflito1 : listaTipoConf) {
            if (tipoConflito1.equals(tipoConflito)) {
                return false;
            }
        }
        return true;
    }

    private boolean addTipoConflito(TipoConflito tipoConflito) {
        return listaTipoConf.add(tipoConflito);
    }

}
