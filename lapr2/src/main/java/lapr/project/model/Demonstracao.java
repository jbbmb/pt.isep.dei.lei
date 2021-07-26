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
public class Demonstracao implements Serializable, Agendavel {

    private String codigoUnico;

    private String descricao;

    private ListaRecursos listaRecursos;

    private ListaAtribuicoes listaAtribuicoes;

    private String decisao;

    private Date dataInicio;

    private Date dataFim;

    private DemonstracaoEstado estado;

    private ListaCandidaturas listaCandidaturas;

    private List<Candidatura> listaCandidaturasRemovidas;

    private final String CODIGO_POR_OMISSAO = "Sem codigo";

    private final String DESCRICAO_POR_OMISSAO = "Sem descricao";

    public Demonstracao(String codigoUnico, String descricao) {
        this.codigoUnico = codigoUnico;
        this.descricao = descricao;
        this.listaRecursos = new ListaRecursos();
        this.listaCandidaturas = new ListaCandidaturas();
        this.listaCandidaturasRemovidas = new ArrayList<>();
        this.listaAtribuicoes = new ListaAtribuicoes();
    }

    public Demonstracao() {
        this.codigoUnico = CODIGO_POR_OMISSAO;
        this.descricao = DESCRICAO_POR_OMISSAO;
        this.listaRecursos = new ListaRecursos();
        this.listaCandidaturas = new ListaCandidaturas();
        this.listaCandidaturasRemovidas = new ArrayList<>();
        this.listaAtribuicoes = new ListaAtribuicoes();

    }

    public CandidaturaDemonstracao novaCandidaturaDemonstracao() {
        return new CandidaturaDemonstracao();
    }

    public String getDadosDemonstracao() {
        String dados = "Código Único: " + codigoUnico + "\nDescrição: " + descricao
                + "\n";
        String recursos = "Lista de Recursos:\n";
        for (int i = 0; i < listaRecursos.getListaRecursos().size(); i++) {
            recursos = recursos + listaRecursos.getListaRecursos().get(i).getRecurso() + "\n";
        }
        return dados + recursos;
    }

    public void setDecisao(String decisao) {
        this.decisao = decisao;
    }
    
    public String getDecisao() {
        return decisao;
    }

    public String getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }
    
     public Date getDataInicio() {
        return dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    //FALTA COMPLETAR
    public boolean validaDecisaoEDatas() {
        return true;
    }

    public ListaRecursos getListaRecursos() {
        return listaRecursos;
    }

    public void setListaRecursos(ListaRecursos listaRecursos) {
        this.listaRecursos = listaRecursos;
    }

    public void setEstado(DemonstracaoEstado estado) {
        this.estado = estado;
    }

    public DemonstracaoEstado getEstado() {
        return estado;
    }

    public void setCriada() {
        estado.setCriada();
    }

    public void setDefinitiva() {
        estado.setDefinitiva();
    }

    public void setCandidaturasAbertas() {
        estado.setCandidaturasAbertas();
    }

    public void setCandidaturasTerminadas() {
        estado.setCandidaturasTerminadas();
    }

    public void setConflitosDetetados() {
        estado.setConflitosDetetados();
    }

    public void setConflitosAlterados() {
        estado.setConflitosAlterados();
    }

    public void setCandidaturasAtribuidas() {
        estado.setCandidaturasAtribuidas();
    }

    public void setCandidaturasAvaliadas() {
        estado.setCandidaturasAvaliadas();
    }

    public void setCandidaturasDecididas() {
        estado.setCandidaturasDecididas();
    }

    public ListaCandidaturas getListaCandidaturas() {
        return listaCandidaturas;
    }

    public List<Candidatura> getListaCandidaturasRemovidas() {
        return listaCandidaturasRemovidas;
    }

    public void setListaCandidaturasRemovidas(List<Candidatura> listaCandidaturasRemovidas) {
        this.listaCandidaturasRemovidas = listaCandidaturasRemovidas;
    }
 
    public void setListaCandidaturas(ListaCandidaturas listaCandidaturas) {
        this.listaCandidaturas = listaCandidaturas;
    }

    public ListaAtribuicoes getListaAtribuicoes() {
        return listaAtribuicoes;
    }

    public void setListaAtribuicoes(ListaAtribuicoes listaAtribuicoes) {
        this.listaAtribuicoes = listaAtribuicoes;
    }

    public boolean validaDemonstracao() {
        if (codigoUnico != null && descricao != null && listaRecursos.getListaRecursos().size() > 0) {
            return true;
        }
        return false;
    }

    @Override
    public void schedule(TimerTask task, Date data) {
        Timer t = new Timer();
        t.schedule(task, data);

    }


}
