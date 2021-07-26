package nauticclub;
// Status: DONE
// Issues: repeated entries on c)

import java.util.List;
import java.util.ArrayList;

/**
 * Class dedicated to the testing of the NauticClub project.
 * @author João Borges, 1150475
 */
public class NauticClubTest {

    /**
     * Main method to execute.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Welcome to the Nautic Club Manager!\nv0.1 BETA (c) João Borges");
        
        // a)
        MinorMember minorMember1 = new MinorMember("Olivia", "538561946", "09/08/1999", "Paul");
        MinorMember minorMember2 = new MinorMember("Jane", "372946926", "12/02/1999", "Peter");
        MinorMember minorMember3 = new MinorMember("John", "972672782", "22/09/2001", "Paul");
        MinorMember minorMember4 = new MinorMember("Ana", "314842220", "18/11/1999", "Trixie");
        AdultMember adultMember1 = new AdultMember("Paul", "724565849", "08/08/1997");
        AdultMember adultMember2 = new AdultMember("Claudia", "998203819", "03/08/1993");
        AdultMember adultMember3 = new AdultMember("John", "190379840", "09/03/1984");
        AdultMember adultMember4 = new AdultMember("George", "489739834", "01/01/1987");
        SeniorMember seniorMember1 = new SeniorMember("Hudson", "453964263", "16/12/1955");
        SeniorMember seniorMember2 = new SeniorMember("Catia", "738649343", "29/05/1945");
        SeniorMember seniorMember3 = new SeniorMember("Beverly", "489781344", "12/05/1935");
        SeniorMember seniorMember4 = new SeniorMember("Zed", "746203874", "20/03/1925");
        System.out.println("\n12 members created succesfully.");
        
        // b)
        List<Member> listMembers = new ArrayList<>();
        listMembers.add(minorMember1);
        listMembers.add(minorMember2);
        listMembers.add(minorMember3);
        listMembers.add(minorMember4);
        listMembers.add(adultMember1);
        listMembers.add(adultMember2);
        listMembers.add(adultMember3);
        listMembers.add(adultMember4);
        listMembers.add(seniorMember1);
        listMembers.add(seniorMember2);
        listMembers.add(seniorMember3);
        listMembers.add(seniorMember4);
        System.out.println("12 members added to the Official List succesfully.");
        
        // Changes to check for every object outcome
        adultMember2.setIsClubLeader(true);
        seniorMember4.setIsClubLeader(true);
        minorMember2.addClass();
        adultMember3.addClass();
        System.out.println("\nChanges to check for every object outcome made.");
        
        // c)
        System.out.println("\n\nList of the existing minor guardians");
        String names []=new String[listMembers.size()];
        int count = 0;
        for (int i = 0; i < listMembers.size(); i++) {
            if(listMembers.get(i) instanceof MinorMember){
                MinorMember aux = (MinorMember) listMembers.get(i);
                names[i]=aux.getGuardianName();
                count++;
            }
        }
        for (int k = 0; k < count; k++) {
            int n = 1;
            for (int j = 0; j < k-1; j++) {
                if(names[j].equalsIgnoreCase(names[k])){
                    n++;
                }
            }
            System.out.println("Guardian's name: " +names[k] +" - Number of minors in charge: " +n);            
        }
        
        // d)
        System.out.println("\n\nList of existing members and their information");
        for (int i = 0; i < listMembers.size(); i++) {
            Member aux = listMembers.get(i);
            System.out.println("\n" + aux.toString());
        }
        System.out.println("\n\nStatistics");
        double youngTotal = 0;
        double seniorTotal = 0;
        for (int i = 0; i < listMembers.size(); i++) {
            if(listMembers.get(i) instanceof MinorMember){
                MinorMember aux = (MinorMember) listMembers.get(i);
                youngTotal = youngTotal + aux.getMonthlyDebt();
            }
        }
        for (int i = 0; i < listMembers.size(); i++) {
            if(listMembers.get(i) instanceof AdultMember){
                AdultMember aux = (AdultMember) listMembers.get(i);
                youngTotal = youngTotal + aux.getMonthlyDebt();
            }
        }
        for (int i = 0; i < listMembers.size(); i++) {
            if(listMembers.get(i) instanceof SeniorMember){
                SeniorMember aux = (SeniorMember) listMembers.get(i);
                seniorTotal = seniorTotal + aux.getMonthlyDebt();
            }
        }
        double total = (youngTotal + seniorTotal);
        System.out.println("TOTAL profit: " +total +"€");
        System.out.println("Profit from YOUNG members: " +youngTotal +"€ - " +((youngTotal/total)*100) +"% of total");
        System.out.println("Profit from SENIOR members: " +seniorTotal +"€ - " +((seniorTotal/total)*100) +"% of total");

        System.out.println("\nEnd of execution.");
        
    }
    
}