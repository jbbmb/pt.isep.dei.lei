package pl6;
/** @author João Borges, 1150475 */

import java.util.Scanner;

public class ex3 {
    
    public static void main(String[] args) {
        
        Scanner lerLados = new Scanner(System.in);
        System.out.println("Insira o valor do lado A:");
        double ladoA = lerLados.nextDouble();
        System.out.println("Insira o valor do lado B:");
        double ladoB = lerLados.nextDouble();
        System.out.println("Insira o valor do lado C:");
        double ladoC = lerLados.nextDouble();
        
        double anguloInternoLadoA = CalcularAnguloInternoLadoA(ladoA, ladoB, ladoC);
        double anguloInternoLadoB = CalcularAnguloInternoLadoB(ladoA, ladoB, ladoC);
        double anguloInternoLadoC = CalcularAnguloInternoLadoC(ladoA, ladoB, ladoC);
        
        System.out.println("Os ângulos internos são AB= " +anguloInternoLadoA +"º, AC= " +anguloInternoLadoC +"º, BC= " +anguloInternoLadoB +"º.");
    
    }
    
    public static double CalcularAnguloInternoLadoA(double ladoA, double ladoB, double ladoC){
        double anguloInternoLadoA = Math.acos((Math.pow(ladoA,2)+Math.pow(ladoB,2)-Math.pow(ladoC,2))/(2*ladoA*ladoB));
        double toDegreesA = Math.round(Math.toDegrees(anguloInternoLadoA));
        return toDegreesA;
    }
    
    public static double CalcularAnguloInternoLadoB(double ladoA, double ladoB, double ladoC){
        double anguloInternoLadoB = Math.acos((Math.pow(ladoA,2)+Math.pow(ladoC,2)-Math.pow(ladoB,2))/(2*ladoA*ladoC));
        double toDegreesB = Math.round(Math.toDegrees(anguloInternoLadoB));
        return toDegreesB;
    }
    
    public static double CalcularAnguloInternoLadoC(double ladoA, double ladoB, double ladoC){
        double anguloInternoLadoC = Math.acos((Math.pow(ladoB,2)+Math.pow(ladoC,2)-Math.pow(ladoA,2))/(2*ladoB*ladoC));
        double toDegreesC = Math.round(Math.toDegrees(anguloInternoLadoC));
        return toDegreesC;
    }
    
}