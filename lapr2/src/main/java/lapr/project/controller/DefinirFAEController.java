package lapr.project.controller;

import java.io.Serializable;
import java.util.List;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.FAE;
import lapr.project.model.ListaFAE;
import lapr.project.model.RegistoExposicoes;
import lapr.project.model.RegistoUtilizadores;
import lapr.project.model.Utilizador;

/**
 * @author Grupo 18_LAPR2 15-16
 */
public class DefinirFAEController implements Serializable {

    private final CentroExposicoes centroExposicoes;
    private RegistoExposicoes re;
    private RegistoUtilizadores ru;
    private FAE fae;
    private Exposicao exposicao;

    public DefinirFAEController(CentroExposicoes centroExposicoes) {
        this.centroExposicoes = centroExposicoes;
    }

    public List<Exposicao> getListaExposicoesOrganizador(String email) {
        re = centroExposicoes.getRegistoExposicoes();
        return re.getListaExposicoesOrganizador(email);
    }

    public RegistoUtilizadores getListaUtilizadores() {
        ru = centroExposicoes.getRegistoUtilizador();
        return ru;
    }

    public FAE addFAE(Utilizador u, Exposicao e) {
        fae = e.getListaFAE().novoFAE(u);
        this.exposicao = e;
        return fae;
    }

    public FAE getFae() {
        return fae;
    }

    public ListaFAE getListaFAE(Exposicao exposicao) {
        return exposicao.getListaFAE();
    }

    public void registaFAE(FAE fae) {
        exposicao.getListaFAE().addFAE(fae);
        exposicao.getEstadoExp();
        exposicao.setFAEDefinidos();
    }

    public void setExposicao(Exposicao exposicao) {
        this.exposicao = exposicao;
    }

}
