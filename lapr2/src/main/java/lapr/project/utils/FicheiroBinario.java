/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import lapr.project.model.CentroExposicoes;

/**
 *
 * @author grupo18
 */
public class FicheiroBinario {
    
    private final CentroExposicoes centroExposicoes;
    private final String NOME_FICHEIRO = "dados.bin";

    /**
     * Construtor com centro
     *
     * @param centro
     */
    public FicheiroBinario(CentroExposicoes centro) {
        this.centroExposicoes = centro;
    }

    /**
     * método lê o ficheiro
     *
     * @param nomeFicheiro
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ClassNotFoundException
     */

    public CentroExposicoes ler(String nomeFicheiro) throws FileNotFoundException,
            IOException, ClassNotFoundException {
        CentroExposicoes centro = null;
        if (nomeFicheiro == null) {
            nomeFicheiro = NOME_FICHEIRO;
        }

        FileInputStream ficheiro = new FileInputStream(nomeFicheiro);
        ObjectInputStream obj = new ObjectInputStream(ficheiro);
        centro = (CentroExposicoes) obj.readObject();
        obj.close();
        ficheiro.close();

        return centro;
    }

    /**
     * grava o ficheiro já lido
     *
     * @param nomeFicheiro
     * @return
     * @throws IOException
     */

    public boolean gravar(String nomeFicheiro) throws IOException {
        if (nomeFicheiro == null) {
            nomeFicheiro = NOME_FICHEIRO;
            return false;
        }

        FileOutputStream ficheiro = new FileOutputStream(nomeFicheiro);
        ObjectOutputStream obj = new ObjectOutputStream(ficheiro);
        obj.writeObject(centroExposicoes);
        obj.close();
        ficheiro.close();
        return true;
    }

    /**
     * devolve o nome do ficheiro
     *
     * @return
     */
    public String getNomeFicheiroBase() {
        return this.NOME_FICHEIRO;
    }
    
}
