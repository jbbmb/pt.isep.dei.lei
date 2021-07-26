package ems.controller;
// STATUS: DONE
// ISSUES: NONE

import ems.model.ApplicationDecision;
import ems.model.Event;
import ems.model.EventApplication;
import ems.model.FairCenter;
import ems.utils.AppDataAssistant;
import java.io.IOException;

/**
 * Class responsible for managing DecideExpo UI.
 * @author 1DK_1150475_1161975_1161976
 */
public class DecideExpoController {
    
    // Class variables
    private final FairCenter fairCenter;
    private Event activeEvent;
    private EventApplication activeApplication;
    
    public DecideExpoController(FairCenter fairCenter){
        this.fairCenter = fairCenter;
        this.activeEvent = null;
        this.activeApplication = null;
    }
    
    public Event getActiveEvent() {
        return activeEvent;
    }

    public EventApplication getActiveApplication() {
        return activeApplication;
    }
    
    public void setActiveEvent(Event activeEvent) {
        this.activeEvent = activeEvent;
    }

    public void setActiveApplication(EventApplication activeApplication) {
        this.activeApplication = activeApplication;
    }
    
    public void submitDecision(boolean accepted, String justificationText) throws IOException{
        ApplicationDecision submittedDecision = new ApplicationDecision(accepted, justificationText);
        getActiveApplication().setDecision(submittedDecision);
        AppDataAssistant.saveChanges(fairCenter);
    }
    
}