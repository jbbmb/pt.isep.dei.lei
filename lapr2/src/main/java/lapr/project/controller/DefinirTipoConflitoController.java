package lapr.project.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.TipoConflito;
import lapr.project.model.ListaTiposConflito;

/**
 * @author Grupo 18_LAPR2 15-16
 */
public class DefinirTipoConflitoController implements Serializable {

    private final CentroExposicoes centroExposicoes;
    private ListaTiposConflito listaTiposConf;

    public DefinirTipoConflitoController(CentroExposicoes ce) {
        this.centroExposicoes = ce;
    }

    public List<TipoConflito> getListaTiposConflito() {
        listaTiposConf = centroExposicoes.getListaTiposConflito();
        return new ArrayList<>(listaTiposConf.getListaTipoConf());
    }

    public boolean novoTipoConflito(String descricao) {
        TipoConflito conf = listaTiposConf.novoTipoConflito(descricao);
        if (conf.valida()) {
            return true;
        } else {
            return false;
        }
    }

    public void registaTipoConflito(TipoConflito conflito) {
        listaTiposConf.registaTipoConflito(conflito);
    }
}
