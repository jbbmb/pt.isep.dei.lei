package pl7;
/** @author João Borges, 1150475 */

import java.util.Scanner;

public class ex2 {

    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        int pos = 0;
        String nomes[] = new String[50];
        int vencimentos[] = new int[50];
        String m="\n---MENU---\n1- Registar nomes e vencimentos\n2- Listar funcionários com vencimentos inferiores à média\n3- Comparar vencimentos com um valor\n4- Terminar programa\n\nPor favor, escolha uma opção:";
        char op;
        do {
            System.out.println(m);
            op = ler.next().charAt(0);
            switch (op) {
                case '1':
                    System.out.println("\nAtenção: para terminar o registo de nomes e vencimentos introduza 'tt' no campo do nome.");
                    pos = registarNomesVenc(pos, nomes, vencimentos);
                    break;
                case '2':
                    int media = calculoMediaVencimentos(pos, vencimentos);
                    System.out.println("\nFuncionários com vencimento abaixo da média (" +media +" euros):");
                    for(int i = 0; i < pos; i++){
                        if(vencimentos[i] < media){
                            System.out.println(nomes[i]);
                        }
                    }
                    break;
                case '3':
                    float aux = percentagemAbaixoLim(pos, vencimentos);
                    System.out.println("\nPercentagem de funcionários com vencimento abaixo do valor definido: " +aux + "%");
                    break;
                case '4':
                    break;
                default:
                    System.out.println("Opção inválida!\n");
            }
        } while (op != '4');

    }

    private static int registarNomesVenc(int pos, String[] nomes, int[] vencimentos) {
        String nomeALer;
        int vencimentoALer;
        System.out.println("\nIntroduza o nome do funcionário:");
        nomeALer = ler.next();
        while(!nomeALer.equalsIgnoreCase("tt")){
            nomes[pos] = nomeALer;
            System.out.println("\nIntroduza o vencimento atual do funcionário:");
            vencimentoALer = ler.nextInt();
            vencimentos[pos] = vencimentoALer;
            System.out.println("\nIntroduza o nome do funcionário:");
            nomeALer = ler.next();
            pos++;
        }
        return pos;
    }
    
    private static int calculoMediaVencimentos(int pos, int[] vencimentos){
        int media = 0;
        for(int i = 0; i < pos; i++){
            media = media + vencimentos[i];
        }
        media = media/pos;
        return media;
    }
    
    private static float percentagemAbaixoLim(int pos, int[] vencimentos){
        float percentagem = 0;
        int numeroFuncAbaixoLim = 0;
        System.out.println("\nIntroduza o valor de vencimento mínimo pretendido:");
        int vencimentoMinimo = ler.nextInt();
            for(int i = 0; i < pos; i++){
                if(vencimentos[i] < vencimentoMinimo){
                    numeroFuncAbaixoLim++;
                }
            }
        percentagem = (float)numeroFuncAbaixoLim/pos*100;
        return percentagem;
    }

}