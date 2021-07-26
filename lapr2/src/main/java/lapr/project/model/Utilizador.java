package lapr.project.model;

import java.io.Serializable;
import java.util.Objects;

/** @author Grupo 18_LAPR2 15-16 */

public class Utilizador implements Serializable {

    private String nome;
    private String username;
    private String password;
    private String email;
    private String resposta;

    private static final String NOME_POR_OMISSAO = "Sem nome";
    private static final String MAIL_POR_OMISSAO = "Sem endereço de e-mail";
    private static final String USER_POR_OMISSAO = "Sem nome de utilizador";
    private static final String PASSWORD_POR_OMISSAO = "Sem palavra-passe";
    private static final String RESPOSTA_POR_OMISSAO = "Sem resposta de segurança";

    /**
     * Construtor com nome, username, password, e-mail e resposta de segurança
     *
     * @param nome
     * @param username
     * @param password
     * @param email
     * @param resposta
     */
    public Utilizador(String nome, String username, String password, String email, String resposta) {
        this.nome = nome;
        this.username = username;
        this.password = password;
        this.email = email;
        this.resposta = resposta;
    }

    /**
     * Construtor vazio
     */
    public Utilizador() {
        this.nome = NOME_POR_OMISSAO;
        this.email = MAIL_POR_OMISSAO;
        this.password = PASSWORD_POR_OMISSAO;
        this.username = USER_POR_OMISSAO;
        this.resposta = RESPOSTA_POR_OMISSAO;
    }
    
    public Utilizador(Utilizador user){
        this.nome = user.getNome();
        this.email = user.getEMAIL();
        this.password = user.getPASSWORD();
        this.username = user.getUsername();
        this.resposta = user.getRESPOSTA();
    }

    /**
     * Devolve o nome
     *
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Altera o nome
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Devolve o username
     *
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Altera o username
     *
     * @param USER
     */
    public void setUSER(String USER) {
        this.username = USER;
    }

    /**
     * Devolve a password
     *
     * @return password
     */
    public String getPASSWORD() {
        return password;
    }

    /**
     * Altera a password
     *
     * @param PASSWORD
     */
    public void setPASSWORD(String PASSWORD) {
        this.password = PASSWORD;

    }

    /**
     * Devolve o email
     *
     * @return
     */
    public String getEMAIL() {
        return email;
    }

    /**
     * Altera o email
     *
     * @param EMAIL
     */
    public void setEMAIL(String EMAIL) {
        this.email = EMAIL;

    }

    /**
     * Devolve a resposta de segurança do Utilizador
     *
     * @return
     */
    public String getRESPOSTA() {
        return resposta;
    }

    /**
     * Altera a resposta de segurança do Utilizador
     *
     * @param resposta
     */
    public void setRESPOSTA(String resposta) {
        this.resposta = resposta;
    }

    @Override
    public String toString() {
        return "Utilizador: \n"
                + "NOME=" + nome + ", USER=" + username + ", PASSWORD="
                + password + ", EMAIL=" + email + ", RESPOSTA DE SEGURANÇA=" + resposta;
    }

    public String[] getDadosUtilizador(){
        return new String[]{this.username, this.nome, this.email, this.resposta, this.password};
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
        final Utilizador other = (Utilizador) obj;
        if (!this.username.equals(other.username) || !this.email.equals(other.email) || !this.nome.equals(other.nome)) {
            return false;
        }
        return true;
    }

    

    /**
     * Metodo que valida o nome inserido pelo utilizador
     *
     * @param nome string que contem o nome do utilizador
     * @return true or false, dependendo do nome, podendo este ser válido(true)
     * ou inválido(false).
     */
    public boolean validaNome() {
        if (nome.length() < 1 || nome.contains("[0-9]")) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Metodo que valida o email inserido pelo utilizador
     *
     * @param email string que contem o email do utilizador
     * @return true or false, dependendo do email, podendo este ser válido(true)
     * ou inválido(false).
     */
    public boolean validaEmail() {
        if (email.length() < 1 || !email.contains("@")) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Metodo que valida a password inserida pelo utilizador
     *
     * @param password string que contem a password do utilizador
     * @return true or false, dependendo da password, podendo esta ser
     * válida(true) ou inválida(false).
     */
    public boolean validaPassword() {
        if (password.length() < 3) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Metodo que valida o username inserido pelo utilizador
     *
     * @param username string que contem o username do utilizador
     * @return true or false, dependendo do username, podendo este ser
     * válido(true) ou inválido(false).
     */
    public boolean validaUSER() {
        if (username.length() < 4) {
            return false;
        } else {
            return true;
        }
    }

    
    public boolean validaUtilizador() {
        return (validaUSER() && validaNome() && validaEmail() && validaPassword());
    }

}