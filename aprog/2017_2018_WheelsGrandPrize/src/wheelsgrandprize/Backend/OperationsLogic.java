package wheelsgrandprize.Backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Class that defines basic in-app operations and logic.
 * @author João Borges <1150475@isep.ipp.pt>
 */
public class OperationsLogic {
    
    private static final String[][] PART_LIST = LocalData.getParticipantsList();
    private static final String[][] RACES_LIST = LocalData.getRacesList();
    private static final String[][] TIMES_LIST = LocalData.getTimesList();
    
    // USE CASE 1 - Read participant info from text file
    public static boolean importParticipantsFromFile(File toRead) throws FileNotFoundException, IOException {
        if(LocalData.participantsNotFull() == true) {
            if(toRead != null) {
                int aux = 0;
                Scanner scanner = new Scanner(toRead);
                while(scanner.hasNext()) {
                    String line = scanner.nextLine();
                    String[] lineSplit = line.split(";");
                    // check data here
                    PART_LIST[aux][0] = lineSplit[0];
                    PART_LIST[aux][1] = lineSplit[1];
                    PART_LIST[aux][2] = lineSplit[2];
                    PART_LIST[aux][3] = lineSplit[3];
                    aux++;
                }
                return true;
            } else return false;
        } else return false;
    }
    
    // USE CASE 2 - List all participants and their info
    public static String listAllParticipantsInfo() {
        String aux = "";
        for (int i = 0; i < PART_LIST.length; i++) {
            if(PART_LIST[i][0] == null){
                aux = aux + "";
            } else aux = aux + PART_LIST[i][0] + " | " + PART_LIST[i][1] + " | " + PART_LIST[i][2] + " | " + PART_LIST[i][3] + "\n";
        }
        return aux;
    }
    
    // USE CASE 3 - Change participant info
    public static boolean changeParticipantInfo(String option, String memberNumber, String change) {
        int pos = LocalData.findParticipantByNumber(memberNumber);
        if(pos < PART_LIST.length){
            switch(option) {
            case "1":
                PART_LIST[pos][1] = change;
                return true;
            case "2":
                PART_LIST[pos][2] = change;
                return true;
            case "3":
                PART_LIST[pos][3] = change;
                return true;
            default:
                return false;
            }
        } else return false;
    }
    
}