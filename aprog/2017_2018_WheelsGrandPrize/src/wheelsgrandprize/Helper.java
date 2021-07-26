package wheelsgrandprize;

import wheelsgrandprize.Backend.LocalData;
import wheelsgrandprize.Frontend.Console;

/**
 * The helper helps you test and run.
 * @author João Borges <1150475@isep.ipp.pt>
 */
public class Helper {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Runtime memory allocation
        LocalData allocatedMemory = new LocalData();
        
        // Runtime process
        java.awt.EventQueue.invokeLater(() -> {
            new Console(allocatedMemory).setVisible(true);
        });
        
    }
    
}