package wheelsgrandprize.Backend;

/**
 * Class responsible for creating and managing the database lists.
 * @author João Borges <1150475@isep.ipp.pt>
 */
public class LocalData {
    
    private static String participantsList[][];
    private static String racesList[][];
    private static String timesList[][];
    
    private static final int MAX_PARTICIPANTS_ALLOWED = 20;

    public LocalData() {
        LocalData.participantsList = new String[MAX_PARTICIPANTS_ALLOWED][4];
        LocalData.racesList = new String[50][2];
        LocalData.timesList = new String[MAX_PARTICIPANTS_ALLOWED][3];
    }

    public static String[][] getParticipantsList() {
        return participantsList;
    }

    public static String[][] getRacesList() {
        return racesList;
    }

    public static String[][] getTimesList() {
        return timesList;
    }

    public static int getMAX_PARTICIPANTS_ALLOWED() {
        return MAX_PARTICIPANTS_ALLOWED;
    }
    
    public static boolean participantsNotFull() {
        return (getParticipantsList().length <= MAX_PARTICIPANTS_ALLOWED);
    }
    
    public static int findParticipantByNumber(String memberNumber) {
        for (int i = 0; i < getParticipantsList().length; i++) {
            if(getParticipantsList()[i][0].equals(memberNumber)) {
                return i;
            }
        }
        return LocalData.getMAX_PARTICIPANTS_ALLOWED()+1;
    }
    
}