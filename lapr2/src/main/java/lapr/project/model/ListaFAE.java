/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author grupo18
 */
public class ListaFAE implements Serializable {

    private final ArrayList<FAE> listaFAE;

    /**
     * Construtor vazio
     */
    public ListaFAE() {
        this.listaFAE = new ArrayList<>();
    }

    /**
     * Devolve a lista de FAEs
     *
     * @return lista FAE
     */
    public ArrayList<FAE> getListaFAE() {
        return listaFAE;
    }

    /**
     * cria um novo FAE
     *
     * @param u
     * @return
     */
    public FAE novoFAE(Utilizador u) {
        FAE fae = new FAE(u);
        fae.setUtilizador(u);
        fae.valida();
        return fae;
    }

    /**
     * verifica se o FAE é um utilizador
     *
     * @param username
     * @return
     */
    public boolean verificaFAE(String username) {
        for (FAE fae : listaFAE) {
            if ((fae.getUtilizador().getUsername()).equals(username)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Valida o FAE
     *
     * @param fae
     * @return
     */
    private boolean validaFAE(FAE fae) {
        for (FAE fae1 : listaFAE) {
            if (fae1.equals(fae)) {
                return false;
            }
        }
        return true;
    }

    /**
     * regista fae na lista
     *
     * @param fae
     * @return
     */
    public boolean addFAE(FAE fae) {
        if (validaFAE(fae)) {
            listaFAE.add(fae);
            return true;
        }
        return false;
    }

}
