/**
 * @author João Borges, 1150475
 */
package cumprimentar;

public class TesteCumprimentar {
    
    public static void main (String [] args){
        Cumprimentar testeCumprimentar = new Cumprimentar("João", 19);
        System.out.println("O nome é " +testeCumprimentar.getName() +".");
        System.out.println("A idade é " +testeCumprimentar.getAge() +" anos.");
        System.out.println(testeCumprimentar.toString());
        System.out.println("---FUNÇÃO PRINCIPAL---");
        System.out.println(testeCumprimentar.hello());        
    }
    
}