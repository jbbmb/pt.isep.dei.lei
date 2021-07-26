package SOGE;
/** @author Débora Costa (1150433), João Borges (1150475) e Luís Gouveia (1150437) @ LEI-ISEP
 * O Mecanismo 3 atribui as candidaturas aos FAEs de forma aleatória.
 */

import java.util.List;

public class Mecanismo3 implements MecanismoAtribuicao {

    private Exposicao exposicao;

    public List<Atribuicao> definirAssociacoes() {
        List<Candidatura> listaCandidaturas = exposicao.getRegistoCandidaturas().getListaCandidaturas();
        List<FAE> listaFAE = exposicao.getRegistoFAEs().getListaFAEs();
        List<Atribuicao> listaAtribuicoes = exposicao.getRegistoAtribuicoes().getListaAtribuicoes();
        int contador = 0;//para percorrer a listaFAE, desta forma não são repetidos elementos
        //sem que tenha primeiro percorrido toda a lista

        for (int i = 0; i < listaCandidaturas.size(); i++) {
            Candidatura c = listaCandidaturas.get(i);
            if (contador == listaFAE.size()) {
                contador = 0;
            }
            FAE fae = listaFAE.get(contador);
            Atribuicao a = new Atribuicao(c, fae);
            listaAtribuicoes.add(a);
            contador++;
        }
        return listaAtribuicoes;
    }

    @Override
    public List<Atribuicao> getListaAtribuicoes(Exposicao e) {
        return definirAssociacoes();
    }

}