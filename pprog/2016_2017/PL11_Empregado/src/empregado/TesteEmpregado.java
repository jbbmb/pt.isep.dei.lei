package empregado;
// Class status: DONE

import java.util.ArrayList;
import java.util.List;
import utilitarios.Data;
import utilitarios.Time;

/**
 * @author João Borges, 1150475
 */
public class TesteEmpregado {

    /**
     * Main method to execute.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // a)
        Data currentDate = new Data();
        currentDate = Data.dataAtual();
        System.out.println("Current date: " + currentDate.toString() + "\n");
        
        // b)
        Time standardInTime = new Time(9);
        Time standardOutTime = new Time(18);
        
        // c) + g)
        Empregado employee1 = new Empregado("John", "Doe", currentDate, standardInTime, standardOutTime);
        Empregado employee2 = new Empregado("Jane", "Fritz", currentDate, standardInTime, standardOutTime);
        System.out.println(employee1.toString());
        System.out.println("\n" + employee2.toString());
        
        // d) + f)
        currentDate.setData(2011, 9, 22);
        System.out.println("\nWARNING: date changed!\nVerifying employee records...\n");
        System.out.println(employee1.toString());
        System.out.println("\n" + employee2.toString());
        
        // e) + f)
        standardInTime.setTempo(8, 0, 0);
        standardOutTime.setTempo(17, 0, 0);
        System.out.println("\nWARNING: working hours changed!\nVerifying employee records...\n");
        System.out.println(employee1.toString());
        System.out.println("\n" + employee2.toString());
        
        // h)
        Data newDate = new Data(2012, 5, 6);
        Time newInTime = new Time(10);
        Time newOutTime = new Time(20);
        employee2.changeContractDate(newDate);
        employee2.changeWorkingHours(newInTime, newOutTime);
        System.out.println("\nNew values for employee 2 in place...\n\n" + employee2.toString());
        
        // i)
        List<Empregado> listEmployees = new ArrayList<>();
        listEmployees.add(employee1);
        listEmployees.add(employee2);
        
        // j)
        System.out.println("\nListing all employee information stored:\n");
        for (int i = 0; i < listEmployees.size(); i++) {
            Empregado aux = listEmployees.get(i);
            System.out.println(aux.toString());
        }
        
        // k)
        System.out.println("\nStatistics:");
        for (int i = 0; i < listEmployees.size(); i++) {
            Empregado aux = listEmployees.get(i);
            
            System.out.println(aux.getFirstName() + " " + aux.getLastName() + " - Works " + aux.calculateWeeklyHours() + " hours a week and has been in the company for " + aux.timeEmployed() + " days.");
        }
        
    }
    
}