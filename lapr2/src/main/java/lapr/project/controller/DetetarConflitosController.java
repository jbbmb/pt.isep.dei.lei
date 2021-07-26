/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.ListaTiposConflito;
import lapr.project.model.MecanismoDetecaoConflito;
import lapr.project.model.TipoConflito;

/**
 *
 * @author Grupo 18_LAPR2 15-16
 */
public class DetetarConflitosController extends TimerTask implements Serializable {

    private final CentroExposicoes centroExposicoes;

    private ListaTiposConflito listaTipoConflito;
    //private List<TipoConflito> tiposConflitoList;
    private TipoConflito tipo;
    private List<MecanismoDetecaoConflito> listaMecanismos;
    private  Exposicao expo;

    public DetetarConflitosController(CentroExposicoes centroExposicoes, Exposicao expo) {
        this.centroExposicoes = centroExposicoes;
        this.expo = expo;
    }

    public ListaTiposConflito getListaTiposConflito() {
        return listaTipoConflito = centroExposicoes.getListaTiposConflito();
    }


    public List<MecanismoDetecaoConflito> getMecanismosDetecaoConflito() {
        listaMecanismos = new ArrayList <MecanismoDetecaoConflito>();
        for (int i = 0; i < listaTipoConflito.getListaTipoConf().size(); i++) {
            tipo = listaTipoConflito.getListaTipoConf().get(i);
            listaMecanismos.add(tipo.getMecanismoDetecaoConflito());
            tipo.getMecanismoDetecaoConflito().setExposicao(expo);
        }
        return listaMecanismos;
    }

    public void detetarConflitos() {
        for (int i = 0; i < getMecanismosDetecaoConflito().size(); i++) {
            getMecanismosDetecaoConflito().get(i).detetarConflitos();
        }
    }

    @Override
    public void run() {
        getListaTiposConflito();
        getMecanismosDetecaoConflito();
        detetarConflitos();
    }

}
