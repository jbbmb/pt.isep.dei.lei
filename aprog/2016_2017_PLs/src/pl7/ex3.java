package pl7;
/** @author João Borges, 1150475 */

import java.util.Scanner;

public class ex3 {
    
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = 0;
        String nomes[] = new String[100];
        String m="\n---MENU---\n1- Guardar nomes\n2- Listar nomes\n3- Enigma!\n4- Terminar programa\n\nPor favor, escolha uma opção:";
        char op;
        do {
            System.out.println(m);
            op = ler.next().charAt(0);
            switch (op) {
                case '1':
                    n = lerNomes(nomes);
                    break;
                case '2':
                    System.out.println("\nQuantos nomes deseja saber?");
                    ler = new Scanner(System.in);
                    n = ler.nextInt();
                    listar(nomes, n);
                    break;
                case '3':
                    System.out.println("\nFunção indisponível");
//                    System.out.println("\nNome:");
//                    String nome = ler.nextLine();
//                    n = enigma(nomes,nome,n);
                    break;
                case '4':
                    break;
                default:
                    System.out.println("Opção inválida!\n");
            }
        } while (op != '4');
}
    
    private static int lerNomes(String[] nomes) {
        int i = 0;
        String nomeALer;
        System.out.println("\nIntroduza os nomes a guardar. Para terminar escreva 'FIM'.");
        nomeALer = ler.next();
        while(!nomeALer.equalsIgnoreCase("fim")){
            nomes[i] = nomeALer;
            i++;
            System.out.println("\nIntroduza os nomes a guardar. Para terminar escreva 'FIM'.");
            nomeALer = ler.next();
        }
        return i;
    }
    
    private static void listar(String[] nomes, int n) {
            System.out.println("\nOs nomes guardados nas " +n +" primeiras posições são:");
            for(int i=0; i<n; i++){
                System.out.println(nomes[i]);
        }
    }
        
//    private static int enigma(String[] nomes, String nome, int n) { int i=0;
//        while(i<n && !nomes[i].equalsIgnoreCase(nome)) {
//            i++;
//        }
//        if(i==n) {
//            return n;
//        } else{
//            for (int j = i; j < n-1; j++)
//                nomes[j]=nomes[j+1];
//            return --n; }
//    }

}