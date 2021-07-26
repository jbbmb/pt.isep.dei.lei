package gestaoCC;
/** @author João Borges, 1150475 - LEI @ ISEP */

import java.util.ArrayList;
import java.util.List;

public class centroCongressos {
    
    // Variáveis da classe
    private String nome;
    private List<espaco> listaEspacos;
    
    // Valores pré-definidos das variáveis
    private static final String NOME_POR_OMISSAO = "null";
    
    // Construtores de objetos
    public centroCongressos() {
        nome = NOME_POR_OMISSAO;
        listaEspacos = new ArrayList<>();
    }
    
    public centroCongressos(String nome) {
        this.nome = nome;
        this.listaEspacos = new ArrayList<>();
    }
    
    public centroCongressos(String nome, List<espaco> listaEspacos) {
        this.nome = nome;
        this.listaEspacos = listaEspacos;
    }

    // Métodos de consulta
    public String getNome() {
        return nome;
    }

    public List<espaco> getListaEspacos() {
        return listaEspacos;
    }
    
    // Métodos de modificação
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setListaEspacos(List<espaco> listaEspacos) {
        this.listaEspacos = new ArrayList<>(listaEspacos);
    }

    // Objetos da lista de espaços
    public void addEspaco(sala sala) {
        listaEspacos.add(new sala(sala));
    }

    public void addEspaco(hall hall) {
        listaEspacos.add(new hall(hall));
    }

    public void addEspaco(auditorio auditorio) {
        listaEspacos.add(new auditorio(auditorio));
    }

    public void addEspaco(pavilhao pavilhao) {
        listaEspacos.add(new pavilhao(pavilhao));
    }

    // Métodos de função
    /**
     * Faz uma representação textual da informação.
     * @return informação em memória
     */
    @Override
    public String toString() {
        return "Centro de Congressos: " +nome +"\nLista dos espaços: " + "\n" + criarListaEspacos();
    }

    /**
     * Cria uma lista de todos os espaços.
     * @return lista de espaços
     */
    private String criarListaEspacos() {
        String lista = "";
        for (espaco e : listaEspacos) {
            lista += e + "\n";
        }
        return lista;
    }

    /**
     * Calcula o total de receitas referente aos alugueres efectuados.
     * @return valor das receitas do Centro de Congressos
     */
    public double calcularReceitas() {
        double totalReceitas = 0;
        for (espaco espaco : listaEspacos) {
            totalReceitas += espaco.calcularCustoFinal();
        }
        return totalReceitas;
    }

}