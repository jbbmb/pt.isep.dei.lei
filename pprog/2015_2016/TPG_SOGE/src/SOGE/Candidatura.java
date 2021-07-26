package SOGE;
/** @author Débora Costa (1150433), João Borges (1150475) e Luís Gouveia (1150437) @ LEI-ISEP */

import java.util.List;

public class Candidatura {
    /**
     * Nome da empresa que se vai candidatar
     */
    private String nome;
    /**
     * Morada da empresa que se candidata
     */
    private String morada;
    /**
     * Contacto da empresa que se candidata
     */
    private int contacto;
    /**
     * Área da exposição pretendida pela empresa
     */
    private double areaPretendida;
    /**
     * Número de convites pretendida pela empresa
     */
    private int nConvites;
    /**
     * Lista que contém as demonstrações que uma dada empresa pretende realizar,
     * pode ser uma lista vazia no caso de não querer fazer demonstrações
     */
    private List<Demonstracao> listaDemonstracoes;
    
    /**
     * Lista de Avaliações da Candidatura
     *
     * (ver se é uma classe ou um List)
     */
    private List<Avaliacao> listaAvaliacao;
    
    /**
     * Lista de produtos adicionados de uma dada candidatura
     */
    private List<Produto> listaProdutos;

    /**
     * Altera o nome da empresa que se candidata
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Altera a morada da empresa que se candidata
     * @param morada 
     */
    public void setMorada(String morada) {
        this.morada = morada;
    }

    /**
     * Altera o contacto da empresa que se candidata
     * @param contacto 
     */
    public void setContacto(int contacto) {
        this.contacto = contacto;
    }

    /**
     * Modifica a área que a empresa que se candidata pretende
     * @param areaPretendida 
     */
    public void setAreaPretendida(double areaPretendida) {
        this.areaPretendida = areaPretendida;
    }

    /**
     * Altera o número de convites pretendidos pela empresa que se candidata
     * @param nConvites 
     */
    public void setNumeroConvites(int nConvites) {
        this.nConvites = nConvites;
    }

    /**
     * Modifica a lista de demonstrações
     * @param ld 
     */
    public void setListaDemonstracoes(List<Demonstracao> ld) {
        this.listaDemonstracoes = ld;
    }

    /**
     * Devolve o nome da empresa
     * @return Nome da empresa
     */
    public String getNome() {
        return nome;
    }

    /**
     * Retorna a morada da empresa
     * @return Morada da empresa
     */
    public String getMorada() {
        return morada;
    }

    /**
     * Retorna o contacto da empresa
     * @return Contacto da empresa
     */
    public int getContacto() {
        return contacto;
    }

    /**
     * Devolve a área pretendida pela empresa
     * @return Área pretendida
     */
    public double getAreaPretendida() {
        return areaPretendida;
    }

    /**
     * Retorna o número de convites
     * @return Número de convites
     */
    public int getNumeroConvite() {
        return nConvites;
    }

    /**
     * Retorna a lista de demonstrações selecionadas na candidatura
     * @return Lista de demonstrações 
     */
    public List<Demonstracao> getListaDemonstracoes() {
        return listaDemonstracoes;
    }

    /**
     * Devolve a representação textual de todos os dados da candidatura
     * @return Dados da candidatura
     */
    public String toString (){
        String produtos = "Produtos:\n\n";
        String demonstracoes = "Demonstrações:\n\n";
        String dados = "Nome: " + nome + "\nMorada: " + morada + "\nContacto: " + contacto + 
                "Área da exposição pretendida: " + areaPretendida + "Número de convites: " + 
                nConvites;
        for (int i = 0; i < listaProdutos.size(); i++) {
            produtos = produtos + listaProdutos.get(i).getNome() + "\n";
        }
        for (int j = 0; j < listaDemonstracoes.size(); j++) {
            demonstracoes = demonstracoes +listaDemonstracoes.get(j).getNome() + "\n";
        }
        return dados + produtos + demonstracoes;
    }
    
    /**
     * Cria uma nova avaliação
     *
     * @return a avaliação criada.
     */
    public Avaliacao novaAvaliacao() {
        Avaliacao av = new Avaliacao();
        return av;
    }

    /**
     * Cria um novo produto
     *
     * @return o produto criado.
     */
    public Produto novoProduto() {
        Produto p = new Produto();
        return p;
    }

    /**
     * Adiciona um produto à candidatura
     *
     * @param p o produto
     */
    public boolean adicionaProduto(Produto p) {
        boolean flag;
        if (valida() && validaProduto(p)) {
            insereProduto(p);
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

    /**
     * O utilizador insere um produto
     *
     * @param p
     */
    public void insereProduto(Produto p) {
        listaProdutos.add(p);
    }

    /**
     * Valida a Avaliação da Candidatura feita, verifica não só se todos os campos
     * estão preenchidos mas também se aquela candidatura já tem avaliação ou não 
     * para não haver duplicados
     *
     * @param av a avaliação a ser validada
     * @return o resultado da validação
     */
    public boolean validaAvaliacao(Avaliacao av) {
        if(av.getDecisao() != null && av.getJustificacao() != null && av.getAtribuicao() != null){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Valida o Produto da Candidatura feita
     *
     * @param p o produto a ser validado
     * @return true se o produto tiver nome
     */
    public boolean validaProduto(Produto p) {
        if(p.getNome() != null){
            return true;
        } 
        return false;
    }

    /**
     * Valida localmente a candidatura
     *
     * @return o resultado da validação
     */
    public boolean valida() {
        if(nome != null && morada!= null && contacto!= 0 && areaPretendida!= 0 && nConvites!= 0){
            return true;
        }
        return false;
    }

    /**
     * Regista a Avaliação da Candidatura feita
     *
     * @param av a avaliação a ser registada
     */
    public void registaAvaliacao(Avaliacao av) {
        listaAvaliacao.add(av);
    }

}