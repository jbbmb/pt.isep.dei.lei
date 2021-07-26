/*
 * @author João Borges, 1150475
 * @version 1.0 ALPHA
 */
package runners2016;
// Projeto final de APROG 2016-2017

// Imports a declarar
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Runners2016 {

    // Valores estáticos a declarar
    private final static Scanner INPUT = new Scanner(System.in);
    private final static int MAX_LINHAS_PAGINA = 5;
    private final static int N_CAMPOS_INFO = 4;
    private static final int NUM_ATLETAS_LISTAR = 3;
    private final static int MAX_SOCIOS = 100;
    private final static int N_PROVAS = 5;
    private static final int ATLETA_INSCRITO = 0;
    private static final int ATLETA_N_INSCRITO = -1;

    // Método principal
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws FileNotFoundException, IOException {

        // Ponto de controlo de inicialização
        System.out.println("Bem-vindo ao Runners2016");

        // Variáveis e matrizes a declarar
        String[][] socios = new String[MAX_SOCIOS][N_CAMPOS_INFO]; // Informação dos sócios
        int[][] tempos = new int[MAX_SOCIOS][N_PROVAS]; // Tempos nas provas dos sócios
        int[] prova = new int[MAX_SOCIOS];
        int nSocios = 0; // Número total de sócios
        int opcao; // Opção selecionada pelo utilizador nos menus e submenus

        // Menu da aplicação
        do {
            opcao = menu();
            switch (opcao) {
                case 1: // Ler de um ficheiro de texto definido pelo utilizador a informação
                    nSocios = importarDadosSocio(nSocios, socios);
                    break;
                case 2: // Visualizar toda a informação dos sócios em memória
                    if (socios[0][0] == null){
                        System.out.println("\nImpossível mostrar dados! Não existe nenhum sócio registado.\nPressione ENTER para continuar...");
                        System.in.read();
                        break;
                    }
                    listarDadosSocio(nSocios, socios);
                    break;
                case 3: // Alterar nome ou data de nascimento de um dado sócio
                    if (socios[0][0] == null){
                        System.out.println("\nImpossível alterar dados! Não existe nenhum sócio registado.\nPressione ENTER para continuar...");
                        System.in.read();
                        break;
                    }
                    do {
                        opcao = submenu3();
                        switch (opcao) {
                            case 1: // NOME DO SÓCIO
                                alterarNomeSocio(nSocios, socios);
                                break;
                            case 2: // DATA DE NASCIMENTO DO SÓCIO
                                alterarDataSocio(nSocios, socios);
                                break;
                            case 3: // VOLTAR ATRÁS
                                break;
                            default: // OPÇÃO INVÁLIDA
                                System.out.println("\nOpção incorreta! Por favor, tente novamente.\nPressione ENTER para continuar...");
                                System.in.read();
                                break;
                        }
                    } while (opcao > 3);
                    break;
                case 4: // Ler de um ficheiro de texto as inscrições dos atletas numa determinada prova
                    importarDadosInscricao(prova);
                    break;
                case 5: // Ler um ficheiro de texto com os tempos realizados pelos atletas que participaram numa determinada prova
                    break;
                case 6: // Visualizar no ecrã ou guardar num ficheiro backup.txt toda a informação existente em memória
                    break;
                case 7: // Remover das estruturas de dados toda a informação relativa a um atleta
                    if (socios[0][0] == null){
                        System.out.println("\nImpossível eliminar dados! Não existe nenhum sócio registado.\nPressione ENTER para continuar...");
                        System.in.read();
                        break;
                    }
                    nSocios = removerAtleta(socios, nSocios, tempos);
                    break;
                case 8: // Visualizar no ecrã, para uma determinada prova cujo código é dado pelo utilizador, qual a média dos tempos
                    break;
                case 9: // Visualizar no ecrã para cada prova
                    do {
                        opcao = submenu9();
                        switch (opcao) {
                            case 1: // Percentagem de atletas inscritos e desses a percentagem de mulheres
                                break;
                            case 2: // Percentagem de inscritos que desistiram ou faltaram
                                break;
                            case 3: // VOLTAR ATRÁS
                                break;
                            default: // OPÇÃO INVÁLIDA
                                System.out.println("\nOpção incorreta! Por favor, tente novamente.\nPressione ENTER para continuar...");
                                System.in.read();
                                break;
                        }
                    } while (opcao > 3);
                    break;
                case 10: // Criar uma página HTML com a informação de todos os atletas
                    break;
                case 11: // SOBRE A APLICAÇÃO
                    System.out.println("\nRunners2016 v1.0 ALPHA por João Borges (1150475)\nProjeto final de Algoritmia e Programação 2016/2017\nLEI @ Instituto Superior de Engenharia do Porto, Portugal\n\nPressione ENTER para continuar...");
                    System.in.read();
                    break;
                case 12: // TERMINAR APLICAÇÃO
                    // Exportar erros?
                    System.out.println("\nPrograma terminado com sucesso. Obrigado por utilizar o Runners2016!");
                    break;
                default: // OPÇÃO INVÁLIDA
                    System.out.println("\nOpção incorreta! Por favor, tente novamente.\nPressione ENTER para continuar...");
                    System.in.read();
                    break;
            }

        } while (opcao != 12);

    } // Outros métodos a declarar a partir desta linha

    /**
     * Escreve o menu da aplicação e lê a escolha do utilizador
     *
     * @return opção escolhida
     */
    private static int menu() {
        System.out.println("\nMENU PRINCIPAL\n1- Importar dados de sócio\n2- Mostrar dados de todos os sócios\n3- Alterar dados de sócio\n4- Importar dados de inscrição a uma prova\n5- Importar dados de tempos de uma prova\n6- Visualizar ou guardar todos os dados\n7- Remover atleta da base de dados\n8- Calcular média dos tempos para uma prova\n9- Calcular estatísticas (em percentagem) de atletas\n10- Resumir toda a informação num ficheiro de texto\n11- Sobre a aplicação\n12- Terminar aplicação");
        System.out.println("\nOpção pretendida:");
        int opcao = INPUT.nextInt();
        return opcao;
    }

    /**
     * Escreve o submenu da opção 3 e lê a escolha do utilizador
     * @return opção escolhida
     */
    private static int submenu3() {
        System.out.println("\nSUBMENU 3 - Alterar informação de sócio:\n1- Alterar o nome\n2- Alterar a data de nascimento\n3- Voltar atrás");
        System.out.println("\nOpção pretendida:");
        int opcao = INPUT.nextInt();
        return opcao;
    }
    
    /**
     * Escreve o submenu da opção 9 e lê a escolha do utilizador
     *
     * @return opção escolhida
     */
    private static int submenu9() {
        System.out.println("\nSUBMENU 9 - Visualizar no ecrã para cada prova:\n1- Percentagem de atletas inscritos e desses a percentagem de mulheres\n2- Percentagem de inscritos que desistiram ou faltaram\n3- Voltar atrás");
        System.out.println("\nOpção pretendida:");
        int opcao = INPUT.nextInt();
        return opcao;
    }

    /**
     * NÃO SEI PARA QUE SERVE ISTO
     *
     * @return boa sorte com isso
     */
    private static int[][] criarIniciarMatrizTempos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Lê um ficheiro .txt dado pelo utilizador e importa os dados para a
     * aplicação
     *
     * @return true se a operação for concluída com sucesso, false caso
     * contrário
     */
    private static int importarDadosSocio(int nSocios, String[][] socios) throws IOException {
        try {
            System.out.println("\nIntroduza o caminho para o ficheiro de texto a ler:");
            String caminho = INPUT.next();
            Scanner ficheiroImportar = new Scanner(new File(caminho));
            while (ficheiroImportar.hasNext()) {
                if (nSocios == MAX_SOCIOS) {
                    System.out.println("\nImpossível adicionar mais sócios. Quota máxima atingida!\nPressione ENTER para continuar...");
                    System.in.read();
                    break;
                }
                String info = ficheiroImportar.nextLine();
                String[] split = info.split(";");
                socios[nSocios][0] = split[0];
                socios[nSocios][1] = split[1];
                socios[nSocios][2] = split[2];
                socios[nSocios][3] = split[3];
                nSocios++;
            }
            System.out.println("\nImportação concluída com sucesso!\nPressione ENTER para continuar...");
            System.in.read();
        } catch (FileNotFoundException ex) {
            System.out.println("\nFalha na importação! Verifique se o caminho está correto ou se o ficheiro existe.\nPressione ENTER para continuar...");
            System.in.read();
        }
        return nSocios;
    }

    private static int importarDadosInscricao(int[] prova) throws IOException {
        int n = 1;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("\nIntroduza o nome do ficheiro de texto a ler:");
            String caminho = sc.nextLine();
            Scanner ficheiroImportar = new Scanner(new File(caminho));
            while (ficheiroImportar.hasNext()) {
                String info = ficheiroImportar.next();
                String[] split = info.split("\n");
                prova[n] = Integer.parseInt(split[0]);
                n++;
            }
            for (int i = 0; i < n; i++) {
                System.out.println(prova[n]);
            }
            System.out.println("\nImportação concluída com sucesso!\nPressione ENTER para continuar...");
            System.in.read();
        } catch (FileNotFoundException ex) {
            System.out.println("\nFalha na importação! Verifique se o caminho está correto ou se o ficheiro existe.\nPressione ENTER para continuar...");
            System.in.read();
        }
        return n;
    }

    private static void listarDadosSocio(int nSocios, String[][] socios) {
        int pag = 1;
        System.out.println();
        System.out.printf("%11s | %30s | %12s | %8s | %10s  (Pressione ENTER para continuar...)%n", "NIF", "NOME COMPLETO", "DATA DE NASCIMENTO", "SEXO", "PÁGINA: " + pag);
        System.out.printf("\n");
        INPUT.nextLine();
        for (int l = 0; l < nSocios; l++) {
            if ((l % NUM_ATLETAS_LISTAR) == 0 && l != 0) {
                INPUT.nextLine();
                pag++;
                System.out.printf("%78s%n", "===================================================================");
                System.out.println();
                System.out.printf("%13s | %28s | %11s | %11s | %13s  (Pressione ENTER para continuar...)%n", "NIF", "NOME COMPLETO", "DATA DE NASCIMENTO", "SEXO", "PÁGINA: " + pag);
                System.out.println();
            }
            for (int c = 0; c < N_CAMPOS_INFO; c++) {
                if (c == 1) {
                    System.out.printf("%30s|", socios[l][c].trim());
                } else {
                    System.out.printf("%14s|", socios[l][c].trim());
                }
            }
            System.out.printf("%n");
        }
        INPUT.nextLine();
    }

    private static void alterarNomeSocio(int nSocios, String[][] socios) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nInsira o nome do utilizador para o qual deseja alterar o nome:");
        String nome = sc.nextLine();
        int c = 0;
        for (int i = 0; i < nSocios; i++) {
            if (nome.equalsIgnoreCase(socios[i][1])) {
                System.out.println("\nInsira o novo nome:");
                String novo = sc.nextLine();
                socios[i][1] = novo;
                c = i;
            }
        }
        System.out.println("\nNova informação do Sócio : " + socios[c][0] + "; " + socios[c][1] + "; " + socios[c][2] + "; " + socios[c][3]);
    }

    private static void alterarDataSocio(int nSocios, String[][] socios) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nInsira o nome do utilizador para o qual deseja alterar a data de nascimento:");
        String nome = sc.nextLine();
        int c = 0;
        for (int i = 0; i < nSocios; i++) {
            if (nome.equalsIgnoreCase(socios[i][1])) {
                System.out.println("\nInsira a nova data de nascimento:");
                String novo = sc.next();
                socios[i][2] = novo;
                c = i;
            }
        }
        System.out.println("\nNova informação do Sócio : " + socios[c][0] + "; " + socios[c][1] + "; " + socios[c][2] + "; " + socios[c][3]);
    }

    public static int procurarNif(String[][] array, int num, String nif) {
        for (int i = 0; i < num; i++) {
            if (nif.equals(array[i][0])) {
                return i;
            }
        }
        return ATLETA_N_INSCRITO;
    }
    
    private static int removerAtleta(String[][] socios, int nSocios, int[][] tempos) throws IOException {
        int op;
        System.out.printf("\nInsira o NIF do atleta que deseja apagar:");
        String nif = "" + INPUT.nextInt();
        int posicaoAlterar = procurarNif(socios, nSocios, nif);
        if (posicaoAlterar != ATLETA_N_INSCRITO) {
            for (int i = 0; i < N_CAMPOS_INFO; i++) {
                System.out.print("  ");
                System.out.printf("%s | ", socios[posicaoAlterar][i]);
            }
            System.out.println();
            System.out.printf("É este o atleta que deseja eliminar?%n  ( 1 - Sim | 2 - Não | 0 - Cancelar )%n  Opção pretendida: ");
            do {
                op = INPUT.nextInt();
            } while (op != 0 && op != 1 && op != 2);
            switch (op) {
                case 0:
                    break;
                case 1:
                    for (int i = posicaoAlterar; i < nSocios - 1; i++) {
                        for (int j = i; j < nSocios; j++) {
                            socios[j] = socios[j + 1];
                            tempos[j] = tempos[j + 1];
                            return nSocios - 1;

                        }
                    }
                case 2: // Volta a pedir o NIF
                    removerAtleta(socios, nSocios, tempos);
            }
        } else {
            System.out.printf("O NIF introduzido não se encontra na base de dados!\nPressione ENTER para continuar...");
            System.in.read();
        }
        return nSocios;
    }

}