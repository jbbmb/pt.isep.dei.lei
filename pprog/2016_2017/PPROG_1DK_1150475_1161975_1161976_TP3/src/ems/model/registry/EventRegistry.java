package ems.model.registry;
// STATUS: DONE
// ISSUES: NONE

import ems.model.Event;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that registries all fair center events.
 * @author 1DK_1150475_1161975_1161976
 */
public class EventRegistry implements Registry, Serializable {
    
    private final List<Event> eventList;
    
    public EventRegistry(){
        this.eventList = new ArrayList<>();
    }
    
    public List<Event> getEventList() {
        return eventList;
    }
    
    public void addEvent(Event event){
        if (!validate(event)){
            this.eventList.add(event);
        }
    }
    
    public boolean validate(Event event){
        return this.eventList.contains(event);
    }
    
}