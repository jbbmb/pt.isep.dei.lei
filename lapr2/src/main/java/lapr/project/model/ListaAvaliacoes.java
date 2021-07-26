package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Grupo 18_LAPR2 15-16
 */
public class ListaAvaliacoes implements Serializable {

    private List<Avaliacao> listaAvaliacoes;

    public ListaAvaliacoes(List<Avaliacao> listaAvaliacoes) {
        this.listaAvaliacoes = listaAvaliacoes;
    }

    public ListaAvaliacoes() {
        listaAvaliacoes = new ArrayList<>();
    }

    public List<Avaliacao> getListaAvaliacoes() {
        return listaAvaliacoes;
    }

    public void setListaAvaliacoes(List<Avaliacao> listaAvaliacoes) {
        this.listaAvaliacoes = listaAvaliacoes;
    }

    public Avaliacao novaAvaliacao(String idFAE) {
        return new Avaliacao(idFAE);
    }

    public void registaAvaliacao(Avaliacao av) {
        addAvaliacao(av);
    }

    public void addAvaliacao(Avaliacao av) {
        listaAvaliacoes.add(av);
    }

}
