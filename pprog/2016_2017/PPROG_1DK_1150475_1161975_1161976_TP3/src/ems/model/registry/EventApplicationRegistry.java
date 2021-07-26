package ems.model.registry;
// STATUS: DONE
// ISSUES: NONE

import ems.model.EventApplication;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that registries applications to event.
 * @author 1DK_1150475_1161975_1161976
 */
public class EventApplicationRegistry implements Registry, Serializable {
    
    private final List<EventApplication> eventApplicationList;
    
    public EventApplicationRegistry(){
        this.eventApplicationList = new ArrayList<>();
    }
    
    public List<EventApplication> getEventApplicationList() {
        return eventApplicationList;
    }
    
    public void addApplication(EventApplication application){
        if (!validate(application)){
            this.eventApplicationList.add(application);
        }
    }
    
    public boolean validate(EventApplication application){
        return this.eventApplicationList.contains(application);
    }
    
}