/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import SOGE.CentroExposicoes;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Luis Gouveia
 */
public class FicheirosBinarios {

    private CentroExposicoes centroExposicoes;
    private final String NOME_FICHEIRO = "dados.bin";

    public FicheirosBinarios(CentroExposicoes centro) {
        this.centroExposicoes = centro;
    }

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

    public String getNomeFicheiroBase() {
        return this.NOME_FICHEIRO;
    }
}
