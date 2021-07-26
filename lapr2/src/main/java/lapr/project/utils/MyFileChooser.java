/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.utils;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author grupo18
 */
public class MyFileChooser extends JFileChooser {

    /**
     * Construtor vazio
     */
    public MyFileChooser() {
        super();
        definirFiltroBin();
    }

    /**
     * Método verifica se o ficheiro é binário , para tal tem de acabar em
     * ".bin"
     */
    private void definirFiltroBin() {
        setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File ficheiro) {
                if (ficheiro.isDirectory()) {
                    return true;
                }
                String extensao = encontraExtensao(ficheiro);
                if (extensao != null) {
                    return extensao.equals("bin");
                }
                return false;
            }

            @Override
            public String getDescription() {
                return "*.bin";
            }

            private String encontraExtensao(File ficheiro) {
                String ext = null;
                String s = ficheiro.getName();
                int i = s.lastIndexOf(".");
                if (i != -1) {
                    ext = s.substring(i + 1).toLowerCase();
                }
                return ext;
            }
        });
    }

}
