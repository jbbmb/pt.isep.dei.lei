package SOGE.Controllers;
/** @author Débora Costa (1150433), João Borges (1150475) e Luís Gouveia (1150437) @ LEI-ISEP */

import SOGE.FAE;
import SOGE.Atribuicao;
import SOGE.Avaliacao;
import SOGE.Candidatura;
import SOGE.CentroExposicoes;
import SOGE.Exposicao;
import SOGE.RegistoExposicoes;
import SOGE.Utilizador;
import java.util.List;

public class AvaliarCandidaturaController {
    /**
     * Centro de exposições que contém as candidaturas das quais se vai proceder à avaliação.
     */
    private CentroExposicoes centroExposicoes;
    
    /**
     * Exposicao que vai ser selecionada para depois apresentar as candidaturas apenas daquela exposição.
     */
    private Exposicao exposicao;
    
    /**
     * Lista de exposicoes de um dado FAE.
     */
    private List<Exposicao> listaExposicoes;
    
    /**
     * FAE que irá avaliar as candidaturas.
     */
    private FAE fae;
    
    /**
     * Candidatura a ser avaliada.
     */
    private Candidatura candidatura;
    
    /**
     * A atribuição da candidatura ao FAE.
     */
    private Atribuicao atribuicao;
    
    /**
     * Avaliação da candidatura.
     */
    private Avaliacao avaliacao;
    
    /**
     * Cria instâncias da classe AvaliarCandidaturaController recebendo como parâmetro
     * o centro de exposições.
     * @param centroExposicoes o centro de exposicoes que contém a informação
     * necessaria para proceder à avaliação da candidatura.
     */
    public AvaliarCandidaturaController(CentroExposicoes centroExposicoes){
        this.centroExposicoes = centroExposicoes;
    }
    
    /**
     * Devolve uma lista com as Exposições de um Determinado FAE
     * @param u Utilizador FAE
     * @return a lista de Exposições
     */
    public List<Exposicao> getListaExposicoesDoFAE(Utilizador u){
        return listaExposicoes = centroExposicoes.getRegistoExposicoes().getListaExposicoesDoFAE(exposicao.getRegistoFAEs(), u);
    }
    
    /**
     * Seleciona uma exposição de determinado FAE
     * @param e a exposição selecionada
     * @param u O FAE a quem a exposição está associada
     */
    public void selecionaExposicao( Exposicao e, Utilizador u){
        this.exposicao = e;
        fae = e.getFAE(u);
    }
    
    /**
     * Devolve uma lista com as Candidaturas atribuidas ao FAE em questão que estão por avaliar
     * @return a lista das candidaturas poor avaliar
     */
    public List<Atribuicao> getListaAtribuicoesPorAvaliar(){
        return exposicao.getListaAtribuicoesPorAvaliar(fae);
    }
    
    /**
     * Devolve a informação sobre a Candidatura por Avaliar
     * @param a Atribuição que contém a candidatura em questão
     * @return a informação sobre a candidatura
     */
    public String getInformacaoDaCandidaturaPorAvaliar(Atribuicao a){
        this.atribuicao = a;
        this.candidatura = a.getCandidatura();
        return a.getCandidatura().toString();
    }
    
    /**
     * Define uma Avaliação de uma candidatura
     * @param dec a decisão de se é rejeitada ou aceite
     * @param txt texto justificativo
     */
    public void setAvaliacao( String dec, String txt){
        avaliacao = candidatura.novaAvaliacao();
        avaliacao.setDecisao(dec);
        avaliacao.setJustificacao(txt);
        avaliacao.setAtribuicao(atribuicao);
    }
    
    /**
     * Regista a avaliação de uma candidatura
     * @return se o registo foi feito com sucesso ou não
     */
    public boolean registaAvaliacao(){
        
        if(candidatura.validaAvaliacao(avaliacao)){
            candidatura.registaAvaliacao(avaliacao);
            exposicao.getRegistoAtribuicoes().removerAtribuicao(atribuicao);
            return true;
        }else{
            return false;
        }
    }

}