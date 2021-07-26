package ems.model;
// STATUS: DONE
// ISSUES: NONE

import ems.model.user.ESE;
import java.io.Serializable;

/**
 * Class that represents an assignment between an ESE and a event application.
 * @author 1DK_1150475_1161975_1161976
 */
public class EventAssignment implements Serializable {
    
    // Class variables
    private Event event;
    private ESE ese;
    
    public EventAssignment(Event event, ESE ese){
        this.event = event;
        this.ese = ese;
    }

    public Event getEvent() {
        return event;
    }

    public ESE getESE() {
        return ese;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public void setESE(ESE ese) {
        this.ese = ese;
    }
    
    @Override
    public String toString(){
        return String.format("EVENT #%d is assigned to ESE %s.", getEvent().getEventID(), getESE().getName());
    }
    
}