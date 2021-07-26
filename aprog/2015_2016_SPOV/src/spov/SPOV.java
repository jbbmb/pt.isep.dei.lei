package spov;
// Está nas transferências e correto ( só nao lê o ficheiro )

import java.io.File;
import java.util.Arrays;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class SPOV {

// Congiguração da aplicação
    public final static int MAX_DEPUTADOS = 230;
    public final static String FILE_DEPUTADOS = "Deputados.txt";
    public final static String PAGINA_HTML = "Pagina.html";
    public final static int MAX_LINHAS_PAGINA = 5;

    /**
     * Este método serve para ler o ficheiro que o utilizador definiu como
     * FILE_DEPUTADOS.
     *
     * @param deputados array de strings que guarda toda a informação lida do
     * ficheiro, se estas estiveram corretas.
     * @return retorna o número de Deputados com todas as informações corretas
     * no ficheiro.
     * @throws FileNotFoundException serve para o programa continuar a correr
     * caso encontre determinadas exceções.
     */
    public static int lerInfoFicheiro(String[][] deputados) throws FileNotFoundException {
        Scanner ler = new Scanner(new File(FILE_DEPUTADOS));
        Formatter erros = new Formatter(new File("LOG_ERROS_" + FILE_DEPUTADOS));
        int nDeputados = 0;
        int contLinha = 0;
        while (ler.hasNext() && nDeputados < MAX_DEPUTADOS) {
            String linha = ler.nextLine();
            if (linha.length() > 0) {
                contLinha++;
                nDeputados = guardarDadosDeputado(linha, deputados, nDeputados, erros, contLinha);
            }
        }
        erros.close();
        ler.close();
        return nDeputados;
    }

    /**
     * Este método serve para guarda toda a informação lida no ficheiro, só
     * guardando o que estiver dentro das regras previamente defenidas.
     *
     * @param linha É uma string que guarda uma linha de cada do ficheiro lido.
     * @param deputados array de strings que guarda toda a informação lida do
     * ficheiro, se estas estiveram corretas.
     * @param nDeputados número de Deputados com todas as informações corretas
     * no ficheiro.
     * @param erros erros que as linhas possam ter serão enviados para o a
     * string erros.
     * @param contLinha É um contador que serve para contar todas as linhas que
     * o ficheiro inicial tem, para dps mostrar ao utilizador, de uma forma mais
     * facilitada a linha, ou linhas, em que o ficheiro lido tem erros.
     * @return retorna o número de Deputados com todas as informações corretas
     * no ficheiro.
     */
    public static int guardarDadosDeputado(String linha, String[][] deputados, int nDeputados, Formatter erros, int contLinha) {
// separador de dados por linha
        String[] temp = linha.split(";");
        if (temp.length == 4) {
            String id = temp[0].trim();
            boolean verificar = Utilitarios.verificarID(id, id, nDeputados, deputados);
            if (verificar == true) {
                String novaData = temp[3].trim();
                boolean mudar = Utilitarios.verificarDataNascimento(novaData);
                if (mudar == true) {
                    deputados[nDeputados][0] = id;
                    deputados[nDeputados][1] = temp[1].trim();
                    deputados[nDeputados][2] = temp[2].trim();
                    deputados[nDeputados][3] = temp[3].trim();
                    nDeputados++;
                } else {
                    erros.format("%s%n", "Data de nascimento inválida, na leitura do ficheiro, " + "'" + FILE_DEPUTADOS + "'" + " : " + novaData + ". Linha : " + contLinha);
                }
            } else {
                erros.format("%s%n", "ID incorreto, na leitura do ficheiro, " + "'" + FILE_DEPUTADOS + "'" + " : " + id + ". Linha : " + contLinha);
            }
        } else {
            erros.format("%s%n", "Informação incorreta, na leitura do ficheiro, " + "'" + FILE_DEPUTADOS + "'" + ". Linha : " + contLinha);
        }
        return nDeputados;
    }

    /**
     * Este método serve para listar um determinado numero de Deputados de cada
     * vez, só mostrando os seguintes se o utilizador premir "Enter", ou seja,
     * lista a matriz dos deputados pagina a pagina.
     *
     *
     * @param matriz É a matriz que contém as informações dos deputados. É uma
     * cópia desta String[][] deputados.
     * @param nEl É o numero de deputados. É uma cópia dos nDeputados.
     */
    public static void listagemPaginada(String[][] matriz, int nEl) {
        int contPaginas = 0;
        for (int i = 0; i < nEl; i++) {
            if (i % MAX_LINHAS_PAGINA == 0) {
                if (contPaginas > 0) {
                    Utilitarios.pausa();
                }
                contPaginas++;
                System.out.println("\nPÁGINA: " + contPaginas);
                Utilitarios.cabecalhoInicial();
            }
            System.out.printf("%-6s||%-30s||%-10s||%-12s%n", matriz[i][0],
                    matriz[i][1], matriz[i][2], matriz[i][3]);
        }
    }

    /**
     * Este método serve para atualizar/trocar a informação de um determinado
     * deputado.
     *
     * @param idDeputado String que é introduzida pelo utilizar , para encontrar
     * o deputado com aquele id para dps alterar a informação
     * @param deputados string que contem toda a informação dos deputados, desde
     * o id até a data de nascimento.
     * @param nDeputados numero de deuputados;
     * @return true caso o idDeputado seja correspondentemente encontrado e a
     * informacao seja alterada corretamente, terminando desta forma o programa,
     * false quando nao encontra o id .
     */
    public static boolean actualizarDeputado(String idDeputado, String[][] deputados, int nDeputados) {
        int pos, nc, np, ntp;
        if ((pos = Utilitarios.pesquisarDeputadoPorID(deputados, idDeputado, nDeputados)) > -1) {
            System.out.printf("");
            Scanner in = new Scanner(System.in);
            int op;
            do {
                op = menuAtualizarDeputado(deputados[pos]);
                switch (op) {
                    case 1:
                        System.out.println("Novo nome:");
                        deputados[pos][1] = in.nextLine();
                        break;
                    case 2:
                        System.out.println("Nova data:");
                        String novaData = in.nextLine();
                        boolean mudar = Utilitarios.verificarDataNascimento(novaData);
                        if (mudar == true) {
                            deputados[pos][3] = novaData;
                        } else {
                            System.out.println("Data de nascimento inválida.");
                        }
                        break;
                    case 3:
                        System.out.println("Novo ID");
                        String novoID = in.nextLine();
                        boolean trocar = Utilitarios.verificarID(novoID, idDeputado, nDeputados, deputados);
                        if (trocar == true) {
                            deputados[pos][0] = novoID;
                        } else {
                            System.out.println("Este ID já existe. Tente de novo");
                        }
                        break;
                    case 4:
                        System.out.println("Novo partido");
                        deputados[pos][2] = in.nextLine();
                        break;
                    case 0:
                        System.out.println("Informação correta");
                        break;
                    default:
                        System.out.println("Opção incorreta");
                        break;
                }
            } while (op != 0);
        } else {
            System.out.printf("O deputado %s não foi encontrado!", idDeputado);
            return false;
        }
        return true;
    }

    /**
     * Este método serve para dar a informação ao utilizar das opções e suas
     * respetivas funcionalidades.
     *
     * @param deputado é a string que contem toda a informação do deputado
     * anteriormente selecionado pelo idDeputado
     * @return retorma o op para o método atualizar deputados, para este seguir
     * os varios casos que , dependendo do op , o metodo vai tomando varias
     * funcoes.
     */
    public static int menuAtualizarDeputado(String[] deputado) {
        System.out.printf("%6s-%30s-%7s-%12s%n",
                deputado[0], deputado[1], deputado[2], deputado[3]);
        String texto = "ATUALIZAR"
                + "\n NOME ... 1"
                + "\n DATA NASCIMENTO ... 2"
                + "\n ID DO DEPUTADO ... 3"
                + "\n PARTIDO ... 4"
                + "\n TERMINAR ... 0"
                + "\n\nQUAL A SUA OPÇÃO?";
        System.out.printf("%n%s%n", texto);
        Scanner in = new Scanner(System.in);
        int op = in.nextInt();
        in.nextLine();
        return op;
    }

    /**
     * Este método serve para ler um ficheiro que o utilizador pediu para ler
     * com as votações de uma determinada lei.
     *
     * @param votos string que vai conter o id e o voto de cada deputada na
     * lista do ficheiro da votação, guardando so aqueles que respeitam as
     * regras.
     * @param nomeFicheiro String que contemn o nome do ficheiro que o
     * utilizador anteriormente introduziu. Este é o ficheiro que vai ser lido
     * @param deputados string que contem toda a informaçao dos deputados.
     * @param nDeputados numero de deputados que foi lido no ficheiro com a
     * informacao dos deputados no topico 1.
     * @return retorna o numero de votos que respetivamente é o tamanha da
     * string votos.
     * @throws FileNotFoundException serve para , caso encontre algumas
     * excecoes, continuar a correr o programa.
     */
    public static int lerFicheiroDaVotacao(String[] votos, String nomeFicheiro, String[][] deputados, int nDeputados) throws FileNotFoundException {
        int nVotos = 0;
        Scanner ficheiro = new Scanner(new File(nomeFicheiro));
        Formatter erros = new Formatter(new File("LOG_ERROS_" + nomeFicheiro));
        int contLinha = 0;
        while (ficheiro.hasNext() && nVotos < MAX_DEPUTADOS) {
            String linha = ficheiro.nextLine();
            if (linha.length() > 0) {
                contLinha++;
                nVotos = guardarDadosDaVotacao(linha, votos, nVotos, deputados, erros, nDeputados, nomeFicheiro, contLinha);
            }
        }
        erros.close();
        ficheiro.close();
        return nVotos;
    }

    /**
     * Este metodo é invocado pelo metodo lerFiheiroDaVotacao e serve para
     * guardar toda a informacao correta do ficheiro da votacao anteriormente
     * introduzido.
     *
     * @param linha String que contem a informacao de cada linha, a vez, uma de
     * cada vez, do ficheiro da votacao.
     * @param votos string que vai guardar todos os votos corretos encontrados
     * no ficheiro de votacao.
     * @param nVotos Numero de votos lidos corretamente e respetivamente o
     * tamanho da string votos.
     * @param deputados string que contem toda a informacao dos deputados.
     * @param erros ficheiro criado para guardar todos os erros encontrados ao
     * ler o ficheiro de votacao e deste modo avisar o utilizar dos erros na
     * votacao.
     * @param nDeputados numero de deputados lidos no topico 1
     * @param nomeFicheiro String que contemn o nome do ficheiro que o
     * utilizador anteriormente introduziu. Este é o ficheiro que vai ser lido
     * @param contLinha Contador de inteiros que conta o numero de linhas que o
     * ficheiro tenha para dps ajudar o utilizador a encontrar mais facilmente o
     * erro no ficheiro de votacao.
     * @return o numero de votos corretamente lidos para o metodo
     * lerFicheiroDaVotacao.
     */
    public static int guardarDadosDaVotacao(String linha, String[] votos, int nVotos, String[][] deputados, Formatter erros, int nDeputados, String nomeFicheiro, int contLinha) {
        if (linha.length() == 6) {
            String idDeputado = linha.substring(0, 5);
            boolean verificar = Utilitarios.verOID(idDeputado, idDeputado, nDeputados, deputados);
            if (verificar == true) {
                for (int i = 0; i < nDeputados; i++) {
                    if (idDeputado.equals(deputados[i][0])) {
                        votos[nVotos] = linha;
                        nVotos++;
                    }
                }
            } else {
                erros.format("%s%n", "ID incorreto, na leitura do ficheiro " + "'" + nomeFicheiro + "'" + " : " + linha + ". Linha : " + contLinha);
            }
        } else {
            erros.format("%s%n", "Informação incorreta, na leitura do ficheiro, " + "'" + nomeFicheiro + "' : " + linha + ". Linha : " + contLinha);
        }
        return nVotos;
    }

    /**
     * Este método serve para listar
     *
     * @param deputados
     * @param nDeputados
     * @param votos
     * @param nVotos
     */
    public static void listarInfoVotos(String[][] deputados, int nDeputados, String[] votos, int nVotos) {
        String[][] nomes = new String[MAX_DEPUTADOS][2];
        Utilitarios.ordenarAlfabeticamente(deputados, nDeputados);
        Utilitarios.ordenarVotosDeputados(deputados, nDeputados, votos, nVotos);
        Utilitarios.ficarComAsVotacoes(votos, nDeputados);
        Utilitarios.primeiroEUltimoNome(deputados, nDeputados, nomes);
        listagemPaginadaDosVotos(deputados, nDeputados, votos, nomes);
    }

    /**
     *
     * @param deputados
     * @param nDeputados
     * @param votos
     * @param nomes
     */
    public static void listagemPaginadaDosVotos(String[][] deputados, int nDeputados, String[] votos, String[][] nomes) {
        int contPaginas = 0;
        for (int i = 0; i < nDeputados; i++) {
            if (i % MAX_LINHAS_PAGINA == 0) {
                if (contPaginas > 0) {
                    Utilitarios.pausa();
                }
                contPaginas++;
                System.out.println("\nPÁGINA: " + contPaginas);
                Utilitarios.cabecalhoVotos1();
            }
            System.out.printf("%-6s||%-30s||%-10s||%-8s%n", deputados[i][0], nomes[i][0] + " " + nomes[i][1], deputados[i][2], votos[i]);
        }
    }

    /**
     *
     * @param deputados
     * @param nDeputados
     * @param partidos
     * @param nPartidos
     * @param votos
     * @param nVotos
     * @param nomeFicheiro
     * @throws FileNotFoundException
     */
    public static void listarPartidos(String[][] deputados, int nDeputados, String[] partidos, int nPartidos, String[] votos, int nVotos, String nomeFicheiro) throws FileNotFoundException {
        nPartidos = Utilitarios.contarPartidos(deputados, nDeputados, partidos, nPartidos);
        String[][] listaDePartidos = new String[nPartidos][2];
        listaDePartidos = Utilitarios.listarPartidos(deputados, nDeputados, nPartidos, listaDePartidos);
        listaDePartidos = Utilitarios.contarDeputadosPartido(deputados, nDeputados, nPartidos, listaDePartidos);
        listaDePartidos = Utilitarios.ordenarPartidos(listaDePartidos, nPartidos);
        String[][] votosPartido = new String[nPartidos][Integer.parseInt(listaDePartidos[0][1])];
        Utilitarios.ordenarAlfabeticamente(deputados, nDeputados);
        Utilitarios.ordenarVotosDeputados(deputados, nDeputados, votos, nVotos);
        Utilitarios.ficarComAsVotacoes(votos, nDeputados);
        Utilitarios.listaDeputadosPartido(deputados, nDeputados, nPartidos, listaDePartidos, votosPartido, votos);
        String[][] partidosVotos = new String[nPartidos + 1][4];
        partidosVotos = Utilitarios.corresponderVotacao(votosPartido, listaDePartidos, partidosVotos, nPartidos);
        listagemFicheiroVotosPartidos(partidosVotos, nPartidos, nomeFicheiro);
    }

    /**
     *
     * @param partidosVotos
     * @param nPartidos
     * @param nomeFicheiro
     * @throws FileNotFoundException
     */
    public static void listagemFicheiroVotosPartidos(String[][] partidosVotos, int nPartidos, String nomeFicheiro) throws FileNotFoundException {
        System.out.println("Votação de : " + nomeFicheiro.substring(0, nomeFicheiro.length() - 4));
        Formatter ficheiro = new Formatter(new File("Resultados_" + nomeFicheiro));
        ficheiro.format("%s%n", "Votação de :" + nomeFicheiro.substring(0, nomeFicheiro.length() - 4));
        for (int i = 0; i < partidosVotos.length; i++) {
            ficheiro.format("%-15s||%-20s||%-20s||%-20s%n", partidosVotos[i][0], "Votos a favor : " + partidosVotos[i][1], "Votos contra : " + partidosVotos[i][2], "Abstenções: " + partidosVotos[i][3]);
            System.out.printf("%-15s||%-20s||%-20s||%-20s%n", partidosVotos[i][0], "Votos a favor : " + partidosVotos[i][1], "Votos contra : " + partidosVotos[i][2], "Abstenções: " + partidosVotos[i][3]);
        }
        ficheiro.close();
    }

    public static Scanner in = new Scanner(System.in);

    /**
     *
     * @return
     */
    public static int menu() {
        String texto = "\nMENU:"
                + "\n 1 -> Ler o ficheiro respeitante aos deputados."
                + "\n 2 -> Visualizar toda a informação sobre os deputados."
                + "\n 3 -> Alterar, em memória, a informação de um deputado."
                + "\n 4 -> Ler um ficheiro e guardar dados de uma determinada votação."
                + "\n 5 -> Listar as informações dos deputados e a sua votação."
                + "\n 6 -> Visualizar no ecrã os resultados da última votação e guardá-los num ficheiro de texto"
                + "\n 7 -> Apresentar resultados da votação em percentagem."
                + "\n 8 -> Criar página HTML com os dados do ponto 6."
                + "\n 0 -> Terminar"
                + "\nQual a sua opção?";
        System.out.printf("%n%s%n", texto);
        int op = in.nextInt();
        in.nextLine();
        return op;
    }

    /**
     *
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        String[][] deputados = new String[MAX_DEPUTADOS][4];
        String[] votos = new String[MAX_DEPUTADOS];
        char[] votacoes = new char[MAX_DEPUTADOS];
        String[] partidos = new String[MAX_DEPUTADOS];
        int nDeputados = 0;
        int nPartidos = 0;
        int nVotos = 0;
        String nomeFicheiro = "";
        int op;
        do {
            op = menu();
            switch (op) {
                case 1:
                    nDeputados = lerInfoFicheiro(deputados);
                    break;
                case 2:
                    if (Utilitarios.verificarMemoria(nDeputados)) {
                        listagemPaginada(deputados, nDeputados);
                    }
                    break;
                case 3:
                    if (Utilitarios.verificarMemoria(nDeputados)) {
                        System.out.println("Qual é o id do deputado?");
                        String idDeputado = in.next();
                        actualizarDeputado(idDeputado, deputados, nDeputados);
                    }
                    break;
                case 4:
                    if (Utilitarios.verificarMemoria(nDeputados)) {
                        System.out.println("Qual o ficheiro que pretende ler referente a uma determinada votação? ");
                        nomeFicheiro = in.next() + ".txt";
                        if (Utilitarios.verificarFicheiro(nomeFicheiro)) {
                            nVotos = 0;
                            votos = new String[MAX_DEPUTADOS];
                            nVotos = lerFicheiroDaVotacao(votos, nomeFicheiro, deputados, nDeputados);
                        }
                    }
                    break;
                case 5:
                    if (Utilitarios.verificarMemoria(nVotos)) {
                        nVotos = 0;
                        votos = new String[MAX_DEPUTADOS];
                        nVotos = lerFicheiroDaVotacao(votos, nomeFicheiro, deputados, nDeputados);
                        listarInfoVotos(deputados, nDeputados, votos, nVotos);
                    }
                    break;
                case 6:
                    if (Utilitarios.verificarMemoria(nVotos)) {
                        partidos = new String[MAX_DEPUTADOS];
                        nVotos = 0;
                        votos = new String[MAX_DEPUTADOS];
                        nVotos = lerFicheiroDaVotacao(votos, nomeFicheiro, deputados, nDeputados);
                        listarPartidos(deputados, nDeputados, partidos, nPartidos, votos, nVotos, nomeFicheiro);
                    }
                    break;
                case 7:
                    if (Utilitarios.verificarMemoria(nVotos)) {
                        nDeputados = 0;
                        deputados = new String[MAX_DEPUTADOS][4];
                        nDeputados = lerInfoFicheiro(deputados);
                        nVotos = 0;
                        votos = new String[MAX_DEPUTADOS];
                        nVotos = lerFicheiroDaVotacao(votos, nomeFicheiro, deputados, nDeputados);
                        String[] votosaux = Arrays.copyOf(votos, nVotos);
                        String[][] vecauxi = Arrays.copyOf(deputados, nDeputados);
                        int y = 0;
                        int m = 0;
                        int d = 0;
                        String[][] finalizado = Utilitarios.contadorDeVotos(vecauxi, votosaux, y, m, d);
                        System.out.println("Votação de : " + nomeFicheiro.substring(0, nomeFicheiro.length() - 4));
                        Utilitarios.percentagens(finalizado);
                    }
                    break;
                case 8:
                    if (partidos != null) {
                        if (Utilitarios.verificarMemoria(nVotos)) {
                            partidos = new String[MAX_DEPUTADOS];
                            nVotos = 0;
                            votos = new String[MAX_DEPUTADOS];
                            nVotos = lerFicheiroDaVotacao(votos, nomeFicheiro, deputados, nDeputados);
                            listarPartidos(deputados, nDeputados, partidos, nPartidos, votos, nVotos, nomeFicheiro);
//                            Formatter ficheiro = new Formatter(new File("Resultados_" + nomeFicheiro));
                            String[][] html = Utilitarios.lerDeUmFicheiro(nomeFicheiro, nDeputados);
                            String titulo = "Votaçao de : " + nomeFicheiro.substring(0, nomeFicheiro.length() - 4);
                            String nomeHTML = nomeFicheiro.substring(0, nomeFicheiro.length() - 4);
                            Formatter pag = Utilitarios.criarFormatters(nomeHTML + ".html");
                            HTML.iniciarPagina(pag, titulo);
                            HTML.cabecalho(pag, nPartidos, titulo);
                            HTML.iniciarTabela(pag);
                            HTML.corpoTabela(pag, html, nPartidos + 1);
                            HTML.fecharTabela(pag);
                            HTML.fecharPaginaComData(pag);
                            Utilitarios.fecharFormatters(pag);
                            System.out.println("Ficheiro HTML criado com sucesso!!");
                        }
                    }
                    break;
                case 0:
                    System.out.println("FIM");
                    break;
                default:
                    System.out.println("Opção incorreta. Repita");
                    break;
            }
        } while (op != 0);
    }
}
