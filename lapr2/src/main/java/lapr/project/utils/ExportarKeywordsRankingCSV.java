/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lapr.project.model.Candidatura;
import lapr.project.model.Exposicao;
import lapr.project.model.Keywords;

/**
 *
 * @author grupo18
 */
public class ExportarKeywordsRankingCSV {

    private static final String NOME_FICHEIRO = "Palavras_Chave.csv";
    private static final String SEPARADOR = ",";
    private static final String ESPACAMENTO = "\n";
    private static final String CABECALHO = "Palavras-chave, NºOcorrências";

    public boolean criarDadosPalavraChave(List<Exposicao> listaExposicao, String path) {
        List<Keywords> listaKeywords = new ArrayList<>();
        for (Exposicao exposicao : listaExposicao) {
            for (Candidatura candidatura : exposicao.getListaCandidaturas().getListaCandidaturas()) {
                String descricao = candidatura.getDescricao();
                String[] array = descricao.split(",");
                for (String keyword : array) {
                    Keywords palavraChave = new Keywords(keyword);
                    if (listaKeywords.contains(palavraChave)) {
                        listaKeywords.get(listaKeywords.indexOf(palavraChave)).addOcorrencia();
                    } else {
                        listaKeywords.add(palavraChave);
                    }

                }
            }
        }
        Collections.sort(listaKeywords, (Keywords keyword1, Keywords keyword2)
                -> keyword1.getOcorrencias() - keyword2.getOcorrencias());
        return exportar(listaKeywords, path);
    }

    public static boolean exportar(List<Keywords> listaPalavrasChave, String path) {
        FileWriter file = null;
        try {
            file = new FileWriter(path);
            
            file.append(CABECALHO);
            file.append(ESPACAMENTO);

            for (Keywords keyword : listaPalavrasChave) {
                file.append(keyword.getPalavraChave());
                file.append(SEPARADOR);
                file.append(String.valueOf(keyword.getOcorrencias()));
                file.append(ESPACAMENTO);
            }
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            try {
                file.flush();
                file.close();
            } catch (IOException e) {
            }
        }
    }
}
