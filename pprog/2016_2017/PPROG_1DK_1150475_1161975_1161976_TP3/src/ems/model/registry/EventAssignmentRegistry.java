package ems.model.registry;
// STATUS: DONE
// ISSUES: NONE

import ems.model.EventAssignment;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that registries assignments between ESEs and events.
 * @author 1DK_1150475_1161975_1161976
 */
public class EventAssignmentRegistry implements Registry, Serializable {
    
    private final List<EventAssignment> eventAssignmentList;
    
    public EventAssignmentRegistry(){
        this.eventAssignmentList = new ArrayList<>();
    }
    
    public List<EventAssignment> getEventAssignmentList() {
        return eventAssignmentList;
    }
    
    public void addAssignment(EventAssignment assignment){
        if (!validate(assignment)){
            this.eventAssignmentList.add(assignment);
        }
    }
    
    public boolean validate(EventAssignment assignment){
        return this.eventAssignmentList.contains(assignment);
    }
    
}