package wheelsgrandprize.Frontend;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JFileChooser;
import wheelsgrandprize.Backend.OperationsLogic;
import wheelsgrandprize.Backend.LocalData;

/**
 * Runtime Console controller class.
 * @author João Borges <1150475@isep.ipp.pt>
 */
public class Controller {
    
    private final Console cnsl;
    private final LocalData lockedMemory;
    private final JFileChooser filePane = new JFileChooser();
    private static final String RUNTIME_ERROR = "WARNING: Function not implemented yet!";
    
    Controller(Console cnsl, LocalData localMemory) {
        this.cnsl = cnsl;
        this.lockedMemory = localMemory;
    }
    
    public void tower() throws FileNotFoundException, IOException, InterruptedException {
        if(cnsl.getMenuButton().isEnabled() == false) {
            cnsl.getMenuButton().setEnabled(true);
            switch(cnsl.getInput()) {
                case "1":
                    cnsl.setOutput("Importing participant data...");
                    filePane.showOpenDialog(cnsl);
                    File toRead = filePane.getSelectedFile();
                    if(OperationsLogic.importParticipantsFromFile(toRead) == true){
                        cnsl.setOutput("Import successful!");
                        break;
                    } else {
                        cnsl.setOutput("Import canceled or failed!\n\nPlease, check app logs for details.");
                        break;
                    }
                case "2":
                    String call = OperationsLogic.listAllParticipantsInfo();
                    if(call.equalsIgnoreCase("")) {
                        cnsl.setOutput("No data available to show!\n\nPlease, import participants to use this command.");
                        break;
                    } else {
                        call = "Listing all participants...\n\nMEMBER NUMBER | FULL NAME | CAR BRAND | CAR DATE\n" + call;
                        cnsl.setOutput(call);
                        break;
                    }
                case "3":
                    cnsl.setOutput("Changing participant information...\n\nPlease, insert 'option, member number, change' and press ENTER.\nREMEMBER that member numbers can't be modified.\n\nOPTIONS\nChange participant:\n1 - Name\n2 - Car brand\n3 - Car date");
                    cnsl.cleanInput();
                    cnsl.getEnterButton().addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String input = cnsl.getInput();
                            String[] inputSplit = input.split(",");
                            if(OperationsLogic.changeParticipantInfo(inputSplit[0], inputSplit[1], inputSplit[2]) == true){
                                cnsl.setOutput("Changing participant information...\nOperation successful!");
                            } else cnsl.setOutput("Changing participant information...\nAn error has occurred! Please, check app logs and go back to try again.");
                            cnsl.getEnterButton().removeActionListener(this);
                        }
                    });
                    break;
                case "4":
                    cnsl.setOutput(RUNTIME_ERROR);
                    break;
                case "5":
                    cnsl.setOutput(RUNTIME_ERROR);
                    break;
                case "6":
                    cnsl.setOutput(RUNTIME_ERROR);
                    break;
                case "7":
                    cnsl.setOutput(RUNTIME_ERROR);
                    break;
                case "8":
                    cnsl.setOutput(RUNTIME_ERROR);
                    break;
                case "9":
                    cnsl.setOutput(RUNTIME_ERROR);
                    break;
                case "10":
                    cnsl.setOutput(RUNTIME_ERROR);
                    break;
                case "11":
                    cnsl.setOutput(RUNTIME_ERROR);
                    break;
                case "12":
                    cnsl.setOutput(RUNTIME_ERROR);
                    break;
                case "13":
                    cnsl.setOutput(RUNTIME_ERROR);
                    break;
                case "q":
                    cnsl.setOutput("Closing...");
                    cnsl.dispose();
                    break;
                case "Q":
                    cnsl.setOutput("Closing...");
                    cnsl.dispose();
                    break;
                default:
                    cnsl.setOutput("Invalid option! Please, go back and try again.");
            }
        }
    }
    
}