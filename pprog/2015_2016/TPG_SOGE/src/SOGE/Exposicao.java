package SOGE;
/** @author Débora Costa (1150433), João Borges (1150475) e Luís Gouveia (1150437) @ LEI-ISEP */

import java.util.ArrayList;
import java.util.List;

public class Exposicao {

    /**
     * Lista de Candidaturas da Exposição.
     */
    private ListaCandidaturas listaCandidaturas;

    /**
     * Lista de Atribuições de Candidaturas a FAE.
     */
    private ListaAtribuicoes listaAtribuicoes;
    
    /**
     * Lista de Demonstraões da Exposição.
     */
    private List<Demonstracao> listaDemonstracoes;
    
    /**
     * Lista de FAEs da exposição.
     */
    private ListaFAEs listaFAE;
    
    /**
     * Lista de Organizadores da exposição.
     */
    private ListaOrganizadores listaOrganizadores;

    /**
     * Nome da exposição.
     */
    private String nome;

    /**
     * Descrição da exposição.
     */
    private String descricao;
    
    /**
     * Data de início da exposição.
     */
    private String dataInicio;
    
    /**
     * Data de fim da exposição.
     */
    private String dataFim;

    /**
     * Construtor com parâmetros completo que cira instâncias do tipo Exposição.
     * @param nome o nome da exposição.
     * @param descricao a descrição da exposição.
     * @param dataInicio a data de início da exposição.
     * @param dataFim a data de fim da exposição.
     */
    public Exposicao(String nome, String descricao, String dataInicio, String dataFim) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    /**
     * Devolve o nome da exposição
     *
     * @return nome da exposição
     */
    public String getNome() {
        return nome;
    }

    /**
     * Altera o nome da exposição
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Devolve a descrição da exposição
     *
     * @return descrição da exposição
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Modifica a descrição da exposição
     *
     * @param descricao
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Retorna a data de início da exposição
     *
     * @return data de início da exposição
     */
    public String getDataInicio() {
        return dataInicio;
    }

    /**
     * Altera a data de início da exposição
     *
     * @param dataInicio
     */
    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * Retorna a data de fim da exposição
     *
     * @return data de fim da exposição
     */
    public String getDataFim() {
        return dataFim;
    }

    /**
     * Modifica a data de fim da exposição
     *
     * @param dataFim
     */
    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    /**
     * Devolve a lista de candidaturas da exposição.
     *
     * @return a lista de candidaturas
     */
    public ListaCandidaturas getRegistoCandidaturas() {
        return listaCandidaturas;

    }

    /**
     * Devolve a lista de FAEs da exposição.
     *
     * @return a lista de FAEs
     */
    public ListaFAEs getRegistoFAEs() {
        return listaFAE;
    }

    /**
     * Devolve a lista de Atribuições de Candidaturas a FAEs.
     *
     * @return a lista de atribuicoes
     */
    public ListaAtribuicoes getRegistoAtribuicoes() {
        return listaAtribuicoes;
    }

    /**
     * Devolve a lista de Organizadores da exposição.
     *
     * @return a lista de organizadores
     */
    public ListaOrganizadores getRegistoOrganizadores() {
        return listaOrganizadores;
    }

    /**
     * Devolve um FAE
     *
     * @param u o utilizador em questão
     * @return o FAE
     */
    public FAE getFAE(Utilizador u) {
        return listaFAE.getFAE(u);
    }

    /**
     * Devolve a lista de Atribuições de candidaturas por avaliar
     *
     * @param fae O FAE a quem as candidaturas foram atribuidas
     * @return a lista das Atribuições
     */
    public List<Atribuicao> getListaAtribuicoesPorAvaliar(FAE fae) {
        List<Atribuicao> listaAtribuicoesPorAvaliar = new ArrayList<Atribuicao>();
        List<Atribuicao> la = listaAtribuicoes.getListaAtribuicoes();
        for (int i = 0; i < la.size(); i++) {
            if(la.get(i).getFAE() == fae){
                listaAtribuicoesPorAvaliar.add(la.get(i));
            }
            
        }
        return listaAtribuicoesPorAvaliar;
    }

    /**
     * Devolve uma lista com as Demonstrações da Exposição
     *
     * @return a lista das Demonstrações
     */
    public List<Demonstracao> getListaDemonstracoes() {
        return listaDemonstracoes;
    }

    /**
     * cria uma nova Candidatura para a Exposicao em questão
     */
    public Candidatura novaCandidatura() {
        Candidatura c = new Candidatura();
        return c;
    }

    /**
     * verifica os dados da candidatura
     *
     * @param c a candidatura a ser verificada
     * @return o resultado da verificação
     */
    public boolean verificaCandidatura(Candidatura c) {
        if(c.valida() && validaCandidatura(c)){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Adiciona uma candidatura à exposição
     *
     * @param c a candidatura a ser adicionada
     */
    public void addCandidatura(Candidatura c) {
        listaCandidaturas.addCandidatura(c);
    }

    /**
     * Valida globalmente a candidatura
     *
     * @return o resultado da validação
     */
    public boolean validaCandidatura(Candidatura c) {
        boolean flag = true;
        List<Candidatura> lc = listaCandidaturas.getListaCandidaturas();
        for (int i = 0; i < lc.size(); i++) {
            if(lc.get(i).equals(c)){
                flag = false;
                i = lc.size();
            }
        }
        return flag;
    }

    /**
     * Adiciona uma candidatura à exposicão.
     */
    public void adicionaCandidatura(Candidatura c) {
        addCandidatura(c);
    }
    
}