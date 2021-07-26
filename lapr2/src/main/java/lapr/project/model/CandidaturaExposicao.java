package lapr.project.model;

import java.io.Serializable;

/**
 * @author Grupo 18_LAPR2 15-16
 */
public class CandidaturaExposicao implements Candidatura, Serializable {

    /**
     * Nome da empresa que se candidata
     */
    private String nomeEmpresa;
    /**
     * Morada da empresa que se candidata
     */
    private String morada;
    /**
     * Contacto da empresa que se candidata
     */
    private String contacto;
    /**
     * Área pretendida para o stand da empresa que se candidata
     */
    private int area;
    /**
     * Número de convites pretendidos pela empresa que se candidata
     */
    private int numConvites;
    /**
     * USERNAME/ ID do Representante que se candidata à exposição
     */
    private String idRepresentante;

    private String caracterizacao;
    /**
     * Lista de produtos adicionados pela empresa que se candidata
     */
    private ListaProdutos listaProdutos;

    private ListaDemonstracoes listaDemonstracoes;

    private ListaAvaliacoes listaAvaliacoes;

    private Stand stand;

    /**
     * Nome da empresa por omissão
     */
    private final String NOME_EMPRESA_POR_OMISSAO = "Sem nome";
    /**
     * Morada da empresa por omissão
     */
    private final String MORADA_POR_OMISSAO = "Sem morada";
    /**
     * Contacto da empresa por omissão
     */
    private final String CONTACTO_POR_OMISSAO = "Sem contacto";
    /**
     * Área pretendida para o stand da empresa que se candidata por omissão
     */
    private final int AREA_POR_OMISSAO = 0;
    /**
     * Número de convites pretendidos pela empresa que se candidata por omissão
     */
    private final int NUM_CONVITES_POR_OMISSAO = 0;

    private final String CARACTERIZACAO_POR_OMISSAO = "Sem palavras-chave";

    private CandidaturaEstado estado;

    private String decisao;

    private final String STAND_POR_OMISSAO = "Sem stand definido";

    /**
     * Cria intâncias de CandidaturaExposição recebendo como parâmetro o nome da
     * empresa, a morada, o contacto, a area pretendida e o número de convites
     * requisitados.
     *
     * @param nomeEmpresa
     * @param morada
     * @param contacto
     * @param area
     * @param numConvites
     * @param idRepresentante
     * @param caracterizacao
     * @param listaProdutos
     * @param listaDemonstracoes
     * @param representante
     */
    public CandidaturaExposicao(String nomeEmpresa, String morada,
            String contacto, int area, int numConvites, String caracterizacao,
            ListaProdutos listaProdutos,
            ListaDemonstracoes listaDemonstracoes, String idRepresentante) {
        this.nomeEmpresa = nomeEmpresa;
        this.morada = morada;
        this.contacto = contacto;
        this.area = area;
        this.numConvites = numConvites;
        this.caracterizacao = caracterizacao;
        this.listaProdutos = listaProdutos;
        this.listaAvaliacoes = new ListaAvaliacoes();
        this.listaDemonstracoes = listaDemonstracoes;
        this.idRepresentante = idRepresentante;

    }

    /**
     * Cria instâncias de CandidaturaExposicao com os parâmetros por omissão.
     */
    public CandidaturaExposicao() {
        this.nomeEmpresa = NOME_EMPRESA_POR_OMISSAO;
        this.morada = MORADA_POR_OMISSAO;
        this.contacto = CONTACTO_POR_OMISSAO;
        this.area = AREA_POR_OMISSAO;
        this.numConvites = NUM_CONVITES_POR_OMISSAO;
        this.caracterizacao = CARACTERIZACAO_POR_OMISSAO;
        this.listaProdutos = new ListaProdutos();
        this.listaDemonstracoes = new ListaDemonstracoes();
        this.listaAvaliacoes = new ListaAvaliacoes();
    }
    
    public CandidaturaExposicao(String nomeEmpresa, String morada,
            String contacto, int area, int numConvites, String caracterizacao, String idRepresentante){
        this.nomeEmpresa = nomeEmpresa;
        this.morada = morada;
        this.contacto = contacto;
        this.area = area;
        this.numConvites = numConvites;
        this.caracterizacao = caracterizacao;
        this.listaProdutos = new ListaProdutos();
        this.listaDemonstracoes = new ListaDemonstracoes();
        this.listaAvaliacoes = new ListaAvaliacoes();
    }

    public CandidaturaExposicao(Candidatura cand) {
        CandidaturaExposicao c = (CandidaturaExposicao) cand;
        this.nomeEmpresa = c.getNomeEmpresa();
        this.morada = c.getMorada();
        this.contacto = c.getContacto();
        this.area = c.getArea();
        this.numConvites = c.getNumConvites();
        this.caracterizacao = c.getCaracterizacao();
        this.listaProdutos = c.getListaProdutos();
        this.listaDemonstracoes = c.getListaDemonstracoes();
        this.estado = c.getEstado();
        this.idRepresentante = c.getIdRepresentante();
    }

    /**
     * Devolve o nome da empresa que se candidata.
     *
     * @return nomeEmpresa
     */
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    /**
     * Devolve a morada da empresa que se candidata.
     *
     * @return morada
     */
    public String getMorada() {
        return morada;
    }

    /**
     * Retorna o contacto da empresa que se candidata.
     *
     * @return contacto
     */
    public String getContacto() {
        return contacto;
    }

    /**
     * Devolve a área pretendida para o stand da empresa que se candidata.
     *
     * @return area
     */
    public int getArea() {
        return area;
    }

    /**
     * Retorna o número de convites pretendidos pela empresa que se candidata
     *
     * @return numConvites
     */
    public int getNumConvites() {
        return numConvites;
    }

    public String getIdRepresentante() {
        return idRepresentante;
    }

    @Override
    public void setIdRepresentante(String id) {
        this.idRepresentante = id;
    }

    /**
     * Modifica o nome empresa que se candidata.
     *
     * @param nomeEmpresa
     */
    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    /**
     * Altera a morada da empresa que se candidata.
     *
     * @param morada
     */
    public void setMorada(String morada) {
        this.morada = morada;
    }

    /**
     * Modifica o contacto da empresa que se candidata.
     *
     * @param contacto
     */
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    /**
     * Modifica a área pretendida para o stand da empresa que se candidata.
     *
     * @param area
     */
    public void setArea(int area) {
        this.area = area;
    }

    /**
     * Altera o número de convites pretendidos pela empresa que se candidata
     *
     * @param numConvites
     */
    public void setNumConvites(int numConvites) {
        this.numConvites = numConvites;
    }

    public String toString() {
        String dados = "Nome da empresa: " + nomeEmpresa + "\nMorada: " + morada
                + "\nÁrea do Stand: " + area + "\nNúmero de convites: " + numConvites
                + "\nCaracterização: " + caracterizacao + "\nListaProdutos: ";

        for (int i = 0; i < listaProdutos.getListaProdutos().size(); i++) {
            dados = dados + listaProdutos.getListaProdutos().get(i) + "\n";
        }
        return dados;
    }

    @Override
    public ListaAvaliacoes getListaAvaliacoes() {
        return listaAvaliacoes;
    }

    public void setListaAvaliacoes(ListaAvaliacoes listaAvaliacoes) {
        this.listaAvaliacoes = listaAvaliacoes;
    }

    /**
     * Cria um novo produto
     *
     * @return novo Produto
     */
    public Produto novoProduto(String caracterizacao) {
        if (caracterizacao.equals("")) {
            return new Produto();
        } else {
            return new Produto(caracterizacao);
        }
    }

    /**
     * Adiciona o produto contendo o nome e respetiva caracterização à lista de
     * produtos.
     *
     * @param produto
     */
    public void addProduto(Produto produto) {
        listaProdutos.getListaProdutos().add(produto);
    }

    /**
     * Valida se os campos do nome e morada estão preenchidos, se o contacto tem
     * 9 dígitos e se a área inserida não é um valor inferior a 1.
     *
     * @return true se todos os parâmetros verificados estiverem corretos
     */
    public boolean valida() {
        if (nomeEmpresa.length() == 0 || morada.length() == 0
                || contacto.length() != 9 || area < 1) {
            return false;
        }
        return true;
    }

    @Override
    public void setEstado(CandidaturaEstado estado) {
        this.estado = estado;
    }

    public CandidaturaEstado getEstado() {
        return estado;
    }

    public boolean validaProduto(Produto produto) {
        return true;
    }

    public ListaProdutos getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(ListaProdutos listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public ListaDemonstracoes getListaDemonstracoes() {
        return listaDemonstracoes;
    }

    public void setListaDemonstracoes(ListaDemonstracoes listaDemonstracoes) {
        this.listaDemonstracoes = listaDemonstracoes;
    }

    public String getCaracterizacao() {
        return caracterizacao;
    }

    public void setCaracterizacao(String caracterizaçao) {
        this.caracterizacao = caracterizaçao;
    }
    /*
     public Representante getRepresentante() {
     return representante;
     }

     public void setRepresentante(Representante representante) {
     this.representante = representante;
     }
     */

    public String getDecisao() {
        return decisao;
    }

    public void setDecisao(String decisao) {
        this.decisao = decisao;
    }

    public boolean regista() {
        return estado.setCriada();
    }

    public boolean validaDecisao(String dec) {
        if (dec != null) {
            return true;
        }
        return false;
    }

    @Override
    public void registaDecisao(String decisao) {
        this.decisao = decisao;
//        this.estado.setDecidida();
    }

    @Override
    public void registaAvaliacao(Avaliacao avaliacao) {
        listaAvaliacoes.addAvaliacao(avaliacao);
        estado.setAvaliada();
    }

    @Override
    public String[] getDadosCandidatura() {
        return new String[]{this.nomeEmpresa, this.morada, this.contacto,
            String.valueOf(this.area), String.valueOf(this.numConvites), this.caracterizacao};
    }

    @Override
    public void setDescricao(String info) {
        // método nao utilizado nesta clase.
    }

    public void setStand(Stand stand) {
        this.stand = stand;
    }

    public Stand getStand() {
        return stand;
    }

    public void setDemonstracao(Demonstracao demonstracao) {
        listaDemonstracoes.addDemonstracao(demonstracao);
    }

    public void setCriada() {
        estado.setCriada();
    }

    @Override
    public boolean equals(Object obj) {

        if (super.equals(obj) == false) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CandidaturaExposicao)) {
            return false;
        }
        CandidaturaExposicao cand = (CandidaturaExposicao) obj;
        return nomeEmpresa.equals(cand.nomeEmpresa);
    }

    @Override
    public String getDescricao() {
       return caracterizacao;
    }

    
}
