package vencimentos;
/** @author João Borges, 1150475 */

public class TrabalhadorTestes {
    public static void main(String[] args) {
        
        TrabalhadorPeca p1 = new TrabalhadorPeca("Jorge Silva", 20, 30);
        TrabalhadorComissao p2 = new TrabalhadorComissao ("Susana Ferreira", 500, 6, 1500);
        TrabalhadorHora p3 = new TrabalhadorHora("Carlos Miguel", 160, (float)3.5);
        
        Object[] trabalhadores = new Object [10];
        trabalhadores[0] = p1;
        trabalhadores[1] = p2;
        trabalhadores[2] = p3;
        
        for(int i=0; i<trabalhadores.length; i++){
            if(trabalhadores[i]!=null){
                System.out.println(trabalhadores[i].toString() + "\n");
                System.out.println(trabalhadores[i]);
            }
        }
    }
}