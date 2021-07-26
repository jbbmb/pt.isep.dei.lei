package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Grupo 18_LAPR2 15-16
 */
public class ListaAtribuicoesStands implements Serializable {

    private List<AtribuicaoStand> listaAtribuicoesStands;

    public ListaAtribuicoesStands(List<AtribuicaoStand> listaAtribuicoesStands) {
        this.listaAtribuicoesStands = listaAtribuicoesStands;
    }

    public ListaAtribuicoesStands() {
        listaAtribuicoesStands = new ArrayList<AtribuicaoStand>();
    }

    public List<AtribuicaoStand> getListaAtribuicoesStands() {
        return listaAtribuicoesStands;
    }

    public void setListaAtribuicoesStands(List<AtribuicaoStand> listaAtribuicoesStands) {
        this.listaAtribuicoesStands = listaAtribuicoesStands;
    }

    public AtribuicaoStand novaAtribuicaoStand() {
        return new AtribuicaoStand();
    }

    public boolean validaAtribuicaoStand(AtribuicaoStand as) {
        boolean flag;
        if (as.validaAtribuicaoStand() && valida(as)) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

    public boolean valida(AtribuicaoStand as) {
        boolean flag = true;
        for (int i = 0; i < listaAtribuicoesStands.size(); i++) {
            if (as.equals(listaAtribuicoesStands.get(i))) {
                flag = false;
                i = listaAtribuicoesStands.size();
            }
        }
        return flag;
    }

    public void registarAtribuicaoStand(AtribuicaoStand as) {
        addAtribuicaoStand(as);
    }

    public void addAtribuicaoStand(AtribuicaoStand as) {
        listaAtribuicoesStands.add(as);
    }

    public AtribuicaoStand getAtribuicao(Candidatura c) {
        for (int i = 0; i < listaAtribuicoesStands.size(); i++) {
            if (listaAtribuicoesStands.get(i).getCandidatura().equals(c)) {
                return listaAtribuicoesStands.get(i);
            }
        }
        return null;
    }

}
