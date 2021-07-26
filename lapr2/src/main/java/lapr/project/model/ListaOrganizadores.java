package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Grupo 18_LAPR2 15-16
 */
public class ListaOrganizadores implements Serializable {

    /**
     * Lista de organizadores
     */
    List<Organizador> listaOrganizadores;

    /**
     * Cria instâncias da classe ListaOrganizadores
     *
     * @param lo
     */
    public ListaOrganizadores(List<Organizador> lo) {
        this.listaOrganizadores = lo;
    }

    public ListaOrganizadores() {
        listaOrganizadores = new ArrayList<Organizador>();
    }

    public List<Organizador> getListaOrganizadores() {
        return listaOrganizadores;
    }

    public void setListaOrganizadores(List<Organizador> listaOrganizadores) {
        this.listaOrganizadores = listaOrganizadores;
    }

    public Organizador getOrganizador(String id) {

        int posicao = 0;
        while (listaOrganizadores.get(posicao).getUtilizador().getUsername().equals(id) == false
                && posicao < listaOrganizadores.size()) {
            posicao++;
        }
        return listaOrganizadores.get(posicao);
    }

    /**
     * Verifica se o organizador é utilizador e se faz parte da exposição.
     *
     * @param email username do organizador
     * @return true se encontrar, false se não encontrar
     */
    public boolean verificaOrganizador(String id) {
        for (Organizador org : listaOrganizadores) {
            if (org.getUtilizador().getUsername().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public void addOrganizador(Utilizador utilizador) {
        Organizador org = new Organizador();
        org.setUtilizador(utilizador);
        if (validaOrganizador(org)) {
            listaOrganizadores.add(org);
        }
    }

    private boolean validaOrganizador(Organizador org) {
        for (Organizador organizador : listaOrganizadores) {
            if (organizador.equals(org)) {
                return false;
            }
        }
        return true;
    }
}
