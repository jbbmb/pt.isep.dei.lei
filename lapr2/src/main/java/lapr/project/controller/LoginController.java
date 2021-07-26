package lapr.project.controller;

import java.io.Serializable;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Utilizador;

/**
 * @author Grupo 18_LAPR2 15-16
 */
public class LoginController implements Serializable {

    private final CentroExposicoes centroExposicoes;

    public LoginController(CentroExposicoes centroExposicoes) {
        this.centroExposicoes = centroExposicoes;
    }

    public boolean validaLogin(String username, String password) {

        for (Utilizador utilizador
                : centroExposicoes.getRegistoUtilizador().getListaUtilizadores()) {

            if (utilizador.getUsername().equals(username)
                    && utilizador.getPASSWORD().equals(password)) {
                return true;
            }
        }

        return false;
    }

    public boolean validaIdentidade(String username, String respostaSeguranca) {

        for (Utilizador utilizador
                : centroExposicoes.getRegistoUtilizador().getListaUtilizadores()) {

            if (utilizador.getUsername().equals(username)
                    && utilizador.getRESPOSTA().equals(respostaSeguranca)) {
                return true;
            }
        }
        return false;
    }
    
}