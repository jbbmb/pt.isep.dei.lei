package ems.model.registry;
// STATUS: DONE
// ISSUES: NONE

import ems.model.user.ESE;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that registries ESEs of an event.
 * @author 1DK_1150475_1161975_1161976
 */
public class EventESERegistry implements Registry, Serializable {
    
    private final List<ESE> eventESEList;
    
    public EventESERegistry(){
        this.eventESEList = new ArrayList<>();
    }
    
    public List<ESE> getEventESEList() {
        return eventESEList;
    }
    
    public void addESE(ESE ese){
        if (!validate(ese)){
            this.eventESEList.add(ese);
        }
    }
    
    public boolean validate(ESE ese){
        return this.eventESEList.contains(ese);
    }  
    
}