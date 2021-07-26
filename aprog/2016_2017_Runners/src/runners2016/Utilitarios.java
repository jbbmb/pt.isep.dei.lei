/**
 * @author João Borges, 1150475
 * @version 1.0 ALPHA
 */
package runners2016;
// Projeto final de APROG 2016-2017

import java.util.Calendar;

public class Utilitarios {
    // Classe onde residem utilitários ao programa

    /**
     * Método que calcula a idade de uma pessoa tendo em conta a sua data de
     * nascimento
     * @return idade segundo o ano de nascimento e o ano atual
     */
    private static int calculoIdade(String anoMesDia) {
        int ano = Integer.parseInt(anoMesDia.substring(0, 4));
        int mes = Integer.parseInt(anoMesDia.substring(4, 6));
        int dia = Integer.parseInt(anoMesDia.substring(6, 8));
        Calendar hoje = Calendar.getInstance();
        int diaH = hoje.get(Calendar.DAY_OF_MONTH);
        int mesH = hoje.get(Calendar.MONTH) + 1;
        int anoH = hoje.get(Calendar.YEAR);
        if (mesH > mes || mesH == mes && diaH >= dia) {
            return anoH - ano;
        }
        return anoH - ano - 1;
    }

    /**
     * Verifica se um determinado nome contem apelido
     * @param nome
     * @param apelido
     * @return true se contém o apelido e false caso contrário
     */
    public static boolean verificaSeTemApelido(String nome, String apelido) {
// String implements CharSequence
        return nome.contains(apelido);
    }

    /**
     * Converter data no formato dd/mm/ano em aaaammdd
     * @param data data no formato dd/mm/ano
     * @return data no formato aaaammdd
     */
    public static String converterddmmaaaaParaaaammdd(String data) {
        String[] aux = data.trim().split("/");
        String dia = aux[0].length() < 2 ? "0" + aux[0] : aux[0];
        String mes = aux[1].length() < 2 ? "0" + aux[1] : aux[1];
        return aux[2] + mes + dia;
    }

    /**
     * Método que retorna a data atual no formato dd/MM/AA
     * @return void
     */
    private static void mostrarDataHoje() {
        // CÓDIGO AQUI
    }

    /**
     * Método que reduz o nome de uma pessoa ao primeiro nome e ao apelido
     * @return void
     */
    private static void reduzirNome() {
        // CÓDIGO AQUI
    }

    /**
     * Método que ordena uma matriz de Strings por coluna
     * @return void
     */
    private static void ordenarMatrizStrings() {
        // CÓDIGO AQUI
    }

}