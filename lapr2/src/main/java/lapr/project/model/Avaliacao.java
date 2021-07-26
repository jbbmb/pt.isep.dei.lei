package lapr.project.model;

import java.io.Serializable;

/**
 * @author Grupo 18_LAPR2 15-16
 */
public class Avaliacao implements Serializable {

    private String idFAE;
    private String conhecimentoFAE;
    private String adequacaoExposicao;
    private String adequacaoDemonstracoes;
    private String adequacaoConvites;
    private String recomendacao;
    private final String RESPOSTA_POR_DEFEITO = "SEM RESPOSTA";

    public Avaliacao(String idFAE) {
        this.idFAE = idFAE;
        conhecimentoFAE = RESPOSTA_POR_DEFEITO;
        adequacaoExposicao = RESPOSTA_POR_DEFEITO;
        adequacaoDemonstracoes = RESPOSTA_POR_DEFEITO;
        adequacaoConvites = RESPOSTA_POR_DEFEITO;
        recomendacao = RESPOSTA_POR_DEFEITO;
    }

    public Avaliacao(String idFAE, String respostaPergunta1, String respostaPergunta2, String respostaPergunta3, String respostaPergunta4, String respostaPergunta5) {
        this.idFAE = idFAE;
        this.conhecimentoFAE = respostaPergunta1;
        this.adequacaoExposicao = respostaPergunta2;
        this.adequacaoDemonstracoes = respostaPergunta3;
        this.adequacaoConvites = respostaPergunta4;
        this.recomendacao = respostaPergunta5;
    }

    public String getIdFAE() {
        return idFAE;
    }

    public void setIdFAE(String idFAE) {
        this.idFAE = idFAE;
    }

    public String getConhecimentoFAE() {
        return conhecimentoFAE;
    }

    public void setConhecimentoFAE(String conhecimentoFAE) {
        this.conhecimentoFAE = conhecimentoFAE;
    }

    public String getAdequacaoExposicao() {
        return adequacaoExposicao;
    }

    public void setAdequacaoExposicao(String adequacaoExposicao) {
        this.adequacaoExposicao = adequacaoExposicao;
    }

    public String getAdequacaoDemonstracoes() {
        return adequacaoDemonstracoes;
    }

    public void setAdequacaoDemonstracoes(String adequacaoDemonstracoes) {
        this.adequacaoDemonstracoes = adequacaoDemonstracoes;
    }

    public String getAdequacaoConvites() {
        return adequacaoConvites;
    }

    public void setAdequacaoConvites(String adequacaoConvites) {
        this.adequacaoConvites = adequacaoConvites;
    }

    public String getRecomendacao() {
        return recomendacao;
    }

    public void setRecomendacao(String recomendacao) {
        this.recomendacao = recomendacao;
    }

    public boolean validarRespostas() {
        if (!conhecimentoFAE.equals(RESPOSTA_POR_DEFEITO) && !adequacaoExposicao.equals(RESPOSTA_POR_DEFEITO) && !adequacaoDemonstracoes.equals(RESPOSTA_POR_DEFEITO) && !adequacaoConvites.equals(RESPOSTA_POR_DEFEITO) && !recomendacao.equals(RESPOSTA_POR_DEFEITO)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Avaliacao other = (Avaliacao) obj;
        if (!this.conhecimentoFAE.equalsIgnoreCase(other.conhecimentoFAE)) {
            return false;
        }
        if (!this.adequacaoExposicao.equalsIgnoreCase(other.adequacaoExposicao)) {
            return false;
        }
        if (!this.adequacaoDemonstracoes.equalsIgnoreCase(other.adequacaoDemonstracoes)) {
            return false;
        }
        if (!this.adequacaoConvites.equalsIgnoreCase(other.adequacaoConvites)) {
            return false;
        }
        if (!this.recomendacao.equalsIgnoreCase(other.recomendacao)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Avaliacao feita pelo utilizador FAE " + idFAE + ":\n"
                + "\nConhecimento do FAE sobre o tema da exposição: " + conhecimentoFAE
                + "\nAdequação da candidatura à exposição: " + adequacaoExposicao
                + "\nAdequação da candidatura às demonstrações: " + adequacaoDemonstracoes
                + "\nAdequação do número de convites por candidatura: " + adequacaoConvites
                + "\nRecomendação global: " + recomendacao;
    }

}
