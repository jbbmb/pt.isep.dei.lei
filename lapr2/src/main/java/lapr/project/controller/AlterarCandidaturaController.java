package lapr.project.controller;

import java.io.Serializable;
import java.util.List;
import lapr.project.model.Candidatura;
import lapr.project.model.CandidaturaDemonstracao;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;
import lapr.project.model.ExposicaoEstado;
import lapr.project.model.ListaDemonstracoes;
import lapr.project.model.Produto;

/**
 *
 * @author Grupo 18
 */
public class AlterarCandidaturaController implements Serializable {

    private CentroExposicoes centroExposicoes;
    private String idRepresentante;
    private Exposicao exposicaoSelecionada;
    private Demonstracao demonstracaoSelecionada;
    private Candidatura candidaturaSelecionada;
    private CandidaturaExposicao candidaturaExposicaoCopia;
    private CandidaturaDemonstracao candidaturaDemonstracaoCopia;
    private Produto produto;
    private Demonstracao demonstracao;

    public AlterarCandidaturaController(CentroExposicoes ce, String id) {
        this.centroExposicoes = ce;
        this.idRepresentante = id;
    }

    public List<Exposicao> getListaExposicoes() {
        return centroExposicoes.getRegistoExposicoes().getListaExposicoes();
    }

    public List<Produto> getListaProdutos() {
        return this.candidaturaExposicaoCopia.getListaProdutos().getListaProdutos();
    }

    public List<Demonstracao> getListaDemonstracoes() {
        return exposicaoSelecionada.getListaDemonstracoes().getListaDemonstracoes();
    }

    public List<Demonstracao> getListaDemonstracoesCandidatura() {
        return candidaturaExposicaoCopia.getListaDemonstracoes().getListaDemonstracoes();
    }

    public String[] getCandidaturaExposicaoRepresentante() throws NullPointerException {
        this.candidaturaSelecionada = exposicaoSelecionada.getListaCandidaturas().getCandidaturaRepresentante(idRepresentante);
        if (candidaturaSelecionada == null) {
            throw new NullPointerException();
        } else {
            this.candidaturaExposicaoCopia = new CandidaturaExposicao(candidaturaSelecionada);
            return candidaturaExposicaoCopia.getDadosCandidatura();
        }

    }

    public String getCandidaturaDemonstracaoRepresentante() throws NullPointerException {
        this.candidaturaSelecionada = demonstracaoSelecionada.getListaCandidaturas().getCandidaturaRepresentante(idRepresentante);
        if (candidaturaSelecionada == null) {
            throw new NullPointerException();
        } else {
            this.candidaturaDemonstracaoCopia = new CandidaturaDemonstracao(candidaturaSelecionada);
            return candidaturaDemonstracaoCopia.getDescricao();
        }
    }

    public ExposicaoEstado selectExposicao(int indexExposicao) {
        this.exposicaoSelecionada = centroExposicoes.getRegistoExposicoes().getListaExposicoes().get(indexExposicao);
        return exposicaoSelecionada.getEstadoExp();
    }

    public void selectDemonstracao(int indexDemonstracao) {
        this.demonstracaoSelecionada = exposicaoSelecionada.getListaDemonstracoes().getListaDemonstracoes().get(indexDemonstracao);
    }

    public void adicionarProduto(String descricao) {
        this.produto = this.candidaturaExposicaoCopia.getListaProdutos().novoProduto();
        produto.setProduto(descricao);
        this.candidaturaExposicaoCopia.getListaProdutos().addProduto(produto);
    }

    public void removerProduto(int indexProduto) {
        List<Produto> listaProdutos = this.candidaturaExposicaoCopia.getListaProdutos().getListaProdutos();
        listaProdutos.remove(indexProduto);

    }

    public void adicionarDemonstracaoCandidatura(int indexDemonstracao) {
        this.demonstracao = exposicaoSelecionada.getListaDemonstracoes().getListaDemonstracoes().get(indexDemonstracao);
        candidaturaExposicaoCopia.getListaDemonstracoes().getListaDemonstracoes().add(demonstracao);
    }

    public void removerDemonstracaoCandidatura(int indexDemonstracao) {
        ListaDemonstracoes listaDemonstracoesCandidatura = this.candidaturaExposicaoCopia.getListaDemonstracoes();
        listaDemonstracoesCandidatura.getListaDemonstracoes().remove(indexDemonstracao);
    }

    public boolean alterarCandidaturaExposicao(String[] info) {
        candidaturaExposicaoCopia.setNomeEmpresa(info[0]);
        candidaturaExposicaoCopia.setMorada(info[1]);
        candidaturaExposicaoCopia.setContacto(info[2]);
        candidaturaExposicaoCopia.setArea(Integer.parseInt(info[3]));
        candidaturaExposicaoCopia.setNumConvites(Integer.parseInt(info[4]));
        candidaturaExposicaoCopia.setCaracterizacao(info[5]);
        if (candidaturaExposicaoCopia.valida() && validarAlteracoesCandidaturaExposicao()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean alterarCandidaturaDemonstracao(String info) {
        candidaturaDemonstracaoCopia.setDescricao(info);
        if (candidaturaDemonstracaoCopia.valida() && validarAlteracoesCandidaturaDemonstracao()) {
            return true;
        } else {
            return false;
        }
    }

    public void registaAlteracaoCandidaturaExposicao() {
        this.exposicaoSelecionada.getListaCandidaturas().alterarCandidatura(candidaturaSelecionada, candidaturaExposicaoCopia);
    }

    public void registaAlteracaoCandidaturaDemonstracao() {
        this.demonstracaoSelecionada.getListaCandidaturas().alterarCandidatura(candidaturaSelecionada, candidaturaDemonstracaoCopia);
    }

    public boolean validarAlteracoesCandidaturaExposicao() {
        boolean flag = true;
        List<Candidatura> listaCandidaturas = exposicaoSelecionada.getListaCandidaturas().getListaCandidaturas();
        for (Candidatura c : listaCandidaturas) {
            if (c.equals(candidaturaExposicaoCopia)) {
                return false;
            }
        }
        return flag;
    }

    public boolean validarAlteracoesCandidaturaDemonstracao() {
        boolean flag = true;
        List<Candidatura> listaCandidaturas = demonstracaoSelecionada.getListaCandidaturas().getListaCandidaturas();
        for (Candidatura c : listaCandidaturas) {
            if (c.equals(candidaturaDemonstracaoCopia)) {
                return false;
            }
        }
        return flag;
    }

}
