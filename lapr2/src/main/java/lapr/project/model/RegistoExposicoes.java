package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Grupo 18_LAPR2 15-16
 */
public class RegistoExposicoes implements Serializable {

    private List<Exposicao> listaExposicoes;
    private Exposicao expo;
    private ListaOrganizadores listaOrganizadores;

    public RegistoExposicoes() {
        this.listaExposicoes = new ArrayList<>();
    }

    public List<Exposicao> getListaExposicoes() {
        return listaExposicoes;
    }

    public void setListaExposicoes(List<Exposicao> listaExposicoes) {
        this.listaExposicoes = listaExposicoes;
    }

    /**
     * Devolve a lista de um dado organizador.
     *
     * @param id
     * @return Lista de exposições de organizadores
     */
    public List<Exposicao> getListaExposicoesOrganizador(String id) {
        ArrayList<Exposicao> listaExpOrganizador = new ArrayList<>();
        for (Exposicao exposicao : listaExposicoes) {
            if (exposicao.getListaOrganizadores().verificaOrganizador(id)) {
                listaExpOrganizador.add(exposicao);
            }
        }
        return listaExpOrganizador;
    }

    public List<Exposicao> getListaExposicoesFAE(String id) {
        ArrayList<Exposicao> listaExpFAE = new ArrayList<>();
        for (int i = 0; i < listaExposicoes.size(); i++) {
            Exposicao exposicao = listaExposicoes.get(i);
            if (exposicao.getListaFAE().verificaFAE(id)) {
                listaExpFAE.add(exposicao);
            }
        }
        return listaExpFAE;
    }

    public Exposicao novaExposicao() {
        expo = new Exposicao();
        listaOrganizadores = new ListaOrganizadores();
        expo.setEstadoExp(new ExposicaoEstadoInicial(expo));
        return expo;
    }

    public String[] registoExposicoesToString() {
        String[] lista = new String[listaExposicoes.size()];
        for (int i = 0; i < listaExposicoes.size(); i++) {
            lista[i] = listaExposicoes.get(i).getTitulo();
        }
        return lista;
    }

    public void registaExposicao(Exposicao e) {
        if (validaExposicao(e)) {
            e.setCriada();
            listaExposicoes.add(e);
        }
    }

    public boolean validaExposicao(Exposicao expo) {
        for (Exposicao exposicao : listaExposicoes) {
            if (exposicao.equals(expo)) {
                return false;
            }
        }
        return true;
    }

    public int obterIndexExposicao(Exposicao expo) {
        for (int i = 0; i < getListaExposicoes().size(); i++) {
            if (getListaExposicoes().get(i).equals(expo)) {
                return i;
            }
        }
        return 0;
    }

}
