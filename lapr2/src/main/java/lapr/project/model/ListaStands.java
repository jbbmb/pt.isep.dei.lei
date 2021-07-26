package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Grupo 18_LAPR2 15-16
 */
public class ListaStands implements Serializable {

    private List<Stand> m_listaStands;

    /**
     *
     * @param m_listaStands
     */
    public ListaStands(List<Stand> m_listaStands) {
        this.m_listaStands = m_listaStands;
    }

    /**
     *
     */
    public ListaStands() {
        m_listaStands = new ArrayList<Stand>();
    }

    /**
     *
     * @return
     */
    public List<Stand> getListaStands() {
        return m_listaStands;
    }

    /**
     *
     * @param m_listaStands
     */
    public void setListaStands(List<Stand> m_listaStands) {
        this.m_listaStands = m_listaStands;
    }

    /**
     * Cria um novo Stand.
     *
     * @return o Stand criado.
     */
    public Stand novoStand() {
        return new Stand();
    }

    /**
     * guarda o novo stand na lista de Stands.
     *
     * @param s o novo stand.
     */
    public void registarStand(Stand s) {
        addStand(s);
    }

    /**
     * adiciona um stand à lista de Stands existente.
     *
     * @param s o stand a adicionar
     */
    public void addStand(Stand s) {
        m_listaStands.add(s);
    }

    /**
     * Valida um stand tanto localmente como globalmente.
     *
     * @param s o stand a validar.
     * @return o resultado da validação.
     */
    public boolean validaStand(Stand s) {
        return (valida(s) && s.validaStand());
    }
    /**
     * valida globalmente um Stand, no que toca a duplicados.
     *
     * @param s o Stand a validar.
     * @return o resultado da validação.
     */
    public boolean valida(Stand s) {
        boolean flag = true;
        for (int i = 0; i < m_listaStands.size(); i++) {
            if (m_listaStands.get(i).equals(s)) {
                i = m_listaStands.size();
                flag = false;
            }
        }
        return flag;
    }

    public String[] listaToString() {
        String[] vec = new String[m_listaStands.size()];
        for (int i = 0; i < m_listaStands.size(); i++) {
            vec[i] = m_listaStands.get(i).getDescricao();
        }
        return vec;
    }

}
