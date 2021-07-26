/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spov;

import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.Math.log;
import static java.lang.StrictMath.log;
import static java.rmi.server.LogStream.log;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.Scanner;
import static sun.util.logging.LoggingSupport.log;

public class Utilitarios {

    public static void cabecalhoInicial() {
        System.out.printf("%-6s||%-30s||%-10s||%-12s%n", "ID", "NOME",
                "PARTIDO", "DATA NASC");
        System.out.println(
                "==========================…================================");
    }

    public static void pausa() {
        Scanner in = new Scanner(System.in);
        System.out.println("\n\nPara continuar digite ENTER\n");
        in.nextLine();
    }

    public static int pesquisarDeputadoPorID(String[][] deputados, String idDeputados, int nDeputados) {
        for (int i = 0; i < nDeputados; i++) {
            if (idDeputados.equalsIgnoreCase(deputados[i][0])) {
                return i;
            }
        }
        return -1;
    }

    public static boolean verificarID(String novoID, String idDeputado, int nDeputados, String[][] deputados) {
        if (novoID.length() != 5) {
            return false;
        } else {
            String letrasID = novoID.substring(0, 3);
            boolean d = eLetra(letrasID);
            if (d == true) {
                String numerosID = novoID.substring(3, 5);
                boolean f = eNumero(numerosID);
                if (f == true) {
                    for (int i = 0; i < nDeputados; i++) {
                        if (novoID.equalsIgnoreCase(deputados[i][0])) {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean verOID(String idDeputado, String idDeputado0, int nDeputados, String[][] deputados) {
        if (idDeputado.length() != 5) {
            return false;
        } else {
            String letrasID = idDeputado.substring(0, 3);
            boolean d = eLetra(letrasID);
            if (d == true) {
                String numerosID = idDeputado.substring(3, 5);
                boolean f = eNumero(numerosID);
                if (f == true) {
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean eLetra(String letrasID) {
        char[] c = letrasID.toCharArray();
        boolean d = true;
        for (int i = 0; i < c.length; i++) {
            if (Character.isDigit(c[i])) {
                return false;
            }
        }
        return d;
    }

    public static boolean eNumero(String letrasID) {
        char[] c = letrasID.toCharArray();
        boolean d = true;
        for (int i = 0; i < c.length; i++) {
            if (!Character.isDigit(c[i])) {
                return false;
            }
        }
        return d;
    }

    public static boolean verificarDataNascimento(String novaData) {
        if (novaData.length() != 8) {
            System.out.println("Data de nascimento inválida.");
            return false;
        } else {
            int ano = Integer.parseInt(novaData.substring(0, 4));
            int dia = Integer.parseInt(novaData.substring(novaData.length() - 2, novaData.length()));
            int mes = Integer.parseInt(novaData.substring(novaData.length() - 4, novaData.length() - 2));
            int maxDias = 0;
            Calendar cal = new GregorianCalendar(ano, mes, dia);
            Calendar now = new GregorianCalendar();
            int res = now.get(Calendar.YEAR) - cal.get(Calendar.YEAR);
            if ((cal.get(Calendar.MONTH) > now.get(Calendar.MONTH))
                    || (cal.get(Calendar.MONTH) == now.get(Calendar.MONTH)
                    && cal.get(Calendar.DAY_OF_MONTH) > now.get(Calendar.DAY_OF_MONTH))
                    || res < 0) {
                return false;
            }
            if (mes > 12) {
                return false;
            } else {
                int op = mes;
                switch (op) {
                    case 1:
                        maxDias = 31;
                        break;
                    case 2:
                        maxDias = 29;
                        break;
                    case 3:
                        maxDias = 31;
                        break;
                    case 4:
                        maxDias = 30;
                        break;
                    case 5:
                        maxDias = 31;
                        break;
                    case 6:
                        maxDias = 30;
                        break;
                    case 7:
                        maxDias = 31;
                        break;
                    case 8:
                        maxDias = 31;
                        break;
                    case 9:
                        maxDias = 30;
                        break;
                    case 10:
                        maxDias = 31;
                        break;
                    case 11:
                        maxDias = 30;
                        break;
                    case 12:
                        maxDias = 31;
                        break;
                }
                if (dia > maxDias) {
                    return false;
                } else {
                    return true;
                }
            }
        }
    }

    public static boolean verificarFicheiro(String nomeFicheiro) {
        File ficheiro = new File(nomeFicheiro);
        if (!ficheiro.exists()) {
            System.out.println("Ficheiro não existente.");
            return false;
        } else {
            return true;
        }
    }

    public static boolean verificarMemoria(int nVotos) {
        if (nVotos == 0) {
            System.out.println("Nao foi lido ou introduzido o ficheiro ou encontrava se vazio.");
            return false;
        } else {
            return true;
        }
    }

    public static void ordenarAlfabeticamente(String[][] deputados, int nDeputados) {
        int resultComparacao;
        for (int i = 0; i < nDeputados; i++) {
            for (int j = i + 1; j < nDeputados; j++) {
                resultComparacao = deputados[i][0].compareTo(deputados[j][0]);
                if (resultComparacao > 0) {
                    String[] aux = deputados[j];
                    deputados[j] = deputados[i];
                    deputados[i] = aux;
                }
            }
        }
    }

    public static void ordenarVotosDeputados(String[][] deputados, int nDeputados, String[] votos, int nVotos) {

        for (int i = 0; i < nVotos; i++) {
            for (int j = 0; j < nDeputados; j++) {
                String auxi = votos[i];
                if (auxi != null) {

                    if (auxi.substring(0, 5).equals(deputados[j][0])) {
                        String aux = votos[j];
                        votos[j] = votos[i];
                        votos[i] = aux;
                    }
                }
            }
        }

    }

    public static void ficarComAsVotacoes(String[] votos, int nDeputados) {
        for (int i = 0; i <= nDeputados; i++) {
            if (votos[i] == null) {
                votos[i] = "F";
            } else {
                votos[i] = votos[i].substring(votos[i].length() - 1, votos[i].length());
            }
        }
    }

    public static void primeiroEUltimoNome(String[][] deputados, int nDeputados, String[][] nomes) {
        for (int i = 0; i < nDeputados; i++) {
            String[] temp = deputados[i][1].split(" ");
            nomes[i][0] = temp[0];
            nomes[i][1] = temp[temp.length - 1];
        }
    }

    public static void cabecalhoVotos1() {
        System.out.printf("%-6s||%-30s||%-10s||%-12s%n", "ID", "NOME", "PARTIDO", "VOTO");
        System.out.println("==============================================================");
    }

    public static int contarPartidos(String[][] deputados, int nDeputados, String[] partidos, int nPartidos) {
        int p = 0;
        for (int i = 0; i < nDeputados; i++) {
            int aux = 0;
            String partido = deputados[i][2];
            for (int j = 0; j < nDeputados; j++) {
                if (partido.equalsIgnoreCase(partidos[j])) {
                    aux--;
                } else {
                    aux++;
                }
            }
            if (aux == nDeputados) {
                partidos[p] = partido;
                nPartidos++;
                p++;
            }
        }
        return nPartidos;
    }

    public static String[][] listarPartidos(String[][] deputados, int nDeputados, int nPartidos, String[][] listaDePartidos) {
        int p = 0;
        int aux = 0;
        for (int i = 0; i < nDeputados; i++) {
            String partido = deputados[i][2];
            for (int j = 0; j < nPartidos; j++) {
                if (partido.equalsIgnoreCase(listaDePartidos[j][0])) {
                    aux--;
                } else {
                    aux++;
                }
            }
            if (aux == nPartidos) {
                listaDePartidos[p][0] = partido;
                p++;
            }
            aux = 0;
        }
        return listaDePartidos;
    }

    public static String[][] contarDeputadosPartido(String[][] deputados, int nDeputados, int nPartidos, String[][] listaDePartidos) {
        for (int i = 0; i < nPartidos; i++) {
            int numeroDeputados = 0;
            for (int j = 0; j < nDeputados; j++) {
                if (listaDePartidos[i][0].equals(deputados[j][2])) {
                    numeroDeputados++;
                }
            }
            listaDePartidos[i][1] = Integer.toString(numeroDeputados);
        }
        return listaDePartidos;
    }

    public static String[][] ordenarPartidos(String[][] listaDePartidos, int nPartidos) {
        for (int i = 0; i < nPartidos; i++) {
            for (int j = i + 1; j < nPartidos; j++) {
                int numeroDeputados1 = Integer.parseInt(listaDePartidos[i][1]);
                int numeroDeputados2 = Integer.parseInt(listaDePartidos[j][1]);
                if (numeroDeputados1 < numeroDeputados2) {
                    String[] aux = listaDePartidos[i];
                    listaDePartidos[i] = listaDePartidos[j];
                    listaDePartidos[j] = aux;
                }
            }
        }
        return listaDePartidos;
    }

    public static String[][] listaDeputadosPartido(String[][] deputados, int nDeputados, int nPartidos, String[][] listaDePartidos, String[][] votosPartido, String[] votos) {
        for (int i = 0; i < nPartidos; i++) {
            int d = 0;
            for (int j = 0; j < nDeputados; j++) {
                String auxiliar = deputados[j][2];
                if (auxiliar.equals(listaDePartidos[i][0])) {
                    votosPartido[i][d] = votos[j];
                    d++;
                }
            }
        }
        return votosPartido;
    }

    public static String[][] corresponderVotacao(String[][] votosPartido, String[][] listaDePartidos, String[][] partidosVotos, int nPartidos) {
        int todosFavor = 0;
        int todosContra = 0;
        int todasAbstencoes = 0;
        for (int i = 0; i < nPartidos; i++) {
            int votosFavor = 0;
            int votosContra = 0;
            int votosAbstencoes = 0;
            for (int j = 0; j < votosPartido[j].length; j++) {
                String auxiliar = votosPartido[i][j];
                if ("S".equals(auxiliar)) {
                    votosFavor++;
                    todosFavor++;
                } else {
                    if ("N".equals(auxiliar)) {
                        votosContra++;
                        todosContra++;
                    } else {
                        if ("A".equals(auxiliar)) {
                            votosAbstencoes++;
                            todasAbstencoes++;
                        }
                    }
                }
            }
            partidosVotos[i][0] = listaDePartidos[i][0];
            partidosVotos[i][1] = Integer.toString(votosFavor);
            partidosVotos[i][2] = Integer.toString(votosContra);
            partidosVotos[i][3] = Integer.toString(votosAbstencoes);

        }
        String Totais = "Totais";
        partidosVotos[nPartidos][0] = Totais;
        partidosVotos[nPartidos][1] = Integer.toString(todosFavor);
        partidosVotos[nPartidos][2] = Integer.toString(todosContra);
        partidosVotos[nPartidos][3] = Integer.toString(todasAbstencoes);
        return partidosVotos;
    }

    public static int age(int y,int m,int d, String data) {
        y = Integer.parseInt(data.substring(0, 4));
        m = Integer.parseInt(data.substring(5, 6));
        d = Integer.parseInt(data.substring(7, 8));
        Calendar cal = new GregorianCalendar(y, m, d);
        Calendar now = new GregorianCalendar();
        int res = now.get(Calendar.YEAR) - cal.get(Calendar.YEAR);
        if ((cal.get(Calendar.MONTH) > now.get(Calendar.MONTH))
                || (cal.get(Calendar.MONTH) == now.get(Calendar.MONTH)
                && cal.get(Calendar.DAY_OF_MONTH) > now.get(Calendar.DAY_OF_MONTH))) {
            res--;
        }
        return res;
    }

    public static void Idade(String[][] deputados, int y, int m, int d) {
        for (int i = 0; i < deputados.length; i++) {
            if (deputados[i][3] != null) {
                deputados[i][3] = String.valueOf(age(y, m , d,deputados[i][3]));
            }
        }
    }

    public static String[][] contadorDeVotos(String[][] deputados, String[] votos,int y,int m,int d) {
        Utilitarios.Idade(deputados, y , m , d);
        String[] escolhas = new String[3];
        escolhas[0] = "S";
        escolhas[1] = "A";
        escolhas[2] = "C";
        String[][] finalizado = new String[5][3];
        finalizado[0][0] = "35";
        finalizado[0][1] = "35-60";
        finalizado[0][2] = "60+";
        int tot35 = 0;
        int tot65 = 0;
        int total65plus = 0;
        for (int j = 0; j < 3; j++) {
            String votacao = escolhas[j];
            int cont35 = 0;
            int cont3565 = 0;
            int cont65plus = 0;
            for (int i = 0; i < votos.length; i++) {
                if (votos[i] != null) {
                    String deputado = votos[i].substring(0, 5);
                    if (votos[i].substring(votos[i].length() - 1, votos[i].length()).equals(votacao)) {
                        int idade = Integer.parseInt(obterIdadePorID(deputado, deputados));
                        if (Integer.parseInt(obterIdadePorID(deputado, deputados)) < 35 && Integer.parseInt(obterIdadePorID(deputado, deputados)) > 12) {
                            cont35++;
                            tot35++;
                        }
                        if (Integer.parseInt(obterIdadePorID(deputado, deputados)) <= 60 && Integer.parseInt(obterIdadePorID(deputado, deputados)) > 35) {
                            cont3565++;
                            tot65++;
                        }
                        if (Integer.parseInt(obterIdadePorID(deputado, deputados)) > 60) {
                            cont65plus++;
                            total65plus++;
                        }
                    }
                }
                finalizado[j + 1][0] = String.valueOf(cont35);
                finalizado[j + 1][1] = String.valueOf(cont3565);
                finalizado[j + 1][2] = String.valueOf(cont65plus);
            }
        }
        finalizado[4][0] = Integer.toString(tot35);
        finalizado[4][1] = Integer.toString(tot65);
        finalizado[4][2] = Integer.toString(total65plus);

        return finalizado;
    }

    public static String obterIdadePorID(String ID, String[][] deputados) {
        for (int i = 0; i < deputados.length; i++) {
            if (deputados[i][0].equals(ID)) {
                String aux = deputados[i][3];
                return aux;
            }
        }
        return "-1";
    }

    public static void percentagens(String[][] Finalizado) {
        for (int i = 0; i < Finalizado[i].length; i++) {
            if (Integer.parseInt(Finalizado[4][i]) != 0) {
                double favor = ((Double.parseDouble(Finalizado[1][i])) / Double.parseDouble(Finalizado[4][i]) * 100);
                double abs = ((Double.parseDouble(Finalizado[2][i])) / Double.parseDouble(Finalizado[4][i]) * 100);
                double contra = ((Double.parseDouble(Finalizado[3][i])) / Double.parseDouble(Finalizado[4][i]) * 100);
                String faixaEt = Finalizado[0][i];
                System.out.println("Faixa Etaria de " + faixaEt + " : " + favor + "% de votos a favor." + " || " + abs + "% de abstençoes." + " || " + contra + "% de votos contra.");
            }
        }
    }
    
     public static Formatter criarFormatters(String nomeFicheiro) throws FileNotFoundException {
        Formatter form = new Formatter(new File(nomeFicheiro));
        return form;
    }

    public static void fecharFormatters(Formatter form) {
        form.close();
    }

    public static String[][] lerDeUmFicheiro(String nomeFicheiro, int nPartidos) throws FileNotFoundException {
        Scanner ler = new Scanner(new File("Resultados_" + nomeFicheiro));
        String[][] html = new String[nPartidos + 1][6];
        int cont = 0;
        int nDeputados = 0;
        while (ler.hasNext() && nDeputados < nPartidos + 2) {
            String linha = ler.nextLine();
            nDeputados++;
            cont = guardarDadosFicheiro(linha, html, cont);
        }
        return html;
    }

    public static int guardarDadosFicheiro(String linha, String[][] html, int cont) {
        String[] dividido = linha.split(";");
        if (dividido.length != 1) {
            html[cont][0] = dividido[0];
            html[cont][1] = dividido[1];
            html[cont][2] = dividido[2];
            html[cont][3] = dividido[3];
            html[cont][4] = dividido[4];
            html[cont][5] = dividido[5];
            cont++;
        }
        return cont;
    }
}

