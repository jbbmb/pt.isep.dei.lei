package ems.model;
// STATUS: DONE
// ISSUES: NONE

import java.io.Serializable;

/**
 * Class that represents the ESE decision towards the event application.
 * @author 1DK_1150475_1161975_1161976
 */
public class ApplicationDecision implements Serializable {
    
    // Class variables
    private boolean accepted;
    private String justification;
    
    public ApplicationDecision(boolean accepted, String justification){
        this.accepted = accepted;
        this.justification = justification;
    }
    
    public ApplicationDecision(){
        this.accepted = false;
        this.justification = null;
    }

    public boolean isAccepted() {
        return accepted;
    }

    public String getJustification() {
        return justification;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    public void setJustification(String justification) {
        this.justification = justification;
    }
    
    @Override
    public String toString(){
        if(isAccepted()){
            return String.format("\nAssigned FAE decided to ACCEPT this application.\nJustification: %s", getJustification());
        } else return String.format("\nAssigned FAE decided to DECLINE this application.\nJustification: %s", getJustification());
    }
    
}