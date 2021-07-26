package ems.utils;
// STATUS: DONE
// ISSUES: NONE

import ems.model.Event;
import ems.model.FairCenter;
import ems.model.user.ESE;
import ems.model.user.EventManager;
import ems.model.user.Organizer;
import ems.model.user.Representative;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * Class that handles app data/registries.
 * @author 1DK_1150475_1161975_1161976
 */
public class AppDataAssistant {
    
    // Class variables
    private static final ImageIcon SETUP_ICON = new ImageIcon("src/ems/assets/setup.png");
    private static final ImageIcon CHECK_ICON = new ImageIcon("src/ems/assets/check.png");
    private static final ImageIcon ERROR_ICON = new ImageIcon("src/ems/assets/error.png");
    private static final File INTERNAL_BIN = new File("data/dataFile.bin");
    
    public static FairCenter appDataAssistant() throws FileNotFoundException, IOException, ClassNotFoundException {
        if(INTERNAL_BIN.exists() && !INTERNAL_BIN.isDirectory()) { 
            FairCenter newCenter = readBinFile(INTERNAL_BIN);
            return newCenter;
        } else {
            FairCenter newCenter = new FairCenter();
            JOptionPane.showMessageDialog(null, "Welcome to the Event Manager System!\nTo start, please import a valid text file containing user and event data.", "Setup Assistant", JOptionPane.ERROR_MESSAGE, SETUP_ICON);
            File importedFile = importFile();
            readTxtFile(newCenter, importedFile);
            writeBinFile(newCenter, INTERNAL_BIN);
            return newCenter;
        }
    }
    
    public static void saveChanges(FairCenter activeCenter) throws IOException{
        writeBinFile(activeCenter, INTERNAL_BIN);
    }
    
    public static void exportBinFile(File exportFile) throws IOException{
        Files.copy(INTERNAL_BIN.toPath(), exportFile.toPath());
    }
    
    public static void importExternalBin(File selectedBinFile) throws IOException{
        INTERNAL_BIN.delete();
        Files.copy(selectedBinFile.toPath(), INTERNAL_BIN.toPath());
    }
    
    public static void deleteBinFile(){
        INTERNAL_BIN.delete();
    }
    
    /**
     * Selects and returns the file with the needed information.
     * @return file with data
     */
    private static File importFile(){
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showDialog(null, "Import");
        switch (result) {
                    case JFileChooser.APPROVE_OPTION:
                        File selectedFile = fileChooser.getSelectedFile();
                        return selectedFile;
                    case JFileChooser.CANCEL_OPTION:
                        JOptionPane.showMessageDialog(null, "Setup Assistant canceled.\nPlease restart the app and try again.", "Error", JOptionPane.ERROR_MESSAGE, ERROR_ICON);
                        break;
                    case JFileChooser.ERROR_OPTION:
                        JOptionPane.showMessageDialog(null, "Unable to import the selected file.\nCheck file content and try again.", "Error", JOptionPane.ERROR_MESSAGE, ERROR_ICON);
                        break;
                }
        return null;
    }
    
    /**
     * Imports and instantiates internal objects from a text file.
     * @param fairCenter
     * @param importedFile
     * @throws FileNotFoundException 
     */
    private static void readTxtFile(FairCenter fairCenter, File importedFile) throws FileNotFoundException {
        Scanner inputFile = new Scanner(importedFile);
        while(inputFile.hasNext()){
            String line = inputFile.nextLine();
            if(line.equalsIgnoreCase("-FAIRCENTER")){
                fairCenter.setCenterName(inputFile.nextLine());
                fairCenter.setCenterAddress(inputFile.nextLine());
            } else if(line.equalsIgnoreCase("-ESE")){
                ESE foundESE = new ESE(inputFile.nextLine(), inputFile.nextLine());
                fairCenter.getUserRegistry().addUser(foundESE);
            } else if(line.equalsIgnoreCase("-EventManager")){
                EventManager foundEventManager = new EventManager(inputFile.nextLine(), inputFile.nextLine());
                fairCenter.getUserRegistry().addUser(foundEventManager);
            } else if(line.equalsIgnoreCase("-Organizer")){
                Organizer foundOrganizer = new Organizer(inputFile.nextLine(), inputFile.nextLine());
                fairCenter.getUserRegistry().addUser(foundOrganizer);
            } else if(line.equalsIgnoreCase("-Representative")){
                Representative foundRepresentative = new Representative(inputFile.nextLine(), inputFile.nextLine());
                fairCenter.getUserRegistry().addUser(foundRepresentative);
            } else if(line.equalsIgnoreCase("-Event")){
                Event foundEvent = new Event(fairCenter, inputFile.nextLine(), inputFile.nextLine(), inputFile.nextInt(), inputFile.nextInt(), inputFile.nextInt(), inputFile.nextInt(), inputFile.nextInt(), inputFile.nextInt(), inputFile.next(), inputFile.nextInt());
                fairCenter.getEventRegistry().addEvent(foundEvent);
            }
        }
        JOptionPane.showMessageDialog(null, "Import successful.", "Notification", JOptionPane.ERROR_MESSAGE, CHECK_ICON);
    }
    
    /**
     * Imports and instantiates internal objects from a binary file.
     * @param internalBin
     * @return 
     * @throws FileNotFoundException 
     * @throws java.lang.ClassNotFoundException 
     */
    private static FairCenter readBinFile(File internalBin) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream file_in = new FileInputStream(internalBin);
        ObjectInputStream object_in = new ObjectInputStream(file_in);
        Object abstractObject = object_in.readObject();
        if(abstractObject instanceof FairCenter){
            FairCenter fairCenter = (FairCenter) abstractObject;
            return fairCenter;
        }
        object_in.close();
        file_in.close();
        return null;
    }
    
    /**
     * Exports instantiated internal objects to a binary file.
     * @param fairCenter
     * @param internalBin
     * @throws java.io.FileNotFoundException
     */
    private static void writeBinFile(FairCenter fairCenter, File internalBin) throws FileNotFoundException, IOException {
        FileOutputStream file_out = new FileOutputStream(internalBin);
        ObjectOutputStream object_out = new ObjectOutputStream(file_out);
        object_out.writeObject(fairCenter);
        object_out.close();
        file_out.close();
    }
    
}