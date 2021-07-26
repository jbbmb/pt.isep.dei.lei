package ems.controller;
// STATUS: DONE
// ISSUES: NONE

import ems.model.Event;
import ems.model.EventApplication;
import ems.model.FairCenter;
import ems.model.user.User;
import ems.utils.AppDataAssistant;
import java.io.IOException;

/**
 * Class responsible for managing ApplyToEvent UI.
 * @author 1DK_1150475_1161975_1161976
 */
public class ApplyToEventController {
    
    // Class variables
    private final FairCenter fairCenter;
    private Event activeEvent;
    
    public ApplyToEventController(FairCenter fairCenter){
        this.fairCenter = fairCenter;
        this.activeEvent = null;
    }
    
    public User getRepresentative(){
        return fairCenter.getActiveUser();
    }

    public Event getActiveEvent() {
        return activeEvent;
    }

    public void setActiveEvent(Event activeEvent) {
        this.activeEvent = activeEvent;
    }
    
    public void submitEventApplication(String businessName, String businessAddress, String description, int phoneNumber, int wantedArea, int invitesNumber) throws IOException{
        EventApplication applicationAux = new EventApplication(fairCenter, businessName, businessAddress, description, phoneNumber, wantedArea, invitesNumber);
        getActiveEvent().getEventApplicationRegistry().addApplication(applicationAux);
        AppDataAssistant.saveChanges(fairCenter);
    }
    
}