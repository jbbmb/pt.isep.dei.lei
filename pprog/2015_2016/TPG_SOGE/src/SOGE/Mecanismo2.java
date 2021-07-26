package SOGE;
/** @author Débora Costa (1150433), João Borges (1150475) e Luís Gouveia (1150437) @ LEI-ISEP
 * O Mecanismo 2 atribui as candidaturas aos FAE de forma equitativa. Todos têm igual
 * número de candidaturas.
 */

import java.util.ArrayList;
import java.util.List;

public class Mecanismo2 implements MecanismoAtribuicao {

    /**
     * Exposição sobre o qual vão ser feitas atribuições
     */
    private Exposicao exposicao;

    /**
     * Cria instâncias de Mecanismo1 com os valores por omissão
     */
    public Mecanismo2(Exposicao e) {
        this.exposicao = e;

    }

    public List<Atribuicao> definirAssociacoes() {
        List<Candidatura> listaCandidaturas = exposicao.getRegistoCandidaturas().getListaCandidaturas();
        List<FAE> listaFAE = exposicao.getRegistoFAEs().getListaFAEs();
        List<Atribuicao> listaAtribuicoes = exposicao.getRegistoAtribuicoes().getListaAtribuicoes();

        int numCandidaturasPorFAE = calcularNumeroCandidaturasPorFAE(listaCandidaturas.size(), listaFAE.size());
        int contador = 0;//para percorrer a listaCandidaturas, desta forma não são repetidos elementos
        //sem que tenha primeiro percorrido toda a lista

        for (int i = 0; i < listaFAE.size(); i++) {
            FAE fae = listaFAE.get(i);
            for (int j = 0; j < numCandidaturasPorFAE; j++) {
                if (contador >= listaCandidaturas.size()) {
                    contador = 0;
                }
                Candidatura c = listaCandidaturas.get(contador);
                Atribuicao a = new Atribuicao(c, fae);
                listaAtribuicoes.add(a);
                contador++;

            }
        }
        return listaAtribuicoes;

    }

    public int calcularNumeroCandidaturasPorFAE(int numCandidaturas, int numFAE) {
        int numCandidaturasPorFAE = Math.round(numCandidaturas / numFAE);
        return numCandidaturasPorFAE;
    }

    @Override
    public List<Atribuicao> getListaAtribuicoes(Exposicao e) {
        return definirAssociacoes();
    }

}