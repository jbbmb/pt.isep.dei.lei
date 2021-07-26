package lapr.project.controller;

import java.io.Serializable;
import java.util.List;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.ListaStands;
import lapr.project.model.RegistoExposicoes;
import lapr.project.model.Stand;

/**
 * @author Grupo 18_LAPR2 15-16
 */
public class CriarStandController implements Serializable {

    private CentroExposicoes centroExposicoes;
    private List<Exposicao> listaExposicoes;
    private ListaStands listaStands;
    private Stand s;
    private Exposicao exposicaoSelecionada;

    /**
     *
     * @param centroExposicoes
     */
    public CriarStandController(CentroExposicoes centroExposicoes) {
        this.centroExposicoes = centroExposicoes;
        this.listaStands = centroExposicoes.getListaStands();
        this.s = listaStands.novoStand();
    }

    /**
     *
     * @return
     */
    public CentroExposicoes getCentroExposicoes() {
        return centroExposicoes;
    }

    /**
     *
     * @param centroExposicoes
     */
    public void setCentroExposicoes(CentroExposicoes centroExposicoes) {
        this.centroExposicoes = centroExposicoes;
    }

    /**
     *
     * @param descricao
     * @return
     */
    public boolean setDados(String descricao) {
        boolean flag;
        s.setDescricao(descricao);
        flag = listaStands.validaStand(s);
        return flag;
    }

    /**
     * Regista o novo Stand na lista de Stands.
     */
    
    public void registarStand(){
        listaStands.registarStand(s);
    }
}
