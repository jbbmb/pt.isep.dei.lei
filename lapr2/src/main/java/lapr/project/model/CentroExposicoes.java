package lapr.project.model;

import java.io.Serializable;

/**
 *
 * @author Grupo 18_LAPR2 15-16
 */
public class CentroExposicoes implements Serializable{

    private RegistoExposicoes re;
    private RegistoUtilizadores ru;
    private RegistoGestorExposicoes rGestores;
    private ListaTiposConflito listaTiposConf;
    private ListaRecursos listaRecursos;
    private ListaStands listaStands;

    public CentroExposicoes() {
        re = new RegistoExposicoes();
        ru = new RegistoUtilizadores();
        rGestores = new RegistoGestorExposicoes();
        listaRecursos = new ListaRecursos();
        listaTiposConf = new ListaTiposConflito();
        listaStands = new ListaStands();
    }

    public RegistoExposicoes getRegistoExposicoes() {
        return re;
    }

    public RegistoUtilizadores getRegistoUtilizador() {
        return ru;

    }

    public ListaTiposConflito getListaTiposConflito() {
        return listaTiposConf;
    }

    public ListaRecursos getListaRecursos() {
        return listaRecursos;
    }

    public void setListaRecursos(ListaRecursos listaRecursos) {
        this.listaRecursos = listaRecursos;
    }

    public RegistoGestorExposicoes getRegistoGestores() {
        return rGestores;
    }

    public void setRegistoGestores(RegistoGestorExposicoes rGestores) {
        this.rGestores = rGestores;
    }

    public ListaStands getListaStands() {
        return listaStands;
    }

    public void setListaStands(ListaStands listaStands) {
        this.listaStands = listaStands;
    }
    
}