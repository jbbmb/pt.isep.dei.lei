package SOGE;
/** @author Débora Costa (1150433), João Borges (1150475) e Luís Gouveia (1150437) @ LEI-ISEP
 * O Mecanismo 1 atribui os FAE às candidaturas de acordo com o número de FAE pretendido
 * para cada candidatura.
 */

import java.util.ArrayList;
import java.util.List;

public class Mecanismo1 implements MecanismoAtribuicao{
    
    /**
     * Número de FAEs atribuídos a cada candidatura
     */
    private int numFAEPorCandidatura;
    
    /**
     * Número de FAEs atribuidos a cada candidatura
     */
    private static final int NUM_FAE_POR_CANDIDATURA_POR_OMISSAO = 1;
    
    /**
     * Exposição sobre o qual vão ser feitas atribuições
     */
    private Exposicao exposicao;

    /**
     * Cria intâncias de Mecanismo1
     * @param numFAEPorCandidatura 
     */
    public Mecanismo1(int numFAEPorCandidatura, Exposicao e){
        this.numFAEPorCandidatura = numFAEPorCandidatura;
        this.exposicao = e;
    }
    
    /**
     * Cria instâncias de Mecanismo1 com os valores por omissão
     */
    public Mecanismo1(Exposicao e){
        numFAEPorCandidatura = NUM_FAE_POR_CANDIDATURA_POR_OMISSAO;
        this.exposicao = e;
    }
    
    public List<Atribuicao> definirAssociacoes(){
        List<Candidatura> listaCandidaturas = exposicao.getRegistoCandidaturas().getListaCandidaturas();
        List<FAE> listaFAE = exposicao.getRegistoFAEs().getListaFAEs();
        List<Atribuicao> listaAtribuicoes = exposicao.getRegistoAtribuicoes().getListaAtribuicoes();
        
        int contador = 0;//para percorrer a listaFAE, desta forma não são repetidos elementos
        //sem que tenha primeiro percorrido toda a lista
        
        for (int i = 0; i < listaCandidaturas.size(); i++) {
            Candidatura c = listaCandidaturas.get(i);
            for(int j = 0; j < numFAEPorCandidatura; j++){
                if(contador>=listaFAE.size()){
                    contador = 0;
                }
                FAE fae = listaFAE.get(contador);
                Atribuicao a = new Atribuicao(c, fae);
                listaAtribuicoes.add(a);
                contador++;
                
            }
        }
        return listaAtribuicoes;
    }
    
    @Override
    public List<Atribuicao> getListaAtribuicoes(Exposicao e) {
        return definirAssociacoes();
    }
    
}