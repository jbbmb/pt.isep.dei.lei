package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Grupo 18_LAPR2 15-16
 */
public class RegistoUtilizadores implements Serializable {

    private List<Utilizador> listaUtilizadores;
    private List<Utilizador> listaUtilizadoresNaoRegistados;
    private Utilizador u;

    /**
     * Construtor vazio que serve para inizializar as variaveis
     */
    public RegistoUtilizadores() {
        listaUtilizadores = new ArrayList<>();
        listaUtilizadoresNaoRegistados = new ArrayList<>();
    }

    /**
     * Construtor que recebe duas variaveis do tipo List<Utilizador>
     *
     * @param listaUtilizadores variavel que contem a lista de utilizadores
     * @param listaUtilizadoresNaoRegistados variavel que contem a lista de
     * utilizadores nao registados
     */
    public RegistoUtilizadores(List<Utilizador> listaUtilizadores, List<Utilizador> listaUtilizadoresNaoRegistados) {
        this.listaUtilizadores = listaUtilizadores;
        this.listaUtilizadoresNaoRegistados = listaUtilizadoresNaoRegistados;
    }

    /**
     * Metodo que serve para obter a lista de utilizadores
     *
     * @return uma lista de utilizadores
     */
    public List<Utilizador> getListaUtilizadores() {
        return listaUtilizadores;
    }

    /**
     * Metodo que serve para alterar a lista de utilizadores por outra lista de
     * utilizadores
     *
     * @param listaUtilizadores variavel do tipo List<Utilizador> que contem a
     * nova lista de Utilizadores
     */
    public void setListaUtilizadores(List<Utilizador> listaUtilizadores) {
        this.listaUtilizadores = listaUtilizadores;
    }

    /**
     * Metodo que serve para obter a lista de utilizadores não registados
     *
     * @return uma lista de utilizadores não registados
     */
    public List<Utilizador> getListaUtilizadoresNaoRegistados() {
        return listaUtilizadoresNaoRegistados;
    }

    /**
     * Metodo que serve para alterar a lista de utilizadores por outra lista de
     * utilizadores não registados
     *
     * @param listaUtilizadoresNaoRegistados variavel do tipo List<Utilizador>
     * que contem a nova lista de Utilizadores não registados
     */
    public void setListaUtilizadoresNaoRegistados(List<Utilizador> listaUtilizadoresNaoRegistados) {
        this.listaUtilizadoresNaoRegistados = listaUtilizadoresNaoRegistados;
    }

    /**
     * Metodo que serve para obter o utilizador caso este esteja na lista
     *
     * @param username variavel do tipo string que contem o username do
     * utilizador
     * @return
     */
    public Utilizador getUtilizador(String username) {
        for (Utilizador utilizador : listaUtilizadores) {
            if (utilizador.getUsername().equals(username)) {
                return utilizador;
            }
        }
        return null;
    }

    /**
     * Metodo que serve para criar um novo Utilzidor
     *
     * @return os dados do novo utilizador
     */
    public Utilizador novoUtilizador() {
        return new Utilizador();
    }

    public void addNovoUtilizador(Utilizador u){
        this.listaUtilizadoresNaoRegistados.add(u);
    }
    public boolean valida(Utilizador u) {
        for (int i = 0; i < listaUtilizadores.size(); i++) {
            if (u.equals(listaUtilizadores.get(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Verifica se dois utilizadores são iguais
     *
     * @param obj
     * @return
     */
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
        return true;
    }

    //FALTA COMPLETAR
    public void encriptarDados(Utilizador u) {

    }

    public boolean validaUtilizador(Utilizador utilizador) {
    
        if(utilizador.validaUtilizador()){
            if(valida(utilizador)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
              
        
    }


    public String getNovoUtilizador(String username) {
        for (Utilizador u : listaUtilizadoresNaoRegistados) {
            if (u.getUsername().equals(username)) {
                return u.toString();
            }
        }
        return "Não encontrado";
    }

    public void confirmaUtilizador(String username) {
        int posicao = 0;
        while (!listaUtilizadoresNaoRegistados.get(posicao).getUsername().equals(username)) {
            posicao++;
        }
        listaUtilizadores.add(listaUtilizadoresNaoRegistados.get(posicao));
        listaUtilizadoresNaoRegistados.remove(posicao);
    }

    public void alterarUtilizador(Utilizador utilizadorOriginal, Utilizador utilizadorAlterado) {
        int posicao = 0;
        while(!this.listaUtilizadores.get(posicao).equals(utilizadorOriginal)){
            posicao++;
        }
        listaUtilizadores.add(posicao, utilizadorAlterado);
    }

}


