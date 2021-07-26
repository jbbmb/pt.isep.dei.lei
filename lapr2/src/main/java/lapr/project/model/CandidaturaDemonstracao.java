package lapr.project.model;

import java.io.Serializable;

/**
 * @author Grupo 18_LAPR2 15-16
 */
public class CandidaturaDemonstracao implements Candidatura, Serializable {

    private String descricao;
    private CandidaturaEstado estado;
    private String idRepresentante;
    private String decisao;
    private ListaAvaliacoes listaAvaliacoes;
    private final String DESCRICAO_POR_OMISSAO = "Sem descricao";

    public CandidaturaDemonstracao(String descricao, String id) {
        this.descricao = descricao;
        idRepresentante = id;
    }

    public CandidaturaDemonstracao() {
        this.descricao = DESCRICAO_POR_OMISSAO;
    }

    public CandidaturaDemonstracao(Candidatura cand) {
        CandidaturaDemonstracao c = (CandidaturaDemonstracao) cand;
        this.descricao = c.getDescricao();
        this.estado = c.getEstado();
        this.idRepresentante = c.getIdRepresentante();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDecisao(String decisao) {
        this.decisao = decisao;
    }

    public String getDecisao() {
        return decisao;
    }

    public CandidaturaEstado getEstado() {
        return estado;
    }

    @Override
    public void setEstado(CandidaturaEstado estado) {
        this.estado = estado;
    }

    public String getIdRepresentante() {
        return idRepresentante;
    }

    public void setIdRepresentante(String idRepresentante) {
        this.idRepresentante = idRepresentante;
    }

    public boolean valida() {
        return true;
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

    public ListaAvaliacoes getListaAvaliacoes() {
        return listaAvaliacoes;
    }

    public void setListaAvaliacoes(ListaAvaliacoes listaAvaliacoes) {
        this.listaAvaliacoes = listaAvaliacoes;
    }

    @Override
    public void registaDecisao(String decisao) {
        this.decisao = decisao;
        this.estado.setDecidida();
    }

    @Override
    public void registaAvaliacao(Avaliacao avaliacao) {
        listaAvaliacoes.addAvaliacao(avaliacao);
        estado.setAvaliada();
    }

    @Override
    public String toString() {
        return "\nDescrição:" + descricao;

    }

    @Override
    public String[] getDadosCandidatura() {
        return new String[]{descricao};
    }

    @Override
    public ListaProdutos getListaProdutos() {
        return null;
    }

    @Override
    public ListaDemonstracoes getListaDemonstracoes() {
        return null;
    }

    // ESTE MÉTODO É NECESSÁRIO PARA NÃO DAR ERRO - CORRIGIR!
    @Override
    public void setStand(Stand stand) {

    }

    @Override
    public String getNomeEmpresa() {
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj) == false) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CandidaturaDemonstracao)) {
            return false;
        }
        CandidaturaDemonstracao cand = (CandidaturaDemonstracao) obj;
        return descricao.equals(cand.descricao);
    }

}
