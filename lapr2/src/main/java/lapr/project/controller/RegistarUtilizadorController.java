package lapr.project.controller;

import java.io.Serializable;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.RegistoUtilizadores;
import lapr.project.model.Utilizador;

/**
 * @author Grupo 18_LAPR2 15-16
 */
public class RegistarUtilizadorController implements Serializable {

    private CentroExposicoes centroExposicoes;
    private Utilizador utilizador;
    private RegistoUtilizadores ru;

    public RegistarUtilizadorController(CentroExposicoes centroExposicoes) {
        this.centroExposicoes = centroExposicoes;
        ru = centroExposicoes.getRegistoUtilizador();
    }

    public void novoUtilizador() {
        utilizador = ru.novoUtilizador();
    }

    public boolean setDadosUtilizador(String nome, String username, String password,
            String email, String resposta) {
        utilizador.setNome(nome);
        utilizador.setUSER(username);
        utilizador.setEMAIL(email);
        utilizador.setPASSWORD(password);
        utilizador.setRESPOSTA(resposta);
        if (ru.validaUtilizador(utilizador)) {
            return true;
        } else {
            return false;
        }

    }

    public void registarUtilizador() {
        ru.addNovoUtilizador(utilizador);
       // ru.encriptarDados(utilizador);
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }


    public RegistoUtilizadores getRegistoUtilizadores() {
        return ru;
    }

}
