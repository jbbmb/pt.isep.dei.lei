/**
 * @author João Borges, 1150475
 */
package tempo;

public class TesteTempo {

    public static void main(String[] args) {
        Tempo tempo1 = new Tempo(22,12,23);
        System.out.println(tempo1.getHour());
        System.out.println(tempo1.getMinute());
        System.out.println(tempo1.getSecond());
        tempo1.addSecond();
        System.out.println(tempo1.getHour());
        System.out.println(tempo1.getMinute());
        System.out.println(tempo1.getSecond());
        
    }
    
}