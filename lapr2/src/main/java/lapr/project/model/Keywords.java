/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.Objects;

/**
 *
 * @author grupo18
 */
public class Keywords {

    private String palavraChave;
    private int ocorrencias;

    public Keywords(String palavraChave, int ocorrencia) {
        this.palavraChave = palavraChave;
        this.ocorrencias = ocorrencia;
    }
    
    public Keywords(String palavraChave) {
        this.palavraChave = palavraChave;
        this.ocorrencias = 1;
    }

    public String getPalavraChave() {
        return palavraChave;
    }

    public void setPalavraChave(String palavraChave) {
        this.palavraChave = palavraChave;
    }

    public int getOcorrencias() {
        return ocorrencias;
    }

    public void setOcorrencias(int ocorrencias) {
        this.ocorrencias = ocorrencias;
    }

    public void addOcorrencia() {
        ocorrencias++;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Keywords other = (Keywords) obj;
        return Objects.equals(this.palavraChave, other.palavraChave);
    }

}
