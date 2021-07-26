package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author Grupo 18_LAPR2 15-16
 */
public class Exposicao implements Agendavel, Serializable {

    //Precisa do centro para poder implementar os timers do detetar conflitos
    private CentroExposicoes centroExposicoes;
    private String titulo;
    private String textoDescritivo;
    private Date dataRealizacaoInicio;
    private Date dataRealizacaoFim;
    private Date dataSubmissaoInicio;
    private Date dataSubmissaoFim;
    private String local;
    private Date dataLimConflitos;
    private ListaCandidaturas listaCandidaturas;
    private List<Candidatura> listaCandidaturasRemovidas;
    private ListaStands listaStands;
    private ListaAtribuicoes listaAtribuicoes;
    private ListaAtribuicoesStands listaAtribuicoesStands;
    private ListaDemonstracoes listaDemonstracoes;
    private ListaOrganizadores listaOrganizadores;
    private ListaFAE listaFAE;
    private ListaConflitos listaConflitos;
    private ExposicaoEstado estado;
    private static final String TITULO_POR_OMISSAO = "SEM TITULO";
    private static final String TEXTO_POR_OMISSAO = "SEM TEXTO";
    private static final String LOCAL_POR_OMISSAO = "SEM LOCAL";

    /**
     * Construtor que cria instâncias de Exposicao
     *
     * @param titulo titulo da exposicao
     * @param textoDescritivo texto que descreve a exposicao
     * @param dataInicio data de inicio da exposicao
     * @param dataFim data final da exposicao
     * @param local local onde vai ocorrer a exposicao
     * @param dataSubIni
     * @param dataSubFim
     * @param limConflitos
     * @param listaCandidaturasExposicao lista de candidaturas feitas a uma
     * exposicao
     * @param listaDemonstracao
     * @param listaOrganizadores
     */
    public Exposicao(CentroExposicoes centroExposicoes, String titulo, String textoDescritivo, Date dataInicio,
            Date dataFim, String local, Date dataSubIni, Date dataSubFim,
            Date limConflitos,
            ListaCandidaturas listaCandidaturasExposicao,
            ListaDemonstracoes listaDemonstracao,
            ListaOrganizadores listaOrganizadores, ListaConflitos listaConflitos) {
        this.centroExposicoes = centroExposicoes;
        this.titulo = titulo;
        this.textoDescritivo = textoDescritivo;
        this.dataRealizacaoInicio = dataInicio;
        this.dataRealizacaoFim = dataFim;
        this.dataSubmissaoInicio = dataSubIni;
        this.dataRealizacaoFim = dataSubFim;
        this.dataLimConflitos = limConflitos;
        this.local = local;
        this.listaCandidaturas = listaCandidaturasExposicao;
        this.listaDemonstracoes = listaDemonstracao;
        this.listaOrganizadores = listaOrganizadores;
        this.listaStands = new ListaStands();
        this.listaAtribuicoes = new ListaAtribuicoes();
        this.listaAtribuicoesStands = new ListaAtribuicoesStands();
        this.listaConflitos = listaConflitos;
        this.estado = new ExposicaoEstadoInicial(this);
    }

    /**
     *
     * @param titulo
     * @param textoDescritivo
     * @param dataInicio
     * @param dataFim
     * @param local
     */
    public Exposicao(CentroExposicoes centroExposicoes, String titulo, String textoDescritivo, Date dataInicio,
            Date dataFim, String local, Date dataSubIni, Date dataSubFim,
            Date limConflitos) {
        this.centroExposicoes = centroExposicoes;
        this.titulo = titulo;
        this.textoDescritivo = textoDescritivo;
        this.dataRealizacaoInicio = dataInicio;
        this.dataRealizacaoFim = dataFim;
        this.local = local;
        this.dataSubmissaoInicio = dataSubIni;
        this.dataRealizacaoFim = dataSubFim;
        this.dataLimConflitos = limConflitos;
        this.listaOrganizadores = new ListaOrganizadores();
        this.listaCandidaturas = new ListaCandidaturas();
        this.listaCandidaturasRemovidas = new ArrayList<>();
        this.listaDemonstracoes = new ListaDemonstracoes();
        this.listaFAE = new ListaFAE();
        this.listaConflitos = new ListaConflitos();
        this.listaAtribuicoesStands = new ListaAtribuicoesStands();
        this.listaCandidaturasRemovidas = new ArrayList<>();
        this.listaAtribuicoes = new ListaAtribuicoes();
        this.estado = new ExposicaoEstadoInicial(this);
    }

    /**
     * Construtor vazio
     */
    public Exposicao() {
        this.titulo = TITULO_POR_OMISSAO;
        this.textoDescritivo = TEXTO_POR_OMISSAO;
        this.local = LOCAL_POR_OMISSAO;
        this.dataRealizacaoInicio = new Date();
        this.dataRealizacaoInicio = new Date();
        this.dataSubmissaoInicio = new Date();
        this.dataSubmissaoFim = new Date();
        this.dataLimConflitos = new Date();
        this.listaCandidaturas = new ListaCandidaturas();
        this.listaCandidaturasRemovidas = new ArrayList<>();
        this.listaDemonstracoes = new ListaDemonstracoes();
        this.listaFAE = new ListaFAE();
        this.listaConflitos = new ListaConflitos();
        this.listaOrganizadores = new ListaOrganizadores();
        this.listaAtribuicoes = new ListaAtribuicoes();
        this.listaAtribuicoesStands = new ListaAtribuicoesStands();
        this.estado = new ExposicaoEstadoInicial(this);
    }

    public CentroExposicoes getCentroExposicoes() {
        return centroExposicoes;
    }

    /**
     * Devolve o titulo
     *
     * @return da String titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Altera o titulo
     *
     * @param titulo titulo da exposicao
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Devolve o texto descritivo
     *
     * @return do texto descritivo da exposicao
     */
    public String getTextoDescritivo() {
        return textoDescritivo;
    }

    /**
     * Altera o texto descritivo
     *
     * @param textoDescritivo
     */
    public void setTextoDescritivo(String textoDescritivo) {
        this.textoDescritivo = textoDescritivo;
    }

    /**
     * Devolve a data de inicio
     *
     * @return
     */
    public Date getDataInicio() {
        return dataRealizacaoInicio;
    }

    /**
     * Altera a data de inicio
     *
     * @param dataInicio
     */
    public void setDataInicio(Date dataInicio) {
        this.dataRealizacaoInicio = dataInicio;
    }

    /**
     * Devolve a data de fim
     *
     * @return
     */
    public Date getDataFim() {
        return dataRealizacaoFim;
    }

    /**
     * Altera a data de fim
     *
     * @param dataFim
     */
    public void setDataFim(Date dataFim) {
        this.dataRealizacaoFim = dataFim;
    }

    /**
     * Devolve o local
     *
     * @return
     */
    public String getLocal() {
        return local;
    }

    /**
     * Altera o local
     *
     * @param local string do local
     */
    public void setLocal(String local) {
        this.local = local;
    }

    /**
     * Devolve a lista de candidaturas
     *
     * @return uma lista das candidaturas
     */
    public ListaCandidaturas getListaCandidaturas() {
        return listaCandidaturas;
    }

    /**
     * altera a lista de candidaturas
     *
     * @param listaCandidaturas
     */
    public void setListaCandidaturas(ListaCandidaturas listaCandidaturas) {
        this.listaCandidaturas = listaCandidaturas;
    }

    /**
     * Altera o periodo da exposicao
     *
     * @param dataInicio data de inicio da exposicao
     * @param dataFim data de fim da exposicao
     */
    public void setPeriodoRealizacao(Date dataInicio, Date dataFim) {
        this.dataRealizacaoInicio = dataInicio;
        this.dataRealizacaoFim = dataFim;
    }

    public List<Candidatura> getListaCandidaturasRemovidas() {
        return listaCandidaturas.getListaCandidaturasRemovidas();
    }

    public void setListaCandidaturasRemovidas(List<Candidatura> listaCandidaturasRemovidas) {
        this.listaCandidaturasRemovidas = listaCandidaturasRemovidas;
    }

    /**
     * Adiciona uma nova candidatura de exposicao
     *
     * @return
     */
    public CandidaturaExposicao novaCandidaturaExposicao() {
        return new CandidaturaExposicao();
    }

    /**
     * Devolve a lista de demonstraçoes
     *
     * @return lista demonstraçoes
     */
    public ListaDemonstracoes getListaDemonstracoes() {
        return listaDemonstracoes;
    }

    public ListaAtribuicoesStands getListaAtribuicoesStands() {
        return listaAtribuicoesStands;
    }

    public void setListaAtribuicoesStands(ListaAtribuicoesStands listaAtribuicoesStands) {
        this.listaAtribuicoesStands = listaAtribuicoesStands;
    }

    public void setListaDemonstracoes(ListaDemonstracoes listaDemonstracoes) {
        this.listaDemonstracoes = listaDemonstracoes;
    }

    public ListaOrganizadores getListaOrganizadores() {
        return listaOrganizadores;
    }

    public void setListaOrganizadores(ListaOrganizadores listaOrganizadores) {
        this.listaOrganizadores = listaOrganizadores;
    }

    public ExposicaoEstado getEstadoExp() {
        return estado;
    }

    public void setEstadoExp(ExposicaoEstado estado) {
        this.estado = estado;
    }

    public ListaFAE getListaFAE() {
        return listaFAE;
    }

    public void setListaFAE(ListaFAE listaFAE) {
        this.listaFAE = listaFAE;
    }

    public void setPeriodoSubmissao(Date dataInicio, Date dataFim) {
        this.dataSubmissaoInicio = dataInicio;
        this.dataSubmissaoFim = dataFim;
    }

    public Date getDataSubmissaoInicio() {
        return dataSubmissaoInicio;
    }

    public void setDataSubmissaoInicio(Date dataSubmissaoInicio) {
        this.dataSubmissaoInicio = dataSubmissaoInicio;
    }

    public Date getDataSubmissaoFim() {
        return dataSubmissaoFim;
    }

    public void setDataSubmissaoFim(Date dataSubmissaoFim) {
        this.dataSubmissaoFim = dataSubmissaoFim;
    }

    public Date getDataLimConflitos() {
        return dataLimConflitos;
    }

    public void setDataLimConflitos(Date dataLimConflitos) {
        this.dataLimConflitos = dataLimConflitos;
    }

    public void setCriada() {
        estado.setCriada();
    }

    public void setFAEDefinidos() {
        estado.setComFAESemDemonstracao();
    }

    public void setCandidaturasAtribuidas() {
        estado.setCandidaturasAtribuidas();
    }

    @Override
    public void schedule(TimerTask task, Date data) {
        Timer t = new Timer();
        t.schedule(task, data);
    }

    public void setCandidaturasAbertas() {
        estado.setCandidaturasExposicaoAbertas();
    }

    public void setCandidaturasFechadas() {
        estado.setCandidaturasExposicaoFechadas();
    }

    public void setConflitosAlterados() {
        estado.setConflitosAlterados();
    }

    public ListaConflitos getListaConflitos() {
        return listaConflitos;
    }

    public void setListaConflitos(ListaConflitos listaConflitos) {
        this.listaConflitos = listaConflitos;
    }

    public ListaAtribuicoes getListaAtribuicoes() {
        return listaAtribuicoes;
    }

    public void setListaAtribuicoes(ListaAtribuicoes listaAtribuicoes) {
        this.listaAtribuicoes = listaAtribuicoes;
    }

}
