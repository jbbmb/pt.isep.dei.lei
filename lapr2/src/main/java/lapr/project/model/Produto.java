package lapr.project.model;

import java.io.Serializable;

/**
 * @author Grupo 18_LAPR2 15-16
 */
public class Produto implements Serializable {

    /**
     * Nome do produto
     */
    private String nome;

    private final String NOME_POR_OMISSÃO = "Sem nome de produto";

    /**
     * Cria intâncias de Produto recebendo como parâmetro o nome do produto.
     *
     * @param caracterizacao
     */
    public Produto(String caracterizacao) {
        this.nome = caracterizacao;
    }

    /**
     * Cria instâncias de Produto com os parâmetros por omissão.
     */
    public Produto() {
        nome = NOME_POR_OMISSÃO;
    }

    /**
     * Modifica o nome do produto.
     *
     * @param caracterizacao
     */
    public void setProduto(String caracterizacao) {
        this.nome = caracterizacao;
    }

    /**
     * Devolve o nome do produto.
     *
     * @return
     */
    public String getNomeProduto() {
        return nome;
    }

    public boolean valida() {
        return true;
    }

}
