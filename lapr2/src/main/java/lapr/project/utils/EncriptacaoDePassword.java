/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.utils;

/**
 *
 * @author grupo18
 */
public class EncriptacaoDePassword {

    public EncriptacaoDePassword() {
    }

    public String cifra(String password, int chave) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < password.length(); i++) {
            char c = (char) (password.charAt(i) + chave);
            builder.append(c);
        }

        return builder.toString();
    }
    
    public String decifra(String password, int chave){
        return cifra(password, -chave);
    }
}
