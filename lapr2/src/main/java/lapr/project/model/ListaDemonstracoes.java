package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Grupo 18_LAPR2 15-16
 */
public class ListaDemonstracoes implements Serializable {

    private ArrayList<Demonstracao> listaDemonstracoes;
    private Demonstracao demonstracao;
    private ListaRecursos listaRecursos;

    /**
     * Construtor vazio
     */
    public ListaDemonstracoes() {
        this.listaDemonstracoes = new ArrayList<>();
    }

    /**
     * Devolve a lista de demonstrações
     *
     * @return
     */
    public ArrayList<Demonstracao> getListaDemonstracoes() {
        return listaDemonstracoes;
    }

    /**
     * Cria uma nova demonstração
     *
     * @return
     */
    public Demonstracao novaDemonstracao() {
        demonstracao = new Demonstracao();
        listaRecursos = new ListaRecursos();
        demonstracao.setEstado(new DemonstracaoEstadoInicial(demonstracao));
        return demonstracao;
    }

    /**
     * Adiciona uma nova demonstração à lista de demonstrações
     *
     * @param demonstracao intância de Demonstracao
     * @return
     */
    public boolean addDemonstracao(Demonstracao demonstracao) {
        return listaDemonstracoes.add(demonstracao);
    }

    /**
     * Valida a demonstração vendo se não existe uma em duplicado
     *
     * @param demonstracao instância de Demonstracao
     * @return return false se existir em duplicao, true se não existir
     */
    public boolean valida(Demonstracao demonstracao) {
        for (Demonstracao demonstracao1 : listaDemonstracoes) {
            if (demonstracao1.equals(demonstracao)) {
                return false;
            }
        }
        return true;
    }


    public void registaDemonstracaoAceite(Demonstracao demonstracao) {
        demonstracao.setEstado(new DemonstracaoEstadoDefinitiva(demonstracao));
    }

    /**
     *
     * @param demonstracao
     * @return true se a demonstraçãoo for registada
     */
    public boolean registaDemonstracao(Demonstracao demonstracao) {
        if (demonstracao.validaDemonstracao() && valida(demonstracao)) {
            addDemonstracao(demonstracao);
//            demonstracao.getEstado().setCriada();
            return true;
        }
        return false;
    }

    public String[] listaDemonstracoesToString() {
        String[] lista = new String[listaDemonstracoes.size()];
        for (int i = 0; i < listaDemonstracoes.size(); i++) {
            lista[i] = listaDemonstracoes.get(i).getDescricao();
        }
        return lista;
    }

}
