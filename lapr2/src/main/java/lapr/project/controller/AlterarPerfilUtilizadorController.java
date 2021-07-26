package lapr.project.controller;

import java.io.Serializable;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Utilizador;

/**
 * @author Grupo 18_LAPR2 15-16
 */
public class AlterarPerfilUtilizadorController implements Serializable {

    private CentroExposicoes ce;
    private Utilizador utilizadorCopia;
    private Utilizador utilizadorAtual;
    private String username;

    

    /**
     * Construtor que recebe um username (do tipo String)
     *
     * @param username String que guarda o nome de utilizador
     */
    public AlterarPerfilUtilizadorController(CentroExposicoes ce, String username) {
        this.ce = ce;
        this.username = username;
        utilizadorAtual = ce.getRegistoUtilizador().getUtilizador(username);
        utilizadorCopia = new Utilizador(utilizadorAtual);
    }

    /**
     * Método que serve para obter os dados do utilizador
     */
    public String[] getDadosUtilizador(String username) {
        return utilizadorCopia.getDadosUtilizador();
    }

    /**
     * Metodo que serve para alterar os dados que o utilizador desejar
     *
     * @param nome String que contem o novo nome que o utilizador deseja inserir
     * e deste modo substituir o outro
     * @param email String que contem o novo email que o utilziador deseja
     * inserir e deste modo substituir o outro
     * @param password String que contem a nova password que o utilziador deseja
     * inserir e deste modo substituir a outra
     */
    public boolean setDadosAlterados(String username, String nome, String email, String resposta) {
        utilizadorCopia.setUSER(username);
        utilizadorCopia.setNome(nome);
        utilizadorCopia.setEMAIL(email);
        utilizadorCopia.setRESPOSTA(resposta);
        return ce.getRegistoUtilizador().validaUtilizador(utilizadorCopia);
    }


    /**
     * Metodo que serve para alterar a password do utilizador
     *
     * @param password string que contem a nova password do utilizador,
     * alterando a antiga
     */
    public void setPASSWORD(String password){
            
            utilizadorCopia.setPASSWORD(password);
    }
    
    public void registarUtilizadorAlterado(){
        ce.getRegistoUtilizador().alterarUtilizador(utilizadorAtual, utilizadorCopia);
    }

}
