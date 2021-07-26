package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Grupo 18_LAPR2 15-16
 */
public class ListaCandidaturas implements Serializable {

    private ArrayList<Candidatura> listaCandidaturas;
    private ArrayList<Candidatura> listaCandidaturasRemovidas;

    /**
     * Contrutor que recebe 2 parâmetros do tipo ArrayList que contém variaveis
     * do tipo Candidatura, uma com as candidaturas removidas e outra com as
     * candidaturas.
     *
     * @param listaCandidaturas variavel que contem a lista das candidaturas de
     * uma exposição
     * @param listaCandidaturasRemovidas variavel que contem a lista de
     * candidaturas removidas de uma exposição
     */
    public ListaCandidaturas(ArrayList<Candidatura> listaCandidaturas, ArrayList<Candidatura> listaCandidaturasRemovidas) {
        this.listaCandidaturas = listaCandidaturas;
        this.listaCandidaturasRemovidas = listaCandidaturasRemovidas;
    }

    /**
     * Contrutor que recebe 1 parâmetro do tipo ArrayList que contém variaveis
     * do tipo Candidatura, com as candidaturas de uma exposição.
     *
     * @param listaCandidaturas variavel que contem a lista das candidaturas de
     * uma exposição
     */
    public ListaCandidaturas(ArrayList<Candidatura> listaCandidaturas) {
        this.listaCandidaturas = listaCandidaturas;
        this.listaCandidaturasRemovidas = new ArrayList();
    }

    /**
     * Contrutor que não recebe nenhum parâmetro e que serve para inicializar 2
     * variaveis
     */
    public ListaCandidaturas() {
        this.listaCandidaturas = new ArrayList<>();
        this.listaCandidaturasRemovidas = new ArrayList();
    }

    /**
     * Metodo que serve para obter a lista de candidaturas
     *
     * @return a lista de candidaturas
     */
    public ArrayList<Candidatura> getListaCandidaturas() {
        return listaCandidaturas;
    }

    /**
     * Metodo que serve para alterar a lista de candidaturas
     *
     * @param listaCandidaturas variavel do tipo array list que contem variaveis
     * do tipo Candidatura e que irá substituir a anterior lista de candidaturas
     */
    public void setListaCandidaturas(ArrayList<Candidatura> listaCandidaturas) {
        this.listaCandidaturas = listaCandidaturas;
    }

    public ArrayList<Candidatura> getListaCandidaturasRemovidas() {
        return listaCandidaturasRemovidas;
    }

    public void setListaCandidaturasRemovidas(ArrayList<Candidatura> listaCandidaturasRemovidas) {
        this.listaCandidaturasRemovidas = listaCandidaturasRemovidas;
    }
    

    /**
     * Metodo que serve para criar uma nova Candidatura à Demonstração
     *
     * @return uma varaiavel do tipo Candidatura
     */
    public Candidatura novaCandidaturaDemonstracao() {
        return new CandidaturaDemonstracao();
    }

    /**
     * Cria uma nova instância de candidatura
     *
     * @return uma Candidatura
     */
    public Candidatura novaCandidaturaExposicao() {
        return new CandidaturaExposicao();
    }

    /**
     * Valida uma candidatura
     *
     * @param cand instância de candidatura que vai ser validada, isto é, se ela
     * já existe
     * @return true se não existir, false se já existir
     */
    public boolean validaCandidaturaDemonstracao(CandidaturaDemonstracao cand) {
        for (Candidatura candidatura : listaCandidaturas) {
            if (candidatura.equals(cand)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Valida uma candidatura
     *
     * @param cand instância de candidatura que vai ser validada, isto é, se ela
     * já existe
     * @return true se não existir, false se já existir
     */
    public boolean validaCandidaturaExposicao(CandidaturaExposicao cand) {
        for (Candidatura candidatura : listaCandidaturas) {
            if (candidatura.equals(cand) && cand.getIdRepresentante().equals(candidatura.getIdRepresentante())) {
                return false;
            }
        }
        return true;
    }

    /**
     * Adiciona uma candidatura à lista de candidaturas da exposição
     *
     * @param cand
     */
    public void addCandidaturaExposicao(CandidaturaExposicao cand) {
        if (this.validaCandidaturaExposicao(cand)) {
            listaCandidaturas.add(cand);
        }
    }

    /**
     * Adiciona uma candidatura à lista de candidaturas da exposição
     *
     * @param cand
     */
    public void addCandidaturaDemonstracao(CandidaturaDemonstracao cand) {
        if (this.validaCandidaturaDemonstracao(cand)) {
            listaCandidaturas.add(cand);
        }
    }

    /**
     * Metodo que serve para validar e adicionar uma candidatura à demonstração
     *
     * @param candidatura variavel do tipo CandidaturaDemonstração
     */
    public boolean validaAdicionaCandDemonstracao(CandidaturaDemonstracao candidatura) {
        boolean registo = candidatura.regista();
        this.addCandidaturaDemonstracao(candidatura);
        return registo;
    }

    /**
     * Metodo que serve para remover e guardar as candidaturas removidas numa
     * lista própria
     *
     * @param cand variavel que contem a candidatura que irá ser removida e
     * guardada num novo array lis
     */
    public void removerCandidatura(Candidatura cand) {
        if (listaCandidaturas.contains(cand)) {
            listaCandidaturasRemovidas.add(cand);
            listaCandidaturas.remove(cand);
        }
    }

    /**
     * Metodo que serv para alterar uma candidatura
     *
     * @param candOriginal variavel do tipo candidatura que contem a candidatura
     * que irá ser alterada
     * @param candAlterada variavel do tipo candidatura que contem a nova
     * candidatura com os dados alterados
     */
    public void alterarCandidatura(Candidatura candOriginal, Candidatura candAlterada) {
        int posicao = listaCandidaturas.indexOf(candOriginal);
        listaCandidaturas.add(posicao, candAlterada);
    }

    /**
     * Metodo que serve para obter as candidaturas que ainda nao foram avaliadas
     *
     * @return uma lista de candidaturas, sendo que estas ainda não foram
     * avaliadas
     */
    public ArrayList<Candidatura> getCandidaturasNaoAvaliadas() {
        ArrayList<Candidatura> listaCandidaturasNaoAvaliadas = new ArrayList<>();
        for (int i = 0; i < listaCandidaturas.size(); i++) {
            if (listaCandidaturas.get(i).getListaAvaliacoes().getListaAvaliacoes().isEmpty()) {
                listaCandidaturasNaoAvaliadas.add(listaCandidaturas.get(i));
            }
        }
        return listaCandidaturasNaoAvaliadas;
    }

    /**
     * Metodo que serve para obter a candidatura que o representante criou
     *
     * @param id variavel do tipo strig que contem a identificacao do
     * representante
     * @return uma variavel do tipo candidatura , sendo esta a candidatura do
     * representante
     */
    public Candidatura getCandidaturaRepresentante(String id) {
        Candidatura cand = null;
        for (Candidatura c : listaCandidaturas) {
            if (c.getIdRepresentante().equals(id)) {
                cand = c;
            }
        }
        return cand;
    }

    /**
     * Metodo que serve para passar a lista de Candidaturas para uma string
     *
     * @return uma lista de string's que contem a lista de candidaturas
     */
    public String[] ListaCandidaturasToString() {
        String[] listString = new String[listaCandidaturas.size()];
        for (int i = 0; i < listaCandidaturas.size(); i++) {
            listString[i] = listaCandidaturas.get(i).getIdRepresentante();

        }
        return listString;
    }

    /**
     * Metodo que serve para passar a lista de Candidaturas Removidas para uma
     * string
     *
     * @return uma lista de string's que contem a lista de candidaturas
     * removidas
     */
    public String[] ListaCandidaturasRemovidasToString() {
        String[] listString = new String[listaCandidaturasRemovidas.size()];
        for (int i = 0; i < listaCandidaturasRemovidas.size(); i++) {
            listString[i] = listaCandidaturasRemovidas.get(i).getIdRepresentante();

        }
        return listString;
    }

}
