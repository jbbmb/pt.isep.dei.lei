package ems.controller;
// STATUS: DONE
// ISSUES: NONE

import ems.model.FairCenter;
import ems.utils.AppDataAssistant;
import java.io.File;
import java.io.IOException;

/**
 * Responsible for the control of the services UI.
 * @author 1DK_1150475_1161975_1161976
 */
public class ServicesController {
    
    // Class variables
    private final FairCenter fairCenter;
    
    public ServicesController(FairCenter fairCenter){
        this.fairCenter = fairCenter;
    }

    public FairCenter getActiveFairCenter() {
        return fairCenter;
    }
    
    public void exportAction(File exportFile) throws IOException{
        AppDataAssistant.exportBinFile(exportFile);
    }
    
    public void importAction(File selectedBinFile) throws IOException{
        AppDataAssistant.importExternalBin(selectedBinFile);
    }
    
    public void resetDatabase(){
       AppDataAssistant.deleteBinFile();
    }
    
}